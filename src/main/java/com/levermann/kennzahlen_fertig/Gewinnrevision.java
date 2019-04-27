/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.kennzahlen_fertig;


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

 public class Gewinnrevision {

   final static Logger logger = Logger.getLogger(Gewinnrevision.class);

   public void Gewinnrevision () {
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

               // Berechnung der WerteVeränderung für Punkteverteilung
              float i;
              i =  ((float)un.getGewinnschaezung()/(float)un.getGewinnschaezungVor4Wochen())*100-100;
               DecimalFormat f = new DecimalFormat("#0.00");
               double toFormat = ((double)Math.round(i*100))/100;
               f.format(toFormat);

                // Aufrunden
               i = Math.round(i);
               i = i / 100;

               // FAll 1, Gewinnschätzung aktuell ist um mind höher als vor 4 Wochen
                 if (i > 0.05 == true){

                     //HQL Named Query FindAll Levermannschritte
                     Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                     List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                     for (Levermannschritte lvsch : unList1) {

                         if (lvsch.getCid3() == un.getCid() == true && i >= 0.05 == true){
                             System.out.println("Richtig :D" + lvsch.getCid3() +" = " + un.getCid()+ "i = " + i);
                             lvsch.setGewinnrevision(1); }

                     lvsch.setLid(lvsch.getLid());
                      // System.out.println("Unternehmen: " + un.getCid()+ " Levermannschritt: " + lvsch.getCid3() );
                      // System.out.println("Fall 1 : yea LID:  "+lvsch.getLid() +" AM: "+ lvsch.getGewinnrevision());
                         }}

               // FAll 1, Gewinnschätzung aktuell ist um mind. -0.05 niedriger als vor 4 Wochen
                 if (i < - 0.05 == true ) {

                     //HQL Named Query FindAll Levermannschritte
                     Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                     List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                     for (Levermannschritte lvsch1 : unList1) {

                         if (lvsch1.getCid3() == un.getCid() == true && i <= - 0.05 == true ){
                             System.out.println("Richtig :D" + lvsch1.getCid3() +" = " + un.getCid() + "i = " + i);
                             lvsch1.setGewinnrevision(-1); }

                     lvsch1.setLid(lvsch1.getLid());

                   //  System.out.println("Unternehmen: " + un.getCid() + " Levermannschritt: " + lvsch1.getCid3());
                   //  System.out.println("Fall 2 : yea LID:  " + lvsch1.getLid() + " AM: " + lvsch1.getGewinnrevision());
                       }}

                 if (i >= 0.05 == false && i <= - 0.05 == false ) {

                     //HQL Named Query FindAll Levermannschritte
                     Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                     List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                     for (Levermannschritte lvsch1 : unList1) {

                         if (lvsch1.getCid3() == un.getCid() == true && i > 0.005 == false && i < -0.05 == false) {
                             System.out.println("Richtig :D" + lvsch1.getCid3() + " = " + un.getCid() + "i = " + i);
                             lvsch1.setGewinnrevision(0);}

                         lvsch1.setLid(lvsch1.getLid());
                         //  System.out.println("Fall 3 : yea LID:  " + lvsch1.getLid() + " AM: " + lvsch1.getGewinnrevision());
                     }
                          //    System.out.println("Liste der Levermannschritte = " + un.getCid() + ","
                         //       + un.getName() + " Kursgewinn aktuell: " + un.getGewinnschaezung() + " Kursgewinn Verhältniss: " + un.getGewinnschaezungVor4Wochen() + " summe:" + i);
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