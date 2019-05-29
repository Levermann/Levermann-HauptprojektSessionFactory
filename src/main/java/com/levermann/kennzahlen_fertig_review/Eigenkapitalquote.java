package com.levermann.kennzahlen_fertig_review;

import com.levermann.dao.HibernateUtil;
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

public class Eigenkapitalquote {
    
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
              i =  ((float)un.getEigenkapital()/(float)un.getEigenkapital() + (float)un.getJahresumsatz());
               DecimalFormat f = new DecimalFormat("#0.00");
               double toFormat = ((double)Math.round(i*100))/100;
               f.format(toFormat);

                // Aufrunden
               i = Math.round(i);
               
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
                float retval = Float.compare(i, upperLimit);
               
               // FAll 1, Eigenkapitalquote ist größer als 25/10%
                 if (retval > 0){

                     //HQL Named Query FindAll Levermannschritte
                     Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                     List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                     for (Levermannschritte lvsch : unList1) {

                         if (lvsch.getName2() == un.getName() == true && retval > 0){
                             System.out.println("Richtig :D" + lvsch.getName2() +" = " + un.getName()+ "i = " + i);
                             lvsch.setEigenkapitalrendite(1); }

                     lvsch.setLid(lvsch.getLid());
                      // System.out.println("Unternehmen: " + un.getName()+ " Levermannschritt: " + lvsch.getName2()() );
                      // System.out.println("Fall 1 : yea LID:  "+lvsch.getLid() +" AM: "+ lvsch.getGewinnrevision());
                         }
                 //Eigenkapitalquote ist kleiner als 25/10%
                 }else{
                    
                 //überprüfe untere grenze
                 retval = Float.compare(i, lowerLimit);
               // FAll 2, Eigenkapitalquote liegt zwishen 25/10 und 15/5 Prozent
                 if (retval >= 0 ) {

                     //HQL Named Query FindAll Levermannschritte
                     Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                     List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                     for (Levermannschritte lvsch1 : unList1) {

                         if (lvsch1.getName2() == un.getName() == true && retval >= 0 ){
                             System.out.println("Richtig :D" + lvsch1.getName2() +" = " + un.getName() + "i = " + i);
                             lvsch1.setEigenkapitalrendite(0); }

                     lvsch1.setLid(lvsch1.getLid());

                   //  System.out.println("Unternehmen: " + un.getName() + " Levermannschritt: " + lvsch1.getName2()());
                   //  System.out.println("Fall 2 : yea LID:  " + lvsch1.getLid() + " AM: " + lvsch1.getGewinnrevision());
                       }
                     //Fall 3, Eigenkapitalquote liegt unter 15/5%
                 }else{

                     //HQL Named Query FindAll Levermannschritte
                     Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                     List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                     for (Levermannschritte lvsch1 : unList1) {

                         if (lvsch1.getName2() == un.getName() == true) {
                             System.out.println("Richtig :D" + lvsch1.getName2() + " = " + un.getName() + "i = " + i);
                             lvsch1.setEigenkapitalrendite(-1);}

                         lvsch1.setLid(lvsch1.getLid());
                         //  System.out.println("Fall 3 : yea LID:  " + lvsch1.getLid() + " AM: " + lvsch1.getGewinnrevision());
                     }
                          //    System.out.println("Liste der Levermannschritte = " + un.getName() + ","
                         //       + un.getName() + " Kursgewinn aktuell: " + un.getGewinnschaezung() + " Kursgewinn Verhältniss: " + un.getGewinnschaezungVor4Wochen() + " summe:" + i);
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
