/*
# Datebankzugriff und Veränderung mit einer Datenbank
*/

package com.levermann.kennzahlen_fertig_review;

import com.levermann.dao.HibernateUtil;
import com.levermann.entityclass.Levermannschritte;
import com.levermann.entityclass.Unternehmen;
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
            Query query = session.getNamedQuery("Levermannschritte.findAll");
            List<Levermannschritte> unList = (List<Levermannschritte>) query.list();
            for (Levermannschritte un : unList) {


                if (un.getKursverlauf6Monate() == 1 == true && un.getKursverlauf12Monate() ==1 == false ){

                    un.setKursmomentum(1);

                    System.out.println("Fall 1 : yea LID:  "+un.getLid() +" AM: "+ un.getKursmomentum());
                }


                if (un.getKursverlauf6Monate() == -1 == true && un.getKursverlauf12Monate() ==-1 == false ) {

                    {    // un.setLid(un.getLid());
                        un.setKursmomentum(-1);

                        //   un.setAnalystenmeinungen(111);
                        System.out.println("Fall 2 : yea LID:  " + un.getLid() + " AM: " + un.getKursmomentum());
                    }
                }

                    if (un.getKursverlauf6Monate() == 0 == true ){

                    // un.setLid(un.getLid());
                    un.setKursmomentum(0);

                    //   un.setAnalystenmeinungen(111);
                    System.out.println("Fall 3 : yea LID:  "+un.getLid() +" AM: "+ un.getKursmomentum());

                }

            if (un.getKursverlauf6Monate() == 1 == true && un.getKursverlauf12Monate() ==1 == true ){

                un.setKursmomentum(0);

                System.out.println("Fall 1 : yea LID:  "+un.getLid() +" AM: "+ un.getKursmomentum());
            }

                if (un.getKursverlauf6Monate() == -1 == true && un.getKursverlauf12Monate() ==-1 == true ){

                    un.setKursmomentum(0);

                    System.out.println("Fall 1 : yea LID:  "+un.getLid() +" AM: "+ un.getKursmomentum());
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