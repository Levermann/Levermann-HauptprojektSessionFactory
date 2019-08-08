/*
 * Datenbankzugriff und Veränderung mit zwei Datenbanken
 * Levermann Spalten:  Kursverlauf6Monate: 1, -1 oder 0
 * Unternehmen Spalten: AktuellerAktienkurs, KursVor6Monaten
 * Autor: Lisa Stolz
 *
 *
 */

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

public class KursheuteggKursvor6Monaten {
    final static Logger logger = Logger.getLogger(Gewinnrevision.class);

    public void KursheuteggKursvor6Monaten() {
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
                i = ((float) un.getAktuellerAktienkurs() / (float) un.getKursVor6Monaten()) * 100 - 100;
                DecimalFormat f = new DecimalFormat("#0.00");
                double toFormat = ((double) Math.round(i * 100)) / 100;
                f.format(toFormat);

                // Aufrunden
                i = Math.round(i);
                i = i / 100;

                // FAll 1, Kursschätzung Wert: +1
                if (i > 0.05 == true) {

                    //HQL Named Query FindAll Levermannschritte
                    Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                    List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                    for (Levermannschritte lvsch : unList1) {

                        if (lvsch.getUnternehmenname_Levermannschritte() == un.getUnternehmenname()  == true && i >= 0.05 == true) {
                            System.out.println("Richtig :D" + lvsch.getUnternehmenname_Levermannschritte() + " = " + un.getUnternehmenname()  + "i = " + i);
                            lvsch.setKursverlauf6Monate((float) 1);
                        }

                        lvsch.setLevermannschrittAnalyseNameId(lvsch.getLevermannschrittAnalyseNameId());
                        // System.out.println("Unternehmen: " + un.getUnternehmenname() + " Levermannschritt: " + lvsch.getUnternehmenname_Levermannschritte()() );
                        // System.out.println("Fall 1 : yea LevermannschrittAnalyseNameId:  "+lvsch.getLevermannschrittAnalyseNameId() +" AM: "+ lvsch.getGewinnrevision());
                    }
                }

                // FAll 2, Kursschätzung Wert: -1
                if (i < -0.05 == true) {

                    //HQL Named Query FindAll Levermannschritte
                    Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                    List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                    for (Levermannschritte lvsch1 : unList1) {

                        if (lvsch1.getUnternehmenname_Levermannschritte() == un.getUnternehmenname()  == true && i <= -0.05 == true) {
                            System.out.println("Richtig :D" + lvsch1.getUnternehmenname_Levermannschritte() + " = " + un.getUnternehmenname()  + "i = " + i);
                            lvsch1.setKursverlauf6Monate((float) -1);
                        }

                        lvsch1.setLevermannschrittAnalyseNameId(lvsch1.getLevermannschrittAnalyseNameId());

                        //  System.out.println("Unternehmen: " + un.getUnternehmenname()  + " Levermannschritt: " + lvsch1.getUnternehmenname_Levermannschritte()());
                        //  System.out.println("Fall 2 : yea LevermannschrittAnalyseNameId:  " + lvsch1.getLevermannschrittAnalyseNameId() + " AM: " + lvsch1.getGewinnrevision());
                    }
                }

                //Fall 3, Kursschätzung Wert: 0
                if (i >= 0.05 == false && i <= -0.05 == false) {

                    //HQL Named Query FindAll Levermannschritte
                    Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                    List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                    for (Levermannschritte lvsch1 : unList1) {

                        if (lvsch1.getUnternehmenname_Levermannschritte() == un.getUnternehmenname()  == true && i > 0.005 == false && i < -0.05 == false) {
                            System.out.println("Richtig :D" + lvsch1.getUnternehmenname_Levermannschritte() + " = " + un.getUnternehmenname()  + "i = " + i);
                            lvsch1.setKursverlauf6Monate((float) 0);
                        }

                        lvsch1.setLevermannschrittAnalyseNameId(lvsch1.getLevermannschrittAnalyseNameId());
                        //  System.out.println("Fall 3 : yea LevermannschrittAnalyseNameId:  " + lvsch1.getLevermannschrittAnalyseNameId() + " AM: " + lvsch1.getGewinnrevision());
                    }
                    //    System.out.println("Liste der Levermannschritte = " + un.getUnternehmenname()  + ","
                    //       + un.getUnternehmenname()  + " Kursgewinn aktuell: " + un.getGewinnschaezung() + " Kursgewinn Verhältniss: " + un.getKursverlauf6Monate() + " summe:" + i);
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