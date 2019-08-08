/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.DatabaseStatements;


import java.util.List;
import java.util.Scanner;


import com.levermann.entityclass.Levermannschritte;
import com.levermann.entityclass.Unternehmen;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Select{

    final static Logger logger = Logger.getLogger(Select.class);

    public void SelectUnternehmenAlle () {
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

        //HQL Named Query FindAll Unternehmen
            Query query = session.getNamedQuery("Unternehmen.findAll");
            List<Unternehmen> unList = query.list();
            for (Unternehmen un : unList) {
                System.out.println("Liste der Unternehmen = " + un.getUnternehmenname()  + ","
                        + un.getUnternehmenname() );}

            /* Ausgabe eines Datensatzes mit UnternehmennameId
            query = session.getNamedQuery("Unternehmen.findByName");
            Unternehmen un = (Unternehmen) query.uniqueResult();
            System.out.println("Unternehmen UnternehmennameId=" + un.getUnternehmenname()  + " Name=" + un.getUnternehmenname()  + ", City=");

            // Ausgabe einer Liste mit Namen
            query = session.getNamedQuery("Unternehmen.findByName");
            unList = query.list();
            for (Unternehmen un1 : unList) {
                System.out.println("List of Employees::" + un1.getUnternehmenname()  + ","
                        + un1.getUnternehmenname() );
            }*/

            // safe Unternhemen Object
            System.out.println("Speichere Unternehmen...");

            //commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception" + e.getMessage());
            session.getTransaction().rollback();
            throw new RuntimeException(e);
        } finally {
        }

    }

     final static Logger logger3 = Logger.getLogger(Select.class);

     public void SelectUnternehmenByName (String Unternehmenname) {
         //Logger wird für die Methode ausgeführt
         logger3.info("Logger is Entering the Execute method from Create");
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
             logger3.info("Logger for Create was saved successfull");

             // start a transaction
             session.beginTransaction();

             //HQL Named Query FindAll Unternehmen
             Query query = session.getNamedQuery("Unternehmen.findAll");

             List<Unternehmen> unList = query.list();
             for (Unternehmen un : unList) {
                 un.setUnternehmennameId(Unternehmenname);

                 System.out.println("Liste der Unternehmen = " + un.getUnternehmenname()  + ","
                         + un.getUnternehmenname() );}

            /* Ausgabe eines Datensatzes mit UnternehmennameId
            query = session.getNamedQuery("Unternehmen.findByName");
            Unternehmen un = (Unternehmen) query.uniqueResult();
            System.out.println("Unternehmen UnternehmennameId=" + un.getUnternehmenname()  + " Name=" + un.getUnternehmenname()  + ", City=");

            // Ausgabe einer Liste mit Namen
            query = session.getNamedQuery("Unternehmen.findByName");
            unList = query.list();
            for (Unternehmen un1 : unList) {
                System.out.println("List of Employees::" + un1.getUnternehmenname()  + ","
                        + un1.getUnternehmenname() );
            }*/

             // safe Unternhemen Object
             System.out.println("Speichere Unternehmen...");

             //commit transaction
             session.getTransaction().commit();

             System.out.println("Done!");
         } catch (HibernateException e) {
             System.out.println("Hibernate Exception" + e.getMessage());
             session.getTransaction().rollback();
             throw new RuntimeException(e);
         } finally {
         }

     }






         final static Logger logger2 = Logger.getLogger(com.levermann.DatabaseStatements.Select.class);

         public void SelectLevermannschritteAlle () {
             //Logger wird für die Methode ausgeführt
             logger2.info("Logger is Entering the Execute method from Create");
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

                 //HQL Named Query FindAll Unternehmen
                 Query query = session.getNamedQuery("Unternehmen.findAll");
                 List<Unternehmen> unList = query.list();
                 for (Unternehmen un : unList) {
                     System.out.println("Liste der Unternehmen = " + un.getUnternehmenname()  + ","
                             + un.getUnternehmenname() );}



            //HQL Named Query FindAll Levermannschritte
            Query query1 = session.getNamedQuery("Levermannschritte.findAll");
            List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
            for (Levermannschritte un1 : unList1) {
                System.out.println("Liste der Levermannschritte = " + un1.getLevermannschrittAnalyseNameId() + ","
                        + un1.getUnternehmenname_Levermannschritte());}

            // Ausgabe eines Datensatzes mit UnternehmennameId
            query1 = session.getNamedQuery("Levermannschritte.findByName");
            Levermannschritte un1 = (Levermannschritte) query1.uniqueResult();
            System.out.println("Levermannschritte LevermannschrittAnalyseNameId=" + un1.getLevermannschrittAnalyseNameId() + " UnternehmennameId= =" + un1.getUnternehmenname_Levermannschritte());


                 // safe Unternhemen Object
                 System.out.println("Speichere Unternehmen...");

                 //commit transaction
                 session.getTransaction().commit();

                 System.out.println("Done!");
             } catch (HibernateException e) {
                 System.out.println("Hibernate Exception" + e.getMessage());
                 session.getTransaction().rollback();
                 throw new RuntimeException(e);
             } finally {
             }

         }


















 /*    //HQL Named Query FindAll Unternehmen
            Query query = session.getNamedQuery("Unternehmen.findAll");
            List<Unternehmen> unList = query.list();
            for (Unternehmen un : unList) {
              /*  System.out.println("Liste der Unternehmen = " + un.getUnternehmenname()  + ","
                        + un.getUnternehmenname() + un.getEigenkapital()+ + un.getJahresueberschuss());}

         if ( un.getEigenkapital() == un.getJahresueberschuss() == true)
            {
                System.out.println("yes" + un.getUnternehmenname() +un.getUnternehmenname() );

                //HQL Named Query FindAll Levermannschritte
                Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                for (Levermannschritte un1 : unList1)

                // Ausgabe eines Datensatzes mit UnternehmennameId
                query1 = session.getNamedQuery("Levermannschritte.findByUnternehmennameId");
                query1.setInteger("UnternehmennameId3", 6);
                Levermannschritte un1 = (Levermannschritte) query1.uniqueResult();
                System.out.println("Levermannschritte LevermannschrittAnalyseNameId=" + un1.getLevermannschrittAnalyseNameId() + " UnternehmennameId=" +  un1.getUnternehmenname_Levermannschritte());

                try {
                    Levermannschritte lv = new Levermannschritte();


                }

            }

            else { System.out.println("nope"+ " "+ un.getUnternehmenname() +" "+un.getUnternehmenname() );

                Levermannschritte lv = new Levermannschritte();
                lv.setUnternehmennameId3(un.getUnternehmenname() );
                lv.setEigenkapitalrendite(66666);
            }}

           */






}