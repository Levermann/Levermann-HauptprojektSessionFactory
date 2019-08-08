/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.DatabaseStatements;


import com.levermann.entityclass.Levermannschritte;
import com.levermann.entityclass.Punkteliste;
import com.levermann.entityclass.Unternehmen;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.apache.log4j.Logger;


import java.util.List;
import java.util.Scanner;

public class Create {

    final static Logger logger1 = Logger.getLogger(Create.class);

    public void CreateUnternehmen( String name, Float  eigenkapital) {

        //Logger wird für die Methode ausgeführt
        logger1.info("Logger is Entering the Execute method from Create");
        String returnValue = "";

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            Scanner scanner = new Scanner(System.in);
            //    String datum = scanner.next();

            //create a unternehmen object
            System.out.println("Creating new Unternehmen Object");
            Unternehmen un = new Unternehmen();
            Punkteliste pkt = new Punkteliste();
            Levermannschritte lvschrt = new Levermannschritte();

            // Hinzufügen
            logger1.info("Logger for Create was saved successfull");

            //Erstellung Unternehmen
            un.setUnternehmenname(name);
            un.setEigenkapital(eigenkapital);

            // start a transaction
            session.beginTransaction();

            // safe Unternhemen Object
            System.out.println("Speichere Unternehmen...");
            session.save(un);

            //commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception" + e.getMessage());
            session.getTransaction().rollback();
            throw new RuntimeException(e);
        } finally {}



    }

    final static Logger logger2 = Logger.getLogger(Select.class);

    public void CreatePunktelisten(String Analysename, String Firmenname ) {

        //Logger wird für die Methode ausgeführt
        logger2.info("Logger is Entering the Execute method from Create");
        String returnValue = "";

        System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {

            //create a unternehmen object
            System.out.println("Creating new Unternehmen Object");

            // Unternehmen un = new Unternehmen();

            // Hinzufügen
            logger2.info("Logger for Create was saved successfull");

            // start a transaction
            session.beginTransaction();


            Query query = session.createQuery("Select * from Levermannschritte");
            List<Levermannschritte> lsList = query.list();
            for (Levermannschritte lsr : lsList) {
                System.out.println("Unternehmen =" + lsr.getLevermannschrittAnalyseNameId());


                lsr.setLevermannschrittAnalyseNameId(Analysename);
                lsr.setUnternehmenname_Levermannschritte(Firmenname);
            }


            // safe Unternhemen Object
            System.out.println("Speichere Unternehmen...");


            session.getTransaction().commit();
            session.close();
            //  } while (i != 3);

            System.err.println("Abfrage Beendet");

        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }

}
