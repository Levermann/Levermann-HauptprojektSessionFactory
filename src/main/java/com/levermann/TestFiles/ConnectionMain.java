package com.levermann.TestFiles;

import com.levermann.entityclass.Punkteliste;
import com.levermann.entityclass.Unternehmen;
// import com.levermann.kennzahlen.Gewinnrevision;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionMain {


    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePersistenzEM");
        EntityManager em = emf.createEntityManager();
        try
        {
            Unternehmen unternehmen = new Unternehmen();
            unternehmen.setUnternehmenname("Adidas");
            unternehmen.setJahresueberschuss(666666);
            unternehmen.setEigenkapital(77778);




            em.getTransaction().begin();
            em.persist(unternehmen);
            em.getTransaction().commit();

            String query = "SELECT A FROM unternehmen_old A";
            for (Unternehmen A: em.createQuery(query, Unternehmen.class).getResultList())
                System.out.println(A.getUnternehmenname());
        }
        catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }













      /*  Gewinnrevision Gewinnrevision = new Gewinnrevision();
  Gewinnrevision.Gewinnrevision();




       */


       //System.out.println("Wilkommen in der Tabellenbearbeitung \n Bitte wählen Sie: \n 0. Unternehmen \n 2. Gewinnrevision");         
        
       
     //  Gewinnrevision gr = new Gewinnrevision ();
     //  gr.Gewinnrevision();
       
     
   
       
       
       //  TypedQuery<Unternehmen> query = em.createNamedQuery("Unternehmen.findAll", Unternehmen.class);
  //List <Unternehmen> results = query.getResultList();
          
       
       /*Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
  
        
  switch(i){  
    
      // Unternehmensauswahl
      case 0: 
 
     System.out.println("Wilkommen in der Tabellenbearbeitung für Unternehmen \n Bitte wählen Sie: \n 0. Erstellung \n 1. Auswertung \n 2. Aktualisierung \n 3. Löschen");       
      int j = scanner.nextInt();
 
      switch(j){
      
      case 0:     
        Create create = new Create ();
        create.CreateUnternehmen();
        break;
        
      case 1:
        Select select = new Select ();
        select.SelectUnternehmen();
        break;

      case 2:
        Update update = new Update ();
        update.UpdateUnternehmen();
        break;
      
      case 3:
        Delete delete = new Delete ();
        delete.DeleteUnternehmen();
        break;
        
      default:
          
          System.err.println("falsche Auswahl!");
          
          break;}   
      break;
      // Unternehmensauswahl ende
         
     // Gewinnrevision Punkt 8
     case 2:
         System.out.println("gewinnrevisionsaktualisierung Punkt 8 Levermann");   
Gewinnrevision Gewinnrevision = new Gewinnrevision ();
Gewinnrevision.Gewinnrevision();
         
     break;
     // Gewinnrevision Punkt 8 ende
     
     // default für Switch case     
     default:
      break;}
 
        System.out.println("Vielen Dank und auf Wiedersehen :)");
    
    /*

        System.out.println(" test 1234");
  
        System.out.println("nummer 1");
        
        
        printGregorianCalendarDate(); 
  
      System.out.println("Nummer 2");
      
  printSimpleDateFormat(); 
  
  
        System.out.println("ende :DDDDDD");*/
    }
    
}
