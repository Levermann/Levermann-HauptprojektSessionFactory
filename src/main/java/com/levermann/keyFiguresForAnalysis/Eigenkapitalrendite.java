package com.levermann.keyFiguresForAnalysis;

import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class Eigenkapitalrendite {

final static Logger logger = Logger.getLogger(Eigenkapitalrendite.class);

   public void Eigenkapitalrendite () {
       //Logger wird für die Methode ausgeführt
       logger.info("Logger is Entering the Execute method from Create");
       String returnValue = "";

       System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");

       //Aufrufen der aktuellen Session aus HibernateUtil
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session = sessionFactory.getCurrentSession();
       Session session1 = sessionFactory.getCurrentSession();
       Scanner scanner = new Scanner(System.in);

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
              float eigenkapitalrenditePkt;
             eigenkapitalrenditePkt=  ((float)un.getJahresueberschuss()/(float)un.getEigenkapital());
               DecimalFormat f = new DecimalFormat("#0.00");
               double toFormat = ((double)Math.round(eigenkapitalrenditePkt*100))/100;
               f.format(toFormat);

                // Aufrunden
              eigenkapitalrenditePkt= Math.round(eigenkapitalrenditePkt);
               
               //definiere beide bewertungskriterien
                float upperLimit = (float)0.2;
                float lowerLimit = (float)0.1;

                float retval = Float.compare(eigenkapitalrenditePkt, upperLimit);
                
                  
               
               // FAll 1, Eigenkapitalrendite ist größer als 20 %
                 if (retval > 0){

                     //HQL Named Query FindAll AnalysisRating
                     Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                     List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                     for (AnalysisRating lvsch : unList1) {

                         if (lvsch.getCompanyname_AnalysisRating() == un.getCompanyname()  == true && retval > 0){
                             System.out.println("Richtig :D" + lvsch.getCompanyname_AnalysisRating() +" = " + un.getCompanyname() + "eigenkapitalrenditePkt = " + eigenkapitalrenditePkt);
                             lvsch.setEigenkapitalrendite((float) 1); }

                     lvsch.setAnalysisRatingName(lvsch.getAnalysisRatingName());
                      // System.out.println("Unternehmen: " + un.getCompanyname() + " Levermannschritt: " + lvsch.getCompanyname_AnalysisRating()() );
                      // System.out.println("Fall 1 : yea AnalysisRatingName:  "+lvsch.getAnalysisRatingName() +" AM: "+ lvsch.getGewinnrevision());
                         }
                 //Eigenkapitalrendite ist kleiner als 20%
                 }else{
                    
                 //überprüfe untere grenze
                 retval = Float.compare(eigenkapitalrenditePkt, lowerLimit);
               // FAll 2, Eigenkapitalrendite liegt zwishen 10 und 20 Prozent
                 if (retval >= 0 ) {

                     //HQL Named Query FindAll AnalysisRating
                     Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                     List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                     for (AnalysisRating lvsch1 : unList1) {

                         if (lvsch1.getCompanyname_AnalysisRating() == un.getCompanyname()  == true && retval >= 0 ){
                             System.out.println("Richtig :D" + lvsch1.getCompanyname_AnalysisRating() +" = " + un.getCompanyname()  + "eigenkapitalrenditePkt = " + eigenkapitalrenditePkt);
                             lvsch1.setEigenkapitalrendite((float) 0); }

                     lvsch1.setAnalysisRatingName(lvsch1.getAnalysisRatingName());

                   //  System.out.println("Unternehmen: " + un.getCompanyname()  + " Levermannschritt: " + lvsch1.getCompanyname_AnalysisRating()());
                   //  System.out.println("Fall 2 : yea AnalysisRatingName:  " + lvsch1.getAnalysisRatingName() + " AM: " + lvsch1.getGewinnrevision());
                       }
                     //Fall 3, Eigenkapitalrendite liegt unter 10 %
                 }else{

                     //HQL Named Query FindAll AnalysisRating
                     Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                     List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                     for (AnalysisRating lvsch1 : unList1) {

                         if (lvsch1.getCompanyname_AnalysisRating() == un.getCompanyname()  == true) {
                             System.out.println("Richtig :D" + lvsch1.getCompanyname_AnalysisRating() + " = " + un.getCompanyname()  + "eigenkapitalrenditePkt = " + eigenkapitalrenditePkt);
                             lvsch1.setEigenkapitalrendite((float) -1);}

                         lvsch1.setAnalysisRatingName(lvsch1.getAnalysisRatingName());
                         //  System.out.println("Fall 3 : yea AnalysisRatingName:  " + lvsch1.getAnalysisRatingName() + " AM: " + lvsch1.getGewinnrevision());
                     }
                          //    System.out.println("Liste der AnalysisRating = " + un.getCompanyname()  + ","
                         //       + un.getCompanyname()  + " Kursgewinn aktuell: " + un.getGewinnschaezung() + " Kursgewinn Verhältniss: " + un.getGewinnschaezungVor4Wochen() + " summe:" + i);
                 }
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