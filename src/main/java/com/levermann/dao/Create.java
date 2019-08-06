/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.dao;


import com.levermann.entityclass.Levermannschritte;
import com.levermann.entityclass.Punkteliste;
import com.levermann.entityclass.Unternehmen;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.apache.log4j.Logger;


import java.util.Scanner;

public class Create implements DaoUnternehmen{

    final static Logger logger = Logger.getLogger(Create.class);

    public void Dao() {

        //Logger wird für die Methode ausgeführt
        logger.info("Logger is Entering the Execute method from Create");
        String returnValue = "";

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            //    String datum = scanner.next();
            float eigenkapital = scanner.nextInt();

            //create a unternehmen object
            System.out.println("Creating new Unternehmen Object");
            Unternehmen un = new Unternehmen();
            Punkteliste pkt = new Punkteliste();
            Levermannschritte lvschrt = new Levermannschritte();

            // Hinzufügen
            logger.info("Logger for Create was saved successfull");

            //Erstellung Unternehmen
            un.setName(name);
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

}
