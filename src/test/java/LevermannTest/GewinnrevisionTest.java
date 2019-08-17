/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LevermannTest;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Landb
 */
public class GewinnrevisionTest {
    
    public void Gewinnrevision () {
    
      
    SessionFactory factory;
    factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
    Session session1 = factory.openSession(); 
      try{  
    UnternehmenTest Un= new UnternehmenTest();
  
     // Verbingungsaufbau
     session1.beginTransaction();
     
    System.out.println("Sie erhalten nun eine gesamte Liste");  

      
     // Erzeugung der MYSQ Query       
     Query query0 = session1.createQuery("from Unternehmen");
     // Zeilenbeginn der Auslese
     query0.setFirstResult(0);

     // Erstellung der Liste
     List<UnternehmenTest> users0 = (List<UnternehmenTest>) query0.list();
          
        System.out.println("ID + Unternehman" + " Eigenkapital" + " Jahresueberschuss " + "Datum");
        for (UnternehmenTest u : users0)
       
        // Ausgabe
    

        if ( u.getEigenkapital() != u.getJahresueberschuss() == true){
                    
            
           System.out.println( u.getCid() + " \t" + u.getName() +  "\t" + u.getEigenkapital()+ " € " +  "\t" + u.getJahresueberschuss()+ " € "+ u.getDatum() );
       
              // Erzeugung der MYSQ Query       
     Query query2 = session1.createQuery("from Punkteliste where CID2 = '" + u.getCid() +"'");
     // Zeilenbeginn der Auslese
     query2.setFirstResult(0);

     // Erstellung der Liste
     List<PunktelisteTest> users1 = (List<PunktelisteTest>) query2.list();
          
        System.out.println("ID + Unternehman" + " Eigenkapital" + " Jahresueberschuss " + "Datum");
        for (PunktelisteTest o : users1)   
                   
          o.setGewinnrevision(1);
        
                
          System.out.println( "test" );
   
	   
          
        }
        
       else
            System.out.println("");
        
     session1.getTransaction().commit();
     session1.close();         
     //  } while (i != 3);
             
      }finally{factory.close();}} 
    
}
