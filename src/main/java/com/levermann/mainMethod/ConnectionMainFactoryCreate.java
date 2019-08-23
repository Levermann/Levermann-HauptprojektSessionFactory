package com.levermann.mainMethod;

import com.levermann.sessionControlClasses.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import com.levermann.utilHandling.CompanyG;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


abstract public class ConnectionMainFactoryCreate {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

     BasicConfigurator.configure();

    final Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

     try {
         tx = session.beginTransaction();

         CompanyG companyG = new CompanyG();
         companyG.setSession(session);


        Company company = new Company();
        company.setCompanyname("Audi");
         System.out.println("Got name with credentials " + company.getCompanyname());

         companyG.makePersistent(company);
         Company company1 = companyG.getACompanyByID(company.getCompanyname());
         System.out.println(company1.getCompanyname());

         session.save(company);
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