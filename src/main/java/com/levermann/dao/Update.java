/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.dao;

import com.levermann.entityclass.Unternehmen;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

 public class Update implements DaoUnternehmen {

    final static Logger logger = Logger.getLogger(Update.class);

    public void Dao () {

        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";

        Scanner scanner = new Scanner(System.in);    
        // Eingabeauforderung Unternehmen

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

  try {
      // Hinzufügen des Loggers war erfolgreich
      logger.info("Logger for Update was saved successfull");

    System.out.println("Eingabe:\n 1. ID \n 2. Unternehmen \n 3. Datum \n 4. Eigenkapital \n 5. Jahresueberschuss");

      //Erzeugen eines Objektes vom Typen Unternehmen
      Unternehmen Unternehmen=new Unternehmen();

    //Select Primärschlüssel
    int cid = scanner.nextInt();
    Unternehmen.setCid(cid);

   //Select Name der Firma
    String name = scanner.next();    
    Unternehmen.setName(name);

    //Select Datum der Änderung
    String datum = scanner.next();
    Unternehmen.setDatum(datum);

    //Select Eigenkapital der Firma
    float  eigenkapital = scanner.nextInt(); 
    Unternehmen.setEigenkapital(eigenkapital);   

    //Select Jahresüberschuss der Firma
    float  jahresueberschuss = scanner.nextInt();
    Unternehmen.setJahresueberschuss(jahresueberschuss);

    //Beginn der Datenübertragung
    session.beginTransaction();
        
    //Umesetzung der Update Methode auf das ausgewählte Unternehmen
    session.update(Unternehmen);
    
    // Übertragung bestätigen
    session.getTransaction().commit();

  }
	finally{}}

}
