package com.levermann.kennzahlen_fertig_review;

import com.levermann.DatabaseStatements.HibernateUtil;
import com.levermann.entityclass.Levermannschritte;
import com.levermann.entityclass.Unternehmen;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class KursgewinnVerhältnis5Jahre {
   
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
           Query query = session.getNamedQuery("Unternehmen.findAll");
           List<Unternehmen> unList = (List<Unternehmen>) query.list();
           for (Unternehmen un : unList) {

               // Berechnung der Eigenkapitalrendite für Punkteverteilung
              float i;
              i =  ((float)un.getAktuellerAktienkurs()/(((float)un.getKursgewinnVor3Jahren() + (float)un.getKursgewinnVor2Jahren() + (float)un.getKursgewinnVor1Jahr() + (float)un.getAktuellenErwartetenKursgewinn() + (float)un.getKursgewinnschaezungNaechstesJahr())/(float)5));
               DecimalFormat f = new DecimalFormat("#0.00");
               double toFormat = ((double)Math.round(i*100))/100;
               f.format(toFormat);

                // Aufrunden
               i = Math.round(i);

               //definiere beide bewertungskriterien
                int retval1, retval2, retval3;
                float upperLimit = (float)16.0;
                float lowerLimit = (float)12.0;

                retval1 = Float.compare(i, upperLimit);
                retval2 = Float.compare(i, (float)0.0);
                retval3 = Float.compare(i, lowerLimit);

                float retval = Float.compare(i, upperLimit);

               // FAll 1, Kursgewinnverhältnis liegt zwischen 0 und 12
                 if (retval3 < 0 && retval2 > 0){

                     //HQL Named Query FindAll Levermannschritte
                     Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                     List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                     for (Levermannschritte lvsch : unList1) {

                         if (lvsch.getUnternehmenname_Levermannschritte() == un.getUnternehmenname()  == true){
                             System.out.println("Richtig :D" + lvsch.getUnternehmenname_Levermannschritte() +" = " + un.getUnternehmenname() + "i = " + i);
                             lvsch.setEigenkapitalrendite((float) 1); }

                     lvsch.setLevermannschrittAnalyseNameId(lvsch.getLevermannschrittAnalyseNameId());
                      // System.out.println("Unternehmen: " + un.getUnternehmenname() + " Levermannschritt: " + lvsch.getUnternehmenname_Levermannschritte()() );
                      // System.out.println("Fall 1 : yea LevermannschrittAnalyseNameId:  "+lvsch.getLevermannschrittAnalyseNameId() +" AM: "+ lvsch.getGewinnrevision());
                         }
                 //Eigenkapitalquote ist kleiner als 25/10%
                 }

               // FAll 2, Kursgewinnverhältnis ist kleiner 0 oder größer 16
               else if (retval2 < 0 || retval1 > 0 ) {

                     //HQL Named Query FindAll Levermannschritte
                     Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                     List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                     for (Levermannschritte lvsch1 : unList1) {

                         if (lvsch1.getUnternehmenname_Levermannschritte() == un.getUnternehmenname()  == true && retval >= 0 ){
                             System.out.println("Richtig :D" + lvsch1.getUnternehmenname_Levermannschritte() +" = " + un.getUnternehmenname()  + "i = " + i);
                             lvsch1.setEigenkapitalrendite((float) -1); }

                     lvsch1.setLevermannschrittAnalyseNameId(lvsch1.getLevermannschrittAnalyseNameId());

                   //  System.out.println("Unternehmen: " + un.getUnternehmenname()  + " Levermannschritt: " + lvsch1.getUnternehmenname_Levermannschritte()());
                   //  System.out.println("Fall 2 : yea LevermannschrittAnalyseNameId:  " + lvsch1.getLevermannschrittAnalyseNameId() + " AM: " + lvsch1.getGewinnrevision());
                       }
                     //Fall 3, Kursgewinnverhältnis liegt zwischen 12 und 16
                 }else{

                     //HQL Named Query FindAll Levermannschritte
                     Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                     List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                     for (Levermannschritte lvsch1 : unList1) {

                         if (lvsch1.getUnternehmenname_Levermannschritte() == un.getUnternehmenname()  == true) {
                             System.out.println("Richtig :D" + lvsch1.getUnternehmenname_Levermannschritte() + " = " + un.getUnternehmenname()  + "i = " + i);
                             lvsch1.setEigenkapitalrendite((float) 0);}

                         lvsch1.setLevermannschrittAnalyseNameId(lvsch1.getLevermannschrittAnalyseNameId());
                         //  System.out.println("Fall 3 : yea LevermannschrittAnalyseNameId:  " + lvsch1.getLevermannschrittAnalyseNameId() + " AM: " + lvsch1.getGewinnrevision());
                     }
                          //    System.out.println("Liste der Levermannschritte = " + un.getUnternehmenname()  + ","
                         //       + un.getUnternehmenname()  + " Kursgewinn aktuell: " + un.getGewinnschaezung() + " Kursgewinn Verhältniss: " + un.getGewinnschaezungVor4Wochen() + " summe:" + i);
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
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        float kgv;
        int levermann;
        float[] gewinne = new float[5];
        gewinne[0] = (float)5;
        gewinne[1] = (float)1;
        gewinne[2] = (float)1;
        gewinne[3] = (float)1;
        gewinne[4] = (float)1;
        kgv = kursGewinnVerhältnis(gewinne, 20);
        System.out.println("5. Kurs-Gewinn-Verhältnis über 5 Jahre: " + kgv);
        levermann = kgvBewertung(kgv);
        System.out.println("Levermannwertung: " + levermann);
    }

    //berechnet die Eigenkapitalrendite
    public static float kursGewinnVerhältnis(float[] gewinne, float aktKurs){
        float kgv;
        kgv = aktKurs / ((gewinne[0] + gewinne[1] + gewinne[2] + gewinne[3] + gewinne[4])/(float)5);
        return kgv;
    }

    //berechne die Levermannwertung für die gegebene Eigenkapitalrendite
    public static int kgvBewertung(float kgv){
        int retval1, retval2, retval3;
        float upperLimit = (float)16.0;
        float lowerLimit = (float)12.0;

        retval1 = Float.compare(kgv, upperLimit);
        retval2 = Float.compare(kgv, (float)0.0);
        retval3 = Float.compare(kgv, lowerLimit);
        if (retval3 < 0 && retval2 > 0){
            return 1;
        }else if(retval2 < 0 || retval1 > 0){
            return -1;
        }else{
            return 0;
        }
    }
}
