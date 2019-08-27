package com.levermann.mainMethod;

import com.levermann.entityclass.AnalysisRating;
import com.levermann.sessionControlClasses.HibernateUtil;
import com.levermann.utilHandling.AnalysisRatingG;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


abstract public class CreateRating {

 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

     BasicConfigurator.configure();

    final Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

     try {
         tx = session.beginTransaction();


         AnalysisRating analysisRating = new AnalysisRating();
         analysisRating.setAnalysisRatingName("KA");
         analysisRating.setId((float) 22);
         analysisRating.setCompanyname_AnalysisRating("KAAA");

        System.out.println("Got name with credentials " + analysisRating.getAnalysisRatingName()+ analysisRating.getCompanyname_AnalysisRating());

         session.save(analysisRating);
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