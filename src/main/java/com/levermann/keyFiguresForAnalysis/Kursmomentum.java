/*
 * Datenbankzugriff und Veränderung mit zwei Datenbanken
 * Levermann Spalten:  Kursmomentum: 1, -1 oder 0
 * Unternehmen Spalten: Kursverlauf6Monate, Kursverlauf12Monate
 * Autor: Florian Land
 *
 *
 */

package com.levermann.keyFiguresForAnalysis;

import com.levermann.entityclass.AnalysisSteps;
import com.levermann.sessionControlClasses.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Scanner;

public class Kursmomentum {

    final static Logger logger = Logger.getLogger(Kursmomentum.class);

    public void Kursmomentum () {
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

            // Unternehmen un = new Unternehmen();

            // Hinzufügen
            logger.info("Logger for Create was saved successfull");

            // start a transaction
            session.beginTransaction();

            //HQL Named Query FindAll Unternehmen
            Query query = session.getNamedQuery("AnalysisSteps.findall");
            List<AnalysisSteps> pktList = (List<AnalysisSteps>) query.list();





            for (AnalysisSteps pkt : pktList) {

                    // Fall 1 Kriterium 9: 1 Pkt., Kriterium 10 : 0 oder -1 Pkt.
                    if (pkt.getKursverlauf6Monate() == 1 == true && pkt.getKursverlauf12Monate() ==1 == false ){

                        pkt.setKursverlauf12Monate((float) 1);
                        float kursmomentumPkt = pkt.getKursverlauf12Monate()-pkt.getKursverlauf6Monate();

                    System.out.println("Fall 1 : yea AnalysisRatingName :  "+pkt.getAnalysisStepsName() +" Unternehmen: "+ pkt.getCompanyname_AnalysisSteps());
                }

                // Fall 1 Kriterium 9: -1 Pkt., Kriterium 10 : 0 oder 1 Pkt.
                if (pkt.getKursverlauf6Monate()  == -1 == true && pkt.getKursverlauf12Monate()  == -1 == false ) {

                    {    // un.setAnalysisRatingName (un.getAnalysisRatingName ());
                        pkt.setKursverlauf12Monate((float) 1);
                        float kursmomentumPkt = pkt.getKursverlauf12Monate()-pkt.getKursverlauf6Monate();

                        //   un.setAnalystenmeinungen(111);
                        System.out.println("Fall 2 : yea AnalysisRatingName :  "+pkt.getAnalysisStepsName() +" Unternehmen: "+ pkt.getCompanyname_AnalysisSteps());
                    }
                }

                    else {

                    // un.setAnalysisRatingName (un.getAnalysisRatingName ());
                    pkt.setKursverlauf12Monate((float) 0);
                    float kursmomentumPkt = pkt.getKursverlauf12Monate()-pkt.getKursverlauf6Monate();

                    pkt.setKursmomentum(pkt.getAnalystenmeinungen());
                    System.out.println("Fall 3 : yea AnalysisRatingName :  "+pkt.getAnalysisStepsName() +" Unternehmen: "+ pkt.getCompanyname_AnalysisSteps());

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