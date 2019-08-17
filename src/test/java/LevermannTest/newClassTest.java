/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package LevermannTest;

import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Landb
 */
public class newClassTest {
    
    /*
    Logger log = Logger.getLogger(this.getClass().getName());
    
   @PersistenceContext
    EntityManager entityManager;
   
   public  EntityManager getEntityManager() {
    return emf.createEntityManager();}
   
    private EntityManagerFactory emf;
    
    public Unternehmen getMovie(Long movieId) {
    EntityManager em = getEntityManager();
    Unternehmen Unternehmen = em.find(Unternehmen.class, new Long(movieId));
    em.detach(Unternehmen);
    return Unternehmen;
}
    
    
    @Before
    public void init(){
    emf = Persistence.createEntityManagerFactory("HibernatePersistenzEM");
    }
    
   @After
    public void close(){
        emf.close();
        
    }
    
    
    public void createUnternehmen(){
        
          
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
    Unternehmen un = new Unternehmen();

        
        un.setId(3);
        un.setDate("29.03.2019");
        un.setEigenkapital(5000);
        un.setJahresueberschuss(50000);
        un.setName("BMWW");
        
       em.persist(un);
       em.getTransaction().commit();
    }
    
    
}
    
    
    /*
     public static void main(String[] args)
   {
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "HibernatePersistenzEM");
      EntityManager entitymanager = emfactory.createEntityManager( );
   

      
        entitymanager.getTransaction( ).begin( );
      
      Unternehmen Unternehmen = new Unternehmen( ); 
      Unternehmen.setEigenkapital(50000);
      Unternehmen.setId(2);
      Unternehmen.setJahresueberschuss(60000);
      Unternehmen.setName("bmw");
      Unternehmen.setDate("24.02.2016");
      
        
      entitymanager.persist( Unternehmen );
      entitymanager.getTransaction( ).commit( );

      entitymanager.close( );
      emfactory.close( );
   }
    */
    

}