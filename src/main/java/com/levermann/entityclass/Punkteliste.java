package com.levermann.entityclass;

import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.OneToOne;



@Entity
@Access(AccessType.FIELD)
//@Table(name="unternehmen")
@NamedQueries({
        @NamedQuery(name = "Punkteliste.findall", query = "SELECT A FROM Punkteliste A"),
        @NamedQuery(name = "Punkteliste.findById", query = "SELECT c FROM Punkteliste c WHERE c.Pid =:Pid")

})
@Table(name="punkteliste")
 public class Punkteliste implements Serializable {

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name="Pid")
    private Integer Pid;

    @Column(name="Cid2")
    private Integer Cid2;

    @Column(name="Eigenkapitalrendite")
    private Integer Eigenkapitalrendite;

    @Column(name="EBITMarge")
    private Integer EBITMarge;

    @Column(name="Eigenkapitalquote")
    private Integer Eigenkapitalquote;

    @Column(name="KursGewinnVerhaeltnis")
    private Integer KursGewinnVerhaeltnis;

    @Column(name="KursGewinnVerhaeltnisAktuell")
    private Integer KursGewinnVerhaeltnisAktuell;

    @Column(name="Analystenmeinungen")
    private Integer Analystenmeinungen;

    @Column(name="ReaktionaufQuartalszahlen")
    private Integer ReaktionaufQuartalszahlen;

    @Column(name="Gewinnrevision")
    private Integer Gewinnrevision;

    @Column(name="Kursverlauf6Monate")
    private Integer Kursverlauf6Monate;

    @Column(name="Kursverlauf12Monate")
    private Integer Kursverlauf12Monate;

    @Column(name="Kursmomentum")
    private Integer Kursmomentum;

    @Column(name="Dreimonatsreversal")
    private Integer Dreimonatsreversal;

    @Column(name="Gewinnwachstum")
    private Integer Gewinnwachstum;


    public Punkteliste() {
    }


    @ManyToOne(optional = false)
    private Unternehmen Punkteliste;

    public Unternehmen getPunkteliste() {
        return Punkteliste;
    }

    public void setPunkteliste(Unternehmen punkteliste) {
        Punkteliste = punkteliste;
    }

    @ManyToOne(optional = false)
    private Unternehmen Punkteliste1;

    public Unternehmen getPunkteliste1() {
        return Punkteliste1;
    }

    public void setPunkteliste1(Unternehmen punkteliste1) {
        Punkteliste1 = punkteliste1;
    }

    public Integer getPid() {
        return Pid;
    }

    public void setPid(Integer pid) {
        Pid = pid;
    }

    public Integer getCid2() {
        return Cid2;
    }

    public void setCid2(Integer cid2) {
        Cid2 = cid2;
    }

    public Integer getEigenkapitalrendite() {
        return Eigenkapitalrendite;
    }

    public void setEigenkapitalrendite(Integer eigenkapitalrendite) {
        Eigenkapitalrendite = eigenkapitalrendite;
    }

    public Integer getEBITMarge() {
        return EBITMarge;
    }

    public void setEBITMarge(Integer EBITMarge) {
        this.EBITMarge = EBITMarge;
    }

    public Integer getEigenkapitalquote() {
        return Eigenkapitalquote;
    }

    public void setEigenkapitalquote(Integer eigenkapitalquote) {
        Eigenkapitalquote = eigenkapitalquote;
    }

    public Integer getKursGewinnVerhaeltnis() {
        return KursGewinnVerhaeltnis;
    }

    public void setKursGewinnVerhaeltnis(Integer kursGewinnVerhaeltnis) {
        KursGewinnVerhaeltnis = kursGewinnVerhaeltnis;
    }

    public Integer getKursGewinnVerhaeltnisAktuell() {
        return KursGewinnVerhaeltnisAktuell;
    }

    public void setKursGewinnVerhaeltnisAktuell(Integer kursGewinnVerhaeltnisAktuell) {
        KursGewinnVerhaeltnisAktuell = kursGewinnVerhaeltnisAktuell;
    }

    public Integer getAnalystenmeinungen() {
        return Analystenmeinungen;
    }

    public void setAnalystenmeinungen(Integer analystenmeinungen) {
        Analystenmeinungen = analystenmeinungen;
    }

    public Integer getReaktionaufQuartalszahlen() {
        return ReaktionaufQuartalszahlen;
    }

    public void setReaktionaufQuartalszahlen(Integer reaktionaufQuartalszahlen) {
        ReaktionaufQuartalszahlen = reaktionaufQuartalszahlen;
    }

    public Integer getGewinnrevision() {
        return Gewinnrevision;
    }

    public void setGewinnrevision(Integer gewinnrevision) {
        Gewinnrevision = gewinnrevision;
    }

    public Integer getKursverlauf6Monate() {
        return Kursverlauf6Monate;
    }

    public void setKursverlauf6Monate(Integer kursverlauf6Monate) {
        Kursverlauf6Monate = kursverlauf6Monate;
    }

    public Integer getKursverlauf12Monate() {
        return Kursverlauf12Monate;
    }

    public void setKursverlauf12Monate(Integer kursverlauf12Monate) {
        Kursverlauf12Monate = kursverlauf12Monate;
    }

    public Integer getKursmomentum() {
        return Kursmomentum;
    }

    public void setKursmomentum(Integer kursmomentum) {
        Kursmomentum = kursmomentum;
    }

    public Integer getDreimonatsreversal() {
        return Dreimonatsreversal;
    }

    public void setDreimonatsreversal(Integer dreimonatsreversal) {
        Dreimonatsreversal = dreimonatsreversal;
    }

    public Integer getGewinnwachstum() {
        return Gewinnwachstum;
    }

    public void setGewinnwachstum(Integer gewinnwachstum) {
        Gewinnwachstum = gewinnwachstum;
    }
}