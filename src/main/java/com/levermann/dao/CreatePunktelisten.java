/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.dao;


import java.util.List;
import java.util.Scanner;


import com.levermann.entityclass.Levermannschritte;
import com.levermann.entityclass.Unternehmen;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreatePunktelisten implements DaoUnternehmen {

    final static Logger logger = Logger.getLogger(Select.class);

    public void Dao() {

        //Logger wird für die Methode ausgeführt
        logger.info("Logger is Entering the Execute method from Create");
        String returnValue = "";

        System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Scanner scanner = new Scanner(System.in);

        try {

            //create a unternehmen object
            System.out.println("Creating new Unternehmen Object");

            // Unternehmen un = new Unternehmen();

            // Hinzufügen
            logger.info("Logger for Create was saved successfull");

            // start a transaction
            session.beginTransaction();


            Query query = session.createQuery("Select * from Levermannschritte");
            List<Levermannschritte> lsList = query.list();
            for (Levermannschritte lsr : lsList) {
                System.out.println("Unternehmen Cid=" + lsr.getCid3() + " Name=" + lsr.getLid());


                lsr.setCid3(6);
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