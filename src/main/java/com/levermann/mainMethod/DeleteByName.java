package com.levermann.mainMethod;

import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.AnalysisSteps;
import com.levermann.entityclass.Company;
import com.levermann.keyFiguresForAnalysis.Eigenkapitalrendite;
import com.levermann.sessionControlClasses.CalculateUserInput;
import com.levermann.sessionControlClasses.HibernateUtil;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        BasicConfigurator.configure();


        //Aufrufen der aktuellen Session aus HibernateUtil
        final Session session = HibernateUtil.getSessionFactory().openSession();
        Query query7 = session.getNamedQuery("AnalysisRating.findAll");
        final List<AnalysisRating> analysisRatingsFilled = (List<AnalysisRating>) query7.list();

        try {
            Transaction tx = null;
            tx = session.beginTransaction();

            //HQL Named Query FindAll Unternehmen
            Query query = session.getNamedQuery("Company.findAll");
            List<Company> unList = (List<Company>) query.list();

            for (Company un : unList) {

              //todo Hier companyname setzen

               String company = "Firma1";

                //HQL Named Query FindAll Levermannschritte
                Query query1 = session.getNamedQuery("AnalysisSteps.findall");
                List<AnalysisSteps> unList1 = (List<AnalysisSteps>) query1.list();
                for (AnalysisSteps un1 : unList1) {
                    System.out.println("Analyse Liste = " + un1.getAnalysisStepsName()
                            + ","
                            + un1.getCompanyname_AnalysisSteps());

                    // Ausgabe eines Datensatzes mit Cid
                    query1 = session.getNamedQuery("AnalysisSteps.findByName");
                    query1.setString("Companyname_AnalysisSteps", company);
                    unList1 = query1.list();
                    System.out.println("fuck y");
                    if (un1.getCompanyname_AnalysisSteps().equals(company)) {

                        System.out.println("Fuuuuuuuuuuuuuuuuck");

                        //Set Company
                        un1.setCompanyname_AnalysisSteps(un1.getCompanyname_AnalysisSteps());

                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                //un2.setEigenkapitalrendite((float)0);

                                System.out.println("company   :"  + un2.getCompanyname_AnalysisRating());
                            session.delete(un);
                            session.delete(un1);
                            session.delete(un2);
                            }
                        }
                    }}}

            session.getTransaction().commit();
            session.close();
            //    System.out.println("fuck youuuuuuuuuuuu" + un1.getEigenkapitalrendite()+ un1.getCompanyname_AnalysisSteps());
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