package com.levermann.keyFiguresForAnalysisOld;

import com.levermann.UpdateSteps.Eigenkapitalrendite;
import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.*;

import java.text.DecimalFormat;
import java.util.List;

public class KursGewinnVerhaeltnis {
    
    final static Logger logger = Logger.getLogger(Eigenkapitalrendite.class);

   public void KursGewinnVerhaeltnis () {
       //Logger wird für die Methode ausgeführt
       logger.info("Logger is Entering the Execute method from Create");
       String returnValue = "";

       System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");

       //Aufrufen der aktuellen Session aus HibernateUtil
       final Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction tx = null;

       try {

            //create a unternehmen object
           System.out.println("Creating new Unternehmen Object");
           // Hinzufügen
           logger.info("Logger for Create was saved successfull");

           // start a transaction
           session.beginTransaction();

           //HQL Named Query FindAll Unternehmen
           Query query = session.getNamedQuery("Company.findAll");
           List<Company> unList = (List<Company>) query.list();
           for (Company un : unList) {

               // Berechnung der Eigenkapitalrendite für Punkteverteilung
              float KursGewinnVerhaeltnisPkt;
             KursGewinnVerhaeltnisPkt=  ((float)un.getAktuellerAktienkurs()/(float)un.getGewinnschaezung());
               DecimalFormat f = new DecimalFormat("#0.00");
               double toFormat = ((double)Math.round(KursGewinnVerhaeltnisPkt*100))/100;
               f.format(toFormat);

                // Aufrunden
              KursGewinnVerhaeltnisPkt= Math.round(KursGewinnVerhaeltnisPkt);
               
               //definiere beide bewertungskriterien
                int retval1, retval2, retval3;
                float upperLimit = (float)16.0;
                float lowerLimit = (float)12.0;

                retval1 = Float.compare(KursGewinnVerhaeltnisPkt, upperLimit);
                retval2 = Float.compare(KursGewinnVerhaeltnisPkt, (float)0.0);
                retval3 = Float.compare(KursGewinnVerhaeltnisPkt, lowerLimit);
                if (retval3 < 0 && retval2 > 0){
                    //return 1;
                }else if(retval2 < 0 || retval1 > 0){
                    //return -1;
                }else{
                    //return 0;
                }

                float retval = Float.compare(KursGewinnVerhaeltnisPkt, upperLimit);
               
               // FAll 1, Kursgewinnverhältnis liegt zwischen 0 und 12
                 if (retval3 < 0 && retval2 > 0){

                     //HQL Named Query FindAll AnalysisRating
                     Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                     List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                     for (AnalysisRating lvsch : unList1) {

                         if (lvsch.getCompanyname_AnalysisRating() == un.getCompanyname()  == true){
                             System.out.println("Richtig :D" + lvsch.getCompanyname_AnalysisRating() +" = " + un.getCompanyname() + "KursGewinnVerhaeltnisPkt = " + KursGewinnVerhaeltnisPkt);
                             lvsch.setEigenkapitalrendite((float) 1); }

                     lvsch.setAnalysisRatingName(lvsch.getAnalysisRatingName());
                      // System.out.println("Unternehmen: " + un.getCompanyname() + " Levermannschritt: " + lvsch.getCompanyname_AnalysisRating()() );
                      // System.out.println("Fall 1 : yea AnalysisRatingName:  "+lvsch.getAnalysisRatingName() +" AM: "+ lvsch.getGewinnrevision());
                         }
                 //Eigenkapitalquote ist kleiner als 25/10%
                 }

               // FAll 2, Kursgewinnverhältnis ist kleiner 0 oder größer 16
               else if (retval2 < 0 || retval1 > 0 ) {

                     //HQL Named Query FindAll AnalysisRating
                     Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                     List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                     for (AnalysisRating lvsch1 : unList1) {

                         if (lvsch1.getCompanyname_AnalysisRating() == un.getCompanyname()  == true && retval >= 0 ){
                             System.out.println("Richtig :D" + lvsch1.getCompanyname_AnalysisRating() +" = " + un.getCompanyname()  + "KursGewinnVerhaeltnisPkt = " + KursGewinnVerhaeltnisPkt);
                             lvsch1.setEigenkapitalrendite((float) -1); }

                     lvsch1.setAnalysisRatingName(lvsch1.getAnalysisRatingName());

                   //  System.out.println("Unternehmen: " + un.getCompanyname()  + " Levermannschritt: " + lvsch1.getCompanyname_AnalysisRating()());
                   //  System.out.println("Fall 2 : yea AnalysisRatingName:  " + lvsch1.getAnalysisRatingName() + " AM: " + lvsch1.getGewinnrevision());
                       }
                     //Fall 3, Kursgewinnverhältnis liegt zwischen 12 und 16
                 }else{

                     //HQL Named Query FindAll AnalysisRating
                     Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                     List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                     for (AnalysisRating lvsch1 : unList1) {

                         if (lvsch1.getCompanyname_AnalysisRating() == un.getCompanyname()  == true) {
                             System.out.println("Richtig :D" + lvsch1.getCompanyname_AnalysisRating() + " = " + un.getCompanyname()  + "KursGewinnVerhaeltnisPkt = " + KursGewinnVerhaeltnisPkt);
                             lvsch1.setEigenkapitalrendite((float) 0);}

                         lvsch1.setAnalysisRatingName(lvsch1.getAnalysisRatingName());
                         //  System.out.println("Fall 3 : yea AnalysisRatingName:  " + lvsch1.getAnalysisRatingName() + " AM: " + lvsch1.getGewinnrevision());
                     }
                          //    System.out.println("Liste der AnalysisRating = " + un.getCompanyname()  + ","
                         //       + un.getCompanyname()  + " Kursgewinn aktuell: " + un.getGewinnschaezung() + " Kursgewinn Verhältniss: " + un.getGewinnschaezungVor4Wochen() + " summe:" + i);
                 }
                 
           }


           //commit transaction
           session.getTransaction().commit();

                 // safe Unternhemen Object
           System.out.println("Speichere Unternehmen...");

           System.out.println("Done!");
       } catch (HibernateException e) {
           System.out.println("Hibernate Exception" + e.getMessage());
           session.getTransaction().rollback();
           throw new RuntimeException(e);
       } finally {
       }

   }
    
}
