/*

on Track

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.dao;


import com.levermann.entityclass.Unternehmen;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.Scanner;

  public class Delete implements DaoUnternehmen {

    final static Logger logger = Logger.getLogger(Delete.class);

    public void Dao() {

    //Logger wird für die Methode Delete ausgeführt
    logger.info("Logger is Entering the Execute method Delete");
    String returnValue = "";

    // Eingabeauforderung Unternehmen
    Scanner scanner = new Scanner(System.in);

    //Aufrufen der aktuellen Session aus HibernateUtil
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    try{
        // Hinzufügen des Loggers war erfolgreich
        logger.info("Logger for Delete was saved successfull");

       System.out.println("Sie befinden sich in der IDauswahl, bitte name Eingeben:");

       //Erzeugen eines Objektes vom Typen Unternehmen
        Unternehmen Unternehmen=new Unternehmen();

        // Eingabeauforderung ID
          //  int id = scanner.nextInt();
            int Cid = scanner.nextInt();


          //  Unternehmen.setCid(id); 
          Unternehmen.setCid(Cid);
            
     // Verbingungsaufbau
        session.beginTransaction();
        session.delete(Unternehmen);
        session.getTransaction().commit();
        System.out.println(" ID = " + Unternehmen.getCid() +" Name = " + Unternehmen.getName()+ " wurde gelöscht");
     
    } catch (HibernateException e) {
        System.out.println("Hibernate Exception" + e.getMessage());
        session.getTransaction().rollback();
        throw new RuntimeException(e);
    } finally {
    }
}
}                   
                  
