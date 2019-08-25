/*
 * Datenbankzugriff und Veränderung mit zweanalyseMeinungPktDatenbanken
 * Levermann Spalten:  Analysemeinungen: 1, -1 oder 0
 * Unternehmen Spalten: Gewinnschaezung, GewinnschaezungVor4Wochen
 *Autor: Andreas Chladny
 *
 *
 */
package com.levermann.keyFiguresForAnalysis;


import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import com.levermann.entityclass.AnalysisRating;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class Analystenmeinungen {

  final static Logger logger = Logger.getLogger(Analystenmeinungen.class);

  public void Gewinnrevision (float gewinnrevision) {
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

              // Berechnung der WerteVeränderung für Punkteverteilung
             float analyseMeinungPkt;
             analyseMeinungPkt=  ((((float)un.getKaufen()*1 )+ ((float)un.getHalten()*2) + ((float)un.getVerkaufen()*3))/3)*100-100;
              DecimalFormat f = new DecimalFormat("#0.00");
              double toFormat = ((double)Math.round(analyseMeinungPkt*100))/100;
              f.format(toFormat);

               // Aufrunden
              analyseMeinungPkt= Math.round(analyseMeinungPkt);
              analyseMeinungPkt= analyseMeinungPkt/ 100;

              // FAll 1, Gewinnschätzung aktuell ist um mind höher als vor 4 Wochen
                if (analyseMeinungPkt> 0.05 == true){

                    //HQL Named Query FindAll AnalysisRating
                    Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                    List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                    for (AnalysisRating lvsch : unList1) {

                        if (lvsch.getCompanyname_AnalysisRating() == un.getCompanyname() == true && analyseMeinungPkt>= 0.05 == true){
                            System.out.println("Richtig :D" + lvsch.getCompanyname_AnalysisRating() +" = " + un.getCompanyname()+ "analyseMeinungPkt= " + analyseMeinungPkt);
                            lvsch.setGewinnrevision((float) 1); }

                    lvsch.setAnalysisRatingName(lvsch.getAnalysisRatingName());
                     // System.out.println("Unternehmen: " + un.getCompanyname()+ " Levermannschritt: " + lvsch.getCompanyname_AnalysisRating()() );
                     // System.out.println("Fall 1 : yea AnalysisRatingName:  "+lvsch.getAnalysisRatingName() +" AM: "+ lvsch.getGewinnrevision());
                        }}

              // FAll 1, Gewinnschätzung aktuell ist um mind. -0.05 niedriger als vor 4 Wochen
                if (analyseMeinungPkt< - 0.05 == true ) {

                    //HQL Named Query FindAll AnalysisRating
                    Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                    List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                    for (AnalysisRating lvsch1 : unList1) {

                        if (lvsch1.getCompanyname_AnalysisRating() == un.getCompanyname() == true && analyseMeinungPkt<= - 0.05 == true ){ System.out.println("Richtig :D" + lvsch1.getCompanyname_AnalysisRating() +" = " + un.getCompanyname() + "analyseMeinungPkt= " + analyseMeinungPkt);
                            lvsch1.setGewinnrevision((float) -1); }

                    lvsch1.setAnalysisRatingName(lvsch1.getAnalysisRatingName());

                  //  System.out.println("Unternehmen: " + un.getCompanyname() + " Levermannschritt: " + lvsch1.getCompanyname_AnalysisRating()());
                  //  System.out.println("Fall 2 : yea AnalysisRatingName:  " + lvsch1.getAnalysisRatingName() + " AM: " + lvsch1.getGewinnrevision());
                      }}

                if (analyseMeinungPkt>= 0.05 == false && analyseMeinungPkt<= - 0.05 == false ) {

                    //HQL Named Query FindAll AnalysisRating
                    Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                    List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                    for (AnalysisRating lvsch1 : unList1) {

                        if (lvsch1.getCompanyname_AnalysisRating() == un.getCompanyname() == true && analyseMeinungPkt> 0.005 == false && analyseMeinungPkt< -0.05 == false) {
                            System.out.println("Richtig :D" + lvsch1.getCompanyname_AnalysisRating() + " = " + un.getCompanyname() + "analyseMeinungPkt= " + analyseMeinungPkt);
                            lvsch1.setGewinnrevision((float) 0);}

                        lvsch1.setAnalysisRatingName(lvsch1.getAnalysisRatingName());
                        //  System.out.println("Fall 3 : yea AnalysisRatingName:  " + lvsch1.getAnalysisRatingName() + " AM: " + lvsch1.getGewinnrevision());
                    }
                         //    System.out.println("Liste der AnalysisRating = " + un.getCompanyname() + ","
                        //       + un.getCompanyname() + " Kursgewinn aktuell: " + un.getGewinnschaezung() + " Kursgewinn Verhältniss: " + un.getGewinnschaezungVor4Wochen() + " summe:" + i);
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