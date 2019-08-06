package LevermannTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

/**
 *
 * @author Landb
 * 
 * 
 */

@Entity 

@Table(name="punkteliste")
public class PunktelisteTest implements Serializable {

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }

 

    @GeneratedValue(strategy=GenerationType.IDENTITY)
   
    
     
    @Id
    @Column(name="Pid")
    private int Pid;
    
        @Column(name="Cid2")
    private int Cid2;
    
    @Column(name="Eigenkapitalrendite ")
    private int Eigenkapitalrendite;
    
    @Column(name="EBITMarge ")
    private int EBITMarge;
    
    @Column(name="Eigenkapitalquote")
    private int Eigenkapitalquote;
    
    @Column(name="KursGewinnVerhältnis")
    private int KursGewinnVerhältnis;
    
    @Column(name="KursGewinnVerhältnisAktuell")
    private int KursGewinnVerhältnisAktuell;
    
    @Column(name="Analystenmeinungen")
    private int Analystenmeinungen;
    
    @Column(name="ReaktionaufQuartalszahlen")
    private int ReaktionaufQuartalszahlen;
    
    @Column(name="Gewinnrevision ")
    private int Gewinnrevision;
    
    @Column(name="Kursverlauf6Monate")
    private int Kursverlauf6Monate;

    @Column(name="Kursverlauf12Monate")
    private int Kursverlauf12Monate;
    
    @Column(name="Kursmomentum")
    private int Kursmomentum;  
    
    @Column(name="Dreimonatsreversal")
    private int Dreimonatsreversal;     

    @Column(name="Gewinnwachstum")
    private int Gewinnwachstum;      
        
PunktelisteTest() {}
    
    
    public int getCid2() {
        return Cid2;
    }

    public void setCid2(int Cid2) {
        this.Cid2 = Cid2;
    }

    public int getEigenkapitalrendite() {
        return Eigenkapitalrendite;
    }

    public void setEigenkapitalrendite(int Eigenkapitalrendite) {
        this.Eigenkapitalrendite = Eigenkapitalrendite;
    }

    public int getEBITMarge() {
        return EBITMarge;
    }

    public void setEBITMarge(int EBITMarge) {
        this.EBITMarge = EBITMarge;
    }

    public int getEigenkapitalquote() {
        return Eigenkapitalquote;
    }

    public void setEigenkapitalquote(int Eigenkapitalquote) {
        this.Eigenkapitalquote = Eigenkapitalquote;
    }

    public int getKursGewinnVerhältnis() {
        return KursGewinnVerhältnis;
    }

    public void setKursGewinnVerhältnis(int KursGewinnVerhältnis) {
        this.KursGewinnVerhältnis = KursGewinnVerhältnis;
    }

    public int getKursGewinnVerhältnisAktuell() {
        return KursGewinnVerhältnisAktuell;
    }

    public void setKursGewinnVerhältnisAktuell(int KursGewinnVerhältnisAktuell) {
        this.KursGewinnVerhältnisAktuell = KursGewinnVerhältnisAktuell;
    }

    public int getAnalystenmeinungen() {
        return Analystenmeinungen;
    }

    public void setAnalystenmeinungen(int Analystenmeinungen) {
        this.Analystenmeinungen = Analystenmeinungen;
    }

    public int getReaktionaufQuartalszahlen() {
        return ReaktionaufQuartalszahlen;
    }

    public void setReaktionaufQuartalszahlen(int ReaktionaufQuartalszahlen) {
        this.ReaktionaufQuartalszahlen = ReaktionaufQuartalszahlen;
    }

    public int getGewinnrevision() {
        return Gewinnrevision;
    }

    public void setGewinnrevision(int Gewinnrevision) {
        this.Gewinnrevision = Gewinnrevision;
    }

    public int getKursverlauf6Monate() {
        return Kursverlauf6Monate;
    }

    public void setKursverlauf6Monate(int Kursverlauf6Monate) {
        this.Kursverlauf6Monate = Kursverlauf6Monate;
    }

    public int getKursverlauf12Monate() {
        return Kursverlauf12Monate;
    }

    public void setKursverlauf12Monate(int Kursverlauf12Monate) {
        this.Kursverlauf12Monate = Kursverlauf12Monate;
    }

    public int getKursmomentum() {
        return Kursmomentum;
    }

    public void setKursmomentum(int Kursmomentum) {
        this.Kursmomentum = Kursmomentum;
    }

    public int getDreimonatsreversal() {
        return Dreimonatsreversal;
    }

    public void setDreimonatsreversal(int Dreimonatsreversal) {
        this.Dreimonatsreversal = Dreimonatsreversal;
    }

    public int getGewinnwachstum() {
        return Gewinnwachstum;
    }

    public void setGewinnwachstum(int Gewinnwachstum) {
        this.Gewinnwachstum = Gewinnwachstum;
    }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePersistenzEM");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    

    



   

    
}