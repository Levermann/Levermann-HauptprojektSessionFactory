/*


package com.levermann.TestFiles;


import com.levermann.dao.DaoUnternehmen;
import com.levermann.dao.HibernateUtil;
import com.levermann.entityclass.Levermannschritte;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class GewinnrevisionOld implements DaoUnternehmen {

   final static Logger logger = Logger.getLogger(Gewinnrevision.class);

   public void Dao () {
       //Logger wird für die Methode ausgeführt
       logger.info("Logger is Entering the Execute method from Create");
       String returnValue = "";

       System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");

       //Aufrufen der aktuellen Session aus HibernateUtil
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session = sessionFactory.getCurrentSession();
       Session session1 = sessionFactory.getCurrentSession();
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
           Query query = session.getNamedQuery("Levermannschritte.findAll");
           List<Levermannschritte> unList = (List<Levermannschritte>) query.list();
           for (Levermannschritte un : unList) {

              float i;
              i =  ((float)un.getKursGewinnVerhältnisAktuell()/(float)un.getKursGewinnVerhältnis())*100-100;
               DecimalFormat f = new DecimalFormat("#0.00");
               double toFormat = ((double)Math.round(i*100))/100;
               f.format(toFormat);


               i = Math.round(i);
               i = i / 100;

                 if (i >= 0.05 == true){

                     un.setGewinnrevision(1);

                     System.out.println("Fall 1 : yea LID:  "+un.getLid() +" AM: "+ un.getGewinnrevision());
                 }

                 if (i <= - 0.05 == true )

                 {    // un.setLid(un.getLid());
                     un.setGewinnrevision(-1);

                     //   un.setAnalystenmeinungen(111);
                     System.out.println("Fall 2 : yea LID:  "+un.getLid() +" AM: "+ un.getGewinnrevision());
                 }

                 if (i< - 0.05 == false && i > 0.005 == false ) {

                     // un.setLid(un.getLid());
                     un.setGewinnrevision(0);

                     //   un.setAnalystenmeinungen(111);
                     System.out.println("Fall 3 : yea LID:  "+un.getLid() +" AM: "+ un.getGewinnrevision());

                 }

               System.out.println("Liste der Levermannschritte = " + un.getLid() +
                        " Kursgewinn aktuell: "+ un.getKursGewinnVerhältnisAktuell() + " Kursgewinn Verhältniss: "+ un.getKursGewinnVerhältnis()+" summe:" + i);}


           //commit transaction
           session.getTransaction().commit();



                 // safe Unternhemen Object
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

 */