package com.levermann.keyFiguresForAnalysisOld;


import com.levermann.entityclass.AnalysisSteps;
import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.*;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class Eigenkapitalrendite {

final static Logger logger = Logger.getLogger(Eigenkapitalrendite.class);

public void CalculateEigenkapitalrendite( ) {

    //Aufrufen der aktuellen Session aus HibernateUtil
    final Session session = HibernateUtil.getSessionFactory().openSession();

    try {
        Transaction tx = null;
        tx = session.beginTransaction();


    //HQL Named Query FindAll Unternehmen
    Query query = session.getNamedQuery("Company.findAll");
    List<Company> unList = (List<Company>) query.list();

    for (Company un : unList) {

        String company = un.getCompanyname();


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
            if (un1.getCompanyname_AnalysisSteps().equals(company)){

                System.out.println("Fuuuuuuuuuuuuuuuuck");

un1.setCompanyname_AnalysisSteps(un1.getCompanyname_AnalysisSteps());
                un1.setEigenkapitalrendite(un.getJahresueberschuss()/un.getEigenkapital());


            }

                // todo If Abgleich   if (query1 != null){

          //      un1.setCompanyname_AnalysisSteps(un.getCompanyname());

          //  un1.setEigenkapitalrendite((float) 1111);


        }

    }
        session.getTransaction().commit();
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