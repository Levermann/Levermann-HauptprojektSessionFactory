/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LevermannTest;

import com.mycompany.demo.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
/**
 *
* @author Flandd done 01.03.2019
 */
public class UpdateTest {


    public void UpdateUnternehmen () {

        Scanner scanner = new Scanner(System.in);    
// Eingabeauforderung UnternehmenTest
  
         
   SessionFactory factory;
	factory = (SessionFactory) new Configuration().configure().addAnnotatedClass(UnternehmenTest.class).buildSessionFactory();
     Session session = factory.openSession(); 
   UnternehmenTest Unternehmen=new UnternehmenTest();
   
  try {      
    System.out.println("Eingabe:\n 1. ID \n 2. Unternehmen \n 3. Datum \n 4. Eigenkapital \n 5. Jahresueberschuss");
       
    //Select Primärschlüssel
   int cid = scanner.nextInt();
   Unternehmen.setCid(cid);
    
    String name = scanner.next();    
    Unternehmen.setName(name);
    
    String datum = scanner.next();
    Unternehmen.setDatum(datum);
   
    float  eigenkapital = scanner.nextInt(); 
    Unternehmen.setEigenkapital(eigenkapital);   
    float  jahresueberschuss = scanner.nextInt();
    Unternehmen.setJahresueberschuss(jahresueberschuss); 
     
    session.beginTransaction(); 
        
   // Aktion   
        session.update(Unternehmen);
    
    // Variablen zum UpdateTest    
        session.getTransaction().commit();}
	finally{factory.close();}}
    
 
    
        
}