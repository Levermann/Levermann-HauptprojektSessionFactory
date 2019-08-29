package com.levermann.mainMethod;

import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import com.levermann.utilHandling.CompanyG;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


abstract public class ConnectionMainFactory  {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

     BasicConfigurator.configure();

    final Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

     try {
         tx = session.beginTransaction();

Object ob = session.load(Company.class, new String ("Bmw"));
Company DP = (Company)  ob;
         System.out.println("name:" + DP.getCompanyname());




         session.getTransaction().commit();
         session.close();

     } catch (HibernateException e){
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			System.out.println("Done !");
		}

	}
}