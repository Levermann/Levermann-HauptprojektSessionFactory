/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.dao;


import com.levermann.entityclass.Levermannschritte;
import com.levermann.entityclass.Unternehmen;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Scanner;

public class SelectSchritt1jahresueberschuss {

   final static Logger logger = Logger.getLogger(SelectSchritt1jahresueberschuss.class);

   public void Dao (String Unternehmen) {

       //Logger wird für die Methode ausgeführt
       logger.info("Logger is Entering the Execute method from Create");
       String returnValue = "";

       System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");

       //Aufrufen der aktuellen Session aus HibernateUtil
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session = sessionFactory.getCurrentSession();
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
           Query query = session.getNamedQuery("Unternehmen.findAll");
           List<Unternehmen> unList = query.list();
           for (Unternehmen un : unList) {
              /* System.out.println("Liste der Unternehmen = " + un.getCid() + ","
                       + un.getName()); */
                       }


           // Ausgabe einer Liste mit Namen
           query = session.getNamedQuery("Unternehmen.findByName");
           query.setString("name", Unternehmen);
           unList = query.list();
           for (Unternehmen un1 : unList) {
               System.out.println("Unternehmen:  " + un1.getName()+  "  " + un1.getJahresueberschuss());
           }

/*    //HQL Named Query FindAll Unternehmen
           Query query = session.getNamedQuery("Unternehmen.findAll");
           List<Unternehmen> unList = query.list();
           for (Unternehmen un : unList) {
             /*  System.out.println("Liste der Unternehmen = " + un.getCid() + ","
                       + un.getName()+ un.getEigenkapital()+ + un.getJahresueberschuss());}

        if ( un.getEigenkapital() == un.getJahresueberschuss() == true)
           {
               System.out.println("yes" + un.getName()+un.getCid());

               //HQL Named Query FindAll Levermannschritte
               Query query1 = session.getNamedQuery("Levermannschritte.findAll");
               List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
               for (Levermannschritte un1 : unList1)

               // Ausgabe eines Datensatzes mit Cid
               query1 = session.getNamedQuery("Levermannschritte.findByCId");
               query1.setInteger("Cid3", 6);
               Levermannschritte un1 = (Levermannschritte) query1.uniqueResult();
               System.out.println("Levermannschritte Lid=" + un1.getLid() + " Cid=" +  un1.getCid3());

               try {
                   Levermannschritte lv = new Levermannschritte();


               }

           }

           else { System.out.println("nope"+ " "+ un.getName()+" "+un.getCid());

               Levermannschritte lv = new Levermannschritte();
               lv.setCid3(un.getCid());
               lv.setEigenkapitalrendite(66666);
           }}

          */




           // safe Unternhemen Object
           System.out.println("Speichere Unternehmen...");

           //commit transaction
           session.getTransaction().commit();

           System.out.println("Done!");
       } catch (HibernateException e) {
           System.out.println("Hibernate Exception" + e.getMessage());
           session.getTransaction().rollback();
           throw new RuntimeException(e);
       } finally {
       }

   }

}