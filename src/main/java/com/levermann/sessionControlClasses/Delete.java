/*

on Track

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.sessionControlClasses;


import com.levermann.entityclass.Unternehmen;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.Scanner;

  public class Delete {

    final static Logger logger = Logger.getLogger(Delete.class);

    public void Unternehmen( String UnternehmennameId) {

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

        //  Unternehmen.setUnternehmennameId(id);
        Unternehmen.setUnternehmennameId(UnternehmennameId);
            
     // Verbingungsaufbau
        session.beginTransaction();
        session.delete(Unternehmen);
        session.getTransaction().commit();
        System.out.println(" ID = " + Unternehmen.getUnternehmennameId() +" Name = " + Unternehmen.getUnternehmenname() + " wurde gelöscht");
     
    } catch (HibernateException e) {
        System.out.println("Hibernate Exception" + e.getMessage());
        session.getTransaction().rollback();
        throw new RuntimeException(e);
    } finally {
    }
}
}                   
                  
