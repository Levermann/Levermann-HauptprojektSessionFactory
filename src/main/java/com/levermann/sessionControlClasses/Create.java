/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.sessionControlClasses;


import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.AnalysisSteps;
import com.levermann.entityclass.Company;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.apache.log4j.Logger;

public class Create {

    final static Logger logger1 = Logger.getLogger(Create.class);

  /*  public void CreateCompany(String name) {

        //Logger wird für die Methode ausgeführt
        logger1.info("Logger is Entering the Execute method from Create");
        String returnValue = "";

        //Aufrufen der aktuellen Session aus HibernateUtil

        SessionFactory sessionOne = (SessionFactory) HibernateUtil.getSessionFactory().openSession().sessionWithOptions();

        sessionOne.getCurrentSession().beginTransaction();

        Company company = new Company();
        company.setCompanyname(name);



        AnalysisSteps punkteliste = new AnalysisSteps();
        punkteliste.setAnalysisStepsName(name);
        punkteliste.setCompanyname_AnalysisSteps(name);

        Integer generateUnternehmenId = company.getId();
        Float generateAnalysisStepsId = punkteliste.getId();

        Session sessionTwo = HibernateUtil.getSessionFactory().openSession();
        sessionTwo.beginTransaction();

        Company company1 = (Company) sessionTwo.get(Company.class, generateUnternehmenId);
        AnalysisSteps punkteliste1 = (AnalysisSteps) sessionTwo.get(AnalysisSteps.class, generateAnalysisStepsId);

        System.out.println(company.getId());

        HibernateUtil.shutdown();
    }
}
   /*     try {
            Scanner scanner = new Scanner(System.in);
            //    String datum = scanner.next();

            //create a unternehmen object
            System.out.println("Creating new Unternehmen Object");
            Unternehmen un = new Unternehmen();
            AnalysisSteps analysisSteps = new AnalysisSteps();
            AnalysisRating lvschrt = new AnalysisRating();

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
*/
    final static Logger logger2 = Logger.getLogger(Select.class);

    public void CreateAnalysisSteps(String AnalysisSteps ) {

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
            AnalysisSteps analysisSteps = new AnalysisSteps();
            analysisSteps.setAnalysisStepsName(AnalysisSteps);

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


    public void CreateAnalysisRating(String AnalysisRatingName ) {

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

            AnalysisRating lvschrt = new AnalysisRating();

            lvschrt.setAnalysisRatingName(AnalysisRatingName);



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

    }}


