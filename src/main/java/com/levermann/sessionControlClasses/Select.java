/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.sessionControlClasses;


import java.util.List;
import java.util.Scanner;


import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.Company;
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
            Query query = session.getNamedQuery("Company.findAll");
            List<Company> unList = query.list();
            for (Company un : unList) {
                System.out.println("Liste der Unternehmen = " + un.getCompanyname()  + ","
                        + un.getCompanyname() );}

            /* Ausgabe eines Datensatzes mit UnternehmennameId
            query = session.getNamedQuery("Unternehmen.findByName");
            Unternehmen un = (Unternehmen) query.uniqueResult();
            System.out.println("Unternehmen UnternehmennameId=" + un.getCompanyname()  + " Name=" + un.getCompanyname()  + ", City=");

            // Ausgabe einer Liste mit Namen
            query = session.getNamedQuery("Unternehmen.findByName");
            unList = query.list();
            for (Unternehmen un1 : unList) {
                System.out.println("List of Employees::" + un1.getCompanyname()  + ","
                        + un1.getCompanyname() );
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

     public void SelectUnternehmenByName (String name) {
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
             Query query = session.getNamedQuery("Company.findAll");

             List<Company> unList = query.list();
             for (Company un : unList) {
                 un.setCompanyname(name);

                 System.out.println("Liste der Unternehmen = " + un.getCompanyname()  + ","
                         + un.getCompanyname() );}

            /* Ausgabe eines Datensatzes mit UnternehmennameId
            query = session.getNamedQuery("Unternehmen.findByName");
            Unternehmen un = (Unternehmen) query.uniqueResult();
            System.out.println("Unternehmen UnternehmennameId=" + un.getCompanyname()  + " Name=" + un.getCompanyname()  + ", City=");

            // Ausgabe einer Liste mit Namen
            query = session.getNamedQuery("Unternehmen.findByName");
            unList = query.list();
            for (Unternehmen un1 : unList) {
                System.out.println("List of Employees::" + un1.getCompanyname()  + ","
                        + un1.getCompanyname() );
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

         final static Logger logger2 = Logger.getLogger(com.levermann.sessionControlClasses.Select.class);

         public void SelectAnalysisRatingAlle () {
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
                 Query query = session.getNamedQuery("Company.findAll");
                 List<Company> unList = query.list();
                 for (Company un : unList) {
                     System.out.println("Liste der Unternehmen = " + un.getCompanyname()  + ","
                             + un.getCompanyname() );}



            //HQL Named Query FindAll AnalysisRating
            Query query1 = session.getNamedQuery("AnalysisRating.findAll");
            List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
            for (AnalysisRating un1 : unList1) {
                System.out.println("Liste der AnalysisRating = " + un1.getAnalysisRatingName() + ","
                        + un1.getAnalysisRatingName());}

            // Ausgabe eines Datensatzes mit UnternehmennameId
            query1 = session.getNamedQuery("AnalysisRating.findByName");
            AnalysisRating un1 = (AnalysisRating) query1.uniqueResult();
            System.out.println("AnalysisRating LevermannschrittAnalyseNameId=" + un1.getAnalysisRatingName() + " UnternehmennameId= =" + un1.getAnalysisRatingName());


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
              /*  System.out.println("Liste der Unternehmen = " + un.getCompanyname()  + ","
                        + un.getCompanyname() + un.getEigenkapital()+ + un.getJahresueberschuss());}

         if ( un.getEigenkapital() == un.getJahresueberschuss() == true)
            {
                System.out.println("yes" + un.getCompanyname() +un.getCompanyname() );

                //HQL Named Query FindAll AnalysisRating
                Query query1 = session.getNamedQuery("AnalysisRating.findAll");
                List<AnalysisRating> unList1 = (List<AnalysisRating>) query1.list();
                for (AnalysisRating un1 : unList1)

                // Ausgabe eines Datensatzes mit UnternehmennameId
                query1 = session.getNamedQuery("AnalysisRating.findByUnternehmennameId");
                query1.setInteger("UnternehmennameId3", 6);
                AnalysisRating un1 = (AnalysisRating) query1.uniqueResult();
                System.out.println("AnalysisRating LevermannschrittAnalyseNameId=" + un1.getLevermannschrittAnalyseNameId() + " UnternehmennameId=" +  un1.getCompanyname_AnalysisRating());

                try {
                    AnalysisRating lv = new AnalysisRating();


                }

            }

            else { System.out.println("nope"+ " "+ un.getCompanyname() +" "+un.getCompanyname() );

                AnalysisRating lv = new AnalysisRating();
                lv.setUnternehmennameId3(un.getCompanyname() );
                lv.setEigenkapitalrendite(66666);
            }}

           */






}