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
 * @author Flandd done 01.03.2019
 */
public class SelectTest {

    public void SelectUnternehmen () {
    
    // Erstellung des Scanners
    Scanner scanner = new Scanner(System.in);    
    
    // SelectTest statement 
       String Select = "from Unternehmen where " ;
   
    System.out.println("Bitte wählen Sie: \n 0: alles \n 1: ID \n 2: Firmen");       

       
        // switch case
        int i = scanner.nextInt();
       
    SessionFactory factory;
    factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession(); 
    UnternehmenTest Unternehmen=new UnternehmenTest();
  
     // Verbingungsaufbau
     session.beginTransaction();

  switch(i){
      
      case 0:
             System.out.println("Sie erhalten nun eine gesamte Liste");  

      
     // Erzeugung der MYSQ Query       
     Query query0 = session.createQuery("from Unternehmen");
     // Zeilenbeginn der Auslese
     query0.setFirstResult(0);

     // Erstellung der Liste
     List<UnternehmenTest> users0 = (List<UnternehmenTest>) query0.list();
          
        System.out.println("ID + Unternehman" + " Eigenkapital" + " Jahresueberschuss " + "Datum");
        for (UnternehmenTest u : users0)
       
        // Ausgabe
              System.out.println( u.toString() );


          break; 
      
      
        case 1:
             System.out.println("Sie befinden sich in der IDauswahl, bitte ID Eingeben:");  
     // Eingabeauforderung ID
            int id = scanner.nextInt();
            Unternehmen.setCid(id); 
            
        System.out.println("Bitte wählen Sie: \n 0: name \n 1: ID \n 2: Eigenkapital \n 3: jahresueberschuss");       
        
        int f = scanner.nextInt();
        
        String group;
        

        
            switch(f){
                
                
                case 0:
                    group = "GROUP BY name"; 
                    break;
                case 1:
                     group = "GROUP BY id"; 
                    
                    break;
                
                case 2:
                     group = " GROUP BY eigenkapital"; 
                    
                    break;
                case 3:
                     group = "GROUP BY jahresueberschuss"; 
                    
                    break;
                default:
                    group = "";
                    break;
            }
            
      Select = "from Unternehmen where ID = " + Unternehmen.getCid() + group;   
     
     // Erzeugung der MYSQ Query       
     Query query1 = session.createQuery(Select);
   
     // Beginn der Auslese
     query1.setFirstResult(0);
     
     // Ende der Auslese
     //query.setMaxResults(9)
          
     
     
     // Erstellung der Liste
     List<UnternehmenTest> users1 = (List<UnternehmenTest>) query1.list();
          for (UnternehmenTest u : users1)
       

              
        // Ausgabe
        System.out.println(u.toString());
         break; 
 
    case 2:
       // Erzeugung der MYSQ Query   
        System.out.println("Sie befinden sich in der Unternehmensauswahl, bitte Name Eingeben:");  
        
        // Eingabeauforderung Name
         String name = scanner.next();
            Unternehmen.setName(name); 
    
             System.out.println("Bitte wählen Sie: \n 0: name \n 1: ID \n 2: Eigenkapital \n 3: jahresueberschuss");       
        
        int g = scanner.nextInt();
            
        String GroupName;
            
            switch(g){
                
                
                case 0:
                    GroupName = "GROUP BY name"; 
                    break;
                case 1:
                     GroupName = "GROUP BY id"; 
                    
                    break;
                
                case 2:
                     GroupName = " GROUP BY eigenkapital"; 
                    
                    break;
                case 3:
                     GroupName = "GROUP BY jahresueberschuss"; 
                    
                    break;
                default:
                    GroupName = "";
                    break;
            }
     
        Select = "from Unternehmen where name = " + "'" + Unternehmen.getName()+ "'" + GroupName;       

        // Erzeugung der MYSQ Query       
        Query query2 = session.createQuery(Select);
          
         query2.setFirstResult(0);
     
  
     // Erstellung der Liste
     List<UnternehmenTest> users2 = (List<UnternehmenTest>) query2.list();
     
     for (UnternehmenTest u : users2)
       
    // Ausgabe
        System.out.println(u.toString());
      break;        
                   }
   
     session.getTransaction().commit();
     session.close();         
     //  } while (i != 3);
      
            System.err.println("Abfrage Beendet");

      }  
    
    }                
                  

    
