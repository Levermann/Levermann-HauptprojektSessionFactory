package com.levermann.mainMethod;

import com.levermann.sessionControlClasses.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import com.levermann.utilHandling.CompanyG;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


abstract public class ConnectionMainFactoryUpdate {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

     BasicConfigurator.configure();

    final Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

     try {
         tx = session.beginTransaction();

         CompanyG companyG = new CompanyG();
         companyG.setSession(session);

       //  GregorianCalendar now = new GregorianCalendar();
      //   Date df = DateFormat.getDateInstance(DateFormat.SHORT);   // 14.04.12
      //   df = Date.getDateInstance(DateFormat.MEDIUM);



         Company company = new Company();
         company.setCompanyname("d");
         company.setDatum("22.08.2019");
        company.setEigenkapital(500.00);
         company.setJahresueberschuss(500.00);
         company.setGewinnEbit(500.00);
         company.setJahresumsatz(500.00);
         company.setFremdkapital(500.00);
         company.setAktuellerAktienkurs(500.00);
         company.setGewinnschaezung(500.00);
         company.setGewinnAvg(500.00);
         company.setHalten(500.00);
         company.setVerkaufen(500.00);
         company.setKaufen(1.00);
         company.setKursanstiegUnternehmen(1.00);
         company.setKursanstiegIndex(1.00);




         System.out.println("Got name with credentials " + company.getCompanyname());

         companyG.makePersistent(company);
         Company company1 = companyG.getACompanyByID(company.getCompanyname());
         System.out.println(company1.getCompanyname());

         session.update(company);

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