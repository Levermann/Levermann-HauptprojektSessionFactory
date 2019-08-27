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
import org.hibernate.*;

import java.util.List;
import java.util.Scanner;

public class Kursmomentum {

    final static Logger logger = Logger.getLogger(Kursmomentum.class);

    public void Kursmomentum () {
        //Logger wird für die Methode ausgeführt
        logger.info("Logger is Entering the Execute method from Create");
        String returnValue = "";

        System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");

        final Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {

            tx = session.beginTransaction();

            //HQL Named Query FindAll Unternehmen
            Query query = session.getNamedQuery("AnalysisSteps.findall");
            List<AnalysisSteps> pktList = (List<AnalysisSteps>) query.list();





            for (AnalysisSteps pkt : pktList) {

                pkt.setKursmomentum((float) 0);

                    // Fall 1 Kriterium 9: 1 Pkt., Kriterium 10 : 0 oder -1 Pkt.
                    if (pkt.getKursverlauf6Monate() == 1 == true && pkt.getKursverlauf12Monate() ==1 == false ){

                        pkt.setKursmomentum((float) 1);

                        float kursmomentumPkt = pkt.getKursverlauf12Monate()-pkt.getKursverlauf6Monate();

                    System.out.println("Fall 1 : yea AnalysisRatingName :  "+pkt.getAnalysisStepsName() +" Unternehmen: "+ pkt.getCompanyname_AnalysisSteps());
                }

                // Fall 1 Kriterium 9: -1 Pkt., Kriterium 10 : 0 oder 1 Pkt.
                if (pkt.getKursverlauf6Monate()  == -1 == true && pkt.getKursverlauf12Monate()  == -1 == false ) {

                    {    // un.setAnalysisRatingName (un.getAnalysisRatingName ());
                        pkt.setKursmomentum((float) 1);

                        float kursmomentumPkt = pkt.getKursverlauf12Monate()-pkt.getKursverlauf6Monate();

                        //   un.setAnalystenmeinungen(111);
                        System.out.println("Fall 2 : yea AnalysisRatingName :  "+pkt.getAnalysisStepsName() +" Unternehmen: "+ pkt.getCompanyname_AnalysisSteps());
                    }
                }



                session.getTransaction().commit();

                System.out.println(pkt.getKursmomentum());
                session.save(pkt);

            }






            // safe Unternhemen Object
            System.out.println("Speichere Unternehmen...");



            session.close();

        } catch (HibernateException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Done !");
        }

    }
}