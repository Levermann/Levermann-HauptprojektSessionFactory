package com.levermann.mainMethod;

import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.Transaction;


abstract public class ConnectionMainFactory  {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

     BasicConfigurator.configure();

     try {
         Session s = HibernateUtil.getSession();
         s.beginTransaction();
         s.getTransaction().commit();
         System.out.println("Insert");

     }
     catch (Exception e) {
         System.out.println("Erroryyy" + e.getMessage());
     }
  /*   final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Company company = new Company();
        company.setCompanyname("BMW");
        company.setEigenkapital(123214);
        company.setFremdkapital(324234);

        session.save(company);

        session.getTransaction().commit();
        HibernateUtil.shutdown();


   */

     }

 }
