package com.levermann.Todo;

import com.levermann.sessionControlClasses.Analysissteps;
import com.levermann.sessionControlClasses.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import com.levermann.utilHandling.AnalysisstepsG;
import com.levermann.utilHandling.AnalysisstepsG;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


abstract public class ConnectionMainFactoryCreateAnalysissteps {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

     BasicConfigurator.configure();

    final Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

     try {
         tx = session.beginTransaction();

         AnalysisstepsG analysisstepsG = new AnalysisstepsG();
         analysisstepsG.setSession(session);


        Analysissteps analysissteps = new Analysissteps();
         analysissteps.setAnalysisStepsName("GEilsteAnaLyse");

         System.out.println("Got name with credentials " + analysissteps.getAnalysisStepsName());

         analysisstepsG.makePersistent(analysissteps);
         Analysissteps analysissteps1 = analysisstepsG.getACompanyByID(analysissteps.getAnalysisStepsName());
         System.out.println(analysissteps1.getAnalysisStepsName());

         session.save(analysissteps1);
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