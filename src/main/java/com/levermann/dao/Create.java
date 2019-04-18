/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.dao;


import com.levermann.entityclass.Unternehmen;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;


public class Create {
 
     public void CreateUnternehmen () {
             System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");

        Scanner scanner = new Scanner(System.in);
           String name = scanner.next();
                      String datum = scanner.next();
           float eigenkapital = scanner.nextInt();
           float jahresueberschuss = scanner.nextInt();

         
    SessionFactory factory;
    factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession(); 
    
    
      try{
            //create a unternehmen object
            System.out.println("Creating new Unternehmen Object");
      
            Unternehmen un = new Unternehmen ();

            un.setName(name); 
            un.setDatum(datum);
            un.setEigenkapital(eigenkapital);
            un.setJahresueberschuss(jahresueberschuss);
                        
            // start a transaction
            session.beginTransaction();
             
            // safe Unternhemen Object
            System.out.println("Speichere Unternehmen...");
            session.save(un);
          //   } while(Company!="stopp");
            //commit transaction
            
            session.getTransaction().commit();
            System.out.println("Done!");
     
        }finally{factory.close();}         
      
     
    }
     
}
