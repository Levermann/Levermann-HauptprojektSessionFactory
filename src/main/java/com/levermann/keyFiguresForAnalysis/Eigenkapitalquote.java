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

public class Eigenkapitalquote {
    
    final static Logger logger = Logger.getLogger(Eigenkapitalrendite.class);

   public void Eigenkapitalrendite () {
       //Logger wird für die Methode ausgeführt
       logger.info("Logger is Entering the Execute method from Create");
       String returnValue = "";

       System.out.println(" Bitte \n 1. Company \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");

       //Aufrufen der aktuellen Session aus HibernateUtil
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session = sessionFactory.getCurrentSession();
       Session session1 = sessionFactory.getCurrentSession();
       Scanner scanner = new Scanner(System.in);

       try {

            //create a unternehmen object
           System.out.println("Creating new Company Object");
           // Hinzufügen
           logger.info("Logger for Create was saved successfull");

           // start a transaction
           session.beginTransaction();

           //HQL Named Query FindAll Company
           Query query = session.getNamedQuery("Company.findAll");
           List<Company> unList = (List<Company>) query.list();
           for (Company un : unList) {

               // Berechnung der Eigenkapitalrendite für Punkteverteilung
              float eigenkapitalquotePkt;
             eigenkapitalquotePkt=  ((float)un.getEigenkapital()/(float)un.getEigenkapital() + (float)un.getJahresumsatz());
               DecimalFormat f = new DecimalFormat("#0.00");
               double toFormat = ((double)Math.round(eigenkapitalquotePkt*100))/100;
               f.format(toFormat);

                // Aufrunden
              eigenkapitalquotePkt= Math.round(eigenkapitalquotePkt);
               
               //definiere beide bewertungskriterien
               //BENÖTIGE WERT IN UNTERNEHMENSKLASSE 
               boolean finanzsegment = false;
                float upperLimit, lowerLimit;
                if(finanzsegment == true){
                    upperLimit = (float)0.10;
                    lowerLimit = (float)0.05;
                }else{
                    upperLimit = (float)0.25;
                    lowerLimit = (float)0.15;
                }
                float retval = Float.compare(eigenkapitalquotePkt, upperLimit);
               
               // FAll 1, Eigenkapitalquote ist größer als 25/10%
                 if (retval > 0){

                     //HQL Named Query FindAll AnalysisRating
                     Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                     List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                     for (AnalysisRating lvsch : unList1) {

                         if (lvsch.getCompanyname_AnalysisRating() == un.getCompanyname()  == true && retval > 0){
                             System.out.println("Richtig :D" + lvsch.getCompanyname_AnalysisRating() +" = " + un.getCompanyname() + "eigenkapitalquotePkt = " + eigenkapitalquotePkt);
                             lvsch.setEigenkapitalrendite((float) 1); }

                     lvsch.setAnalysisRatingName(lvsch.getAnalysisRatingName());
                      // System.out.println("Company: " + un.getCompanyname() + " Levermannschritt: " + lvsch.getCompanyname_AnalysisRating()() );
                      // System.out.println("Fall 1 : yea AnalysisRatingName:  "+lvsch.getAnalysisRatingName() +" AM: "+ lvsch.getGewinnrevision());
                         }
                 //Eigenkapitalquote ist kleiner als 25/10%
                 }else{
                    
                 //überprüfe untere grenze
                 retval = Float.compare(eigenkapitalquotePkt, lowerLimit);
               // FAll 2, Eigenkapitalquote liegt zwishen 25/10 und 15/5 Prozent
                 if (retval >= 0 ) {

                     //HQL Named Query FindAll AnalysisRating
                     Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                     List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                     for (AnalysisRating lvsch1 : unList1) {

                         if (lvsch1.getCompanyname_AnalysisRating() == un.getCompanyname()  == true && retval >= 0 ){
                             System.out.println("Richtig :D" + lvsch1.getCompanyname_AnalysisRating() +" = " + un.getCompanyname()  + "eigenkapitalquotePkt = " + eigenkapitalquotePkt);
                             lvsch1.setEigenkapitalrendite((float) 0); }

                     lvsch1.setAnalysisRatingName(lvsch1.getAnalysisRatingName());

                   //  System.out.println("Company: " + un.getCompanyname()  + " Levermannschritt: " + lvsch1.getCompanyname_AnalysisRating()());
                   //  System.out.println("Fall 2 : yea AnalysisRatingName:  " + lvsch1.getAnalysisRatingName() + " AM: " + lvsch1.getGewinnrevision());
                       }
                     //Fall 3, Eigenkapitalquote liegt unter 15/5%
                 }else{

                     //HQL Named Query FindAll AnalysisRating
                     Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                     List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                     for (AnalysisRating lvsch1 : unList1) {

                         if (lvsch1.getCompanyname_AnalysisRating() == un.getCompanyname()  == true) {
                             System.out.println("Richtig :D" + lvsch1.getCompanyname_AnalysisRating() + " = " + un.getCompanyname()  + "eigenkapitalquotePkt = " + eigenkapitalquotePkt);
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
           System.out.println("Speichere Company...");

           System.out.println("Done!");
       } catch (HibernateException e) {
           System.out.println("Hibernate Exception" + e.getMessage());
           session.getTransaction().rollback();
           throw new RuntimeException(e);
       } finally {
       }

   }
   }
