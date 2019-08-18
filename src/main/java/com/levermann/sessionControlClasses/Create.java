/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.sessionControlClasses;


import com.levermann.entityclass.Levermannschritte;
import com.levermann.entityclass.Punkteliste;
import com.levermann.entityclass.Unternehmen;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.apache.log4j.Logger;


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

            //create a object
            System.out.println("Creating new Unternehmen Object");
            Punkteliste pkt = new Punkteliste();
            pkt.setPunktelisteNameId(Analysename);
            pkt.setUnternehmenname_Punkteliste(Firmenname);

            // Hinzufügen
            logger2.info("Logger for Create was saved successfull");

            // start a transaction
            session.beginTransaction();

            // safe Unternhemen Object
            System.out.println("Speichere Unternehmen...");


            session.getTransaction().commit();
            session.close();
            //  } while (i != 3);

            System.err.println("Abfrage Beendet");

        }   catch (HibernateException e) {
        System.out.println("Hibernate Exception" + e.getMessage());
        session.getTransaction().rollback();
        throw new RuntimeException(e);
    } finally {}

    }

    public void CreateLevermannanalyse(String Analysename, String Firmenname ) {

        //Logger wird für die Methode ausgeführt
        logger2.info("Logger is Entering the Execute method from Create");
        String returnValue = "";

        System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {

            //create an object
            System.out.println("Creating new Unternehmen Object");
            Levermannschritte lvschrt = new Levermannschritte();
            Unternehmen un = new Unternehmen();

            lvschrt.setLevermannschrittAnalyseNameId(Analysename);
            lvschrt.setUnternehmenname_Levermannschritte(Firmenname);
            un.getUnternehmenname();

            lvschrt.getLevermannschrittAnalyseNameId();
            // Hinzufügen
            logger2.info("Logger for Create was saved successfull");
            // start a transaction
            session.beginTransaction();

            // safe Unternhemen Object
            System.out.println("Speichere Unternehmen...");


            session.save(lvschrt);

            session.getTransaction().commit();
            //  } while (i != 3);

            System.err.println("Abfrage Beendet");

        } catch (HibernateException e) {
            System.out.println("Hibernate Exception :( " + e.getMessage());
            session.getTransaction().rollback();
            throw new RuntimeException(e);
        } finally {}

    }

}
