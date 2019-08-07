package com.levermann.entityclass;

import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.OneToOne;



@Entity
@Access(AccessType.FIELD)
//@Table(name="unternehmen")
@NamedQueries({
        @NamedQuery(name = "Punkteliste.findall", query = "SELECT A FROM Punkteliste A"),
        @NamedQuery(name = "Punkteliste.findById", query = "SELECT c FROM Punkteliste c WHERE c.id =:id")

})
@Table(name="punkteliste")
 public class Punkteliste implements Serializable {



    @Id
    @Column(name = "PunktelisteNameId")
    private Integer PunktelisteNameId;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "Unternehmenname_Punkteliste")
    private String Unternehmenname_Punkteliste;

    @Column(name = "Eigenkapitalrendite")
    private Integer Eigenkapitalrendite;

    @Column(name = "EBITMarge")
    private Integer EBITMarge;

    @Column(name = "Eigenkapitalquote")
    private Integer Eigenkapitalquote;

    @Column(name = "KursGewinnVerhaeltnis")
    private Integer KursGewinnVerhaeltnis;

    @Column(name = "KursGewinnVerhaeltnisAktuell")
    private Integer KursGewinnVerhaeltnisAktuell;

    @Column(name = "Analystenmeinungen")
    private Integer Analystenmeinungen;

    @Column(name = "ReaktionaufQuartalszahlen")
    private Integer ReaktionaufQuartalszahlen;

    @Column(name = "Gewinnrevision")
    private Integer Gewinnrevision;

    @Column(name = "Kursverlauf6Monate")
    private Integer Kursverlauf6Monate;

    @Column(name = "Kursverlauf12Monate")
    private Integer Kursverlauf12Monate;

    @Column(name = "Kursmomentum")
    private Integer Kursmomentum;

    @Column(name = "Dreimonatsreversal")
    private Integer Dreimonatsreversal;

    @Column(name = "Gewinnwachstum")
    private Integer Gewinnwachstum;


    public Punkteliste() {
    }


    @ManyToOne(optional = false)
    private Unternehmen Punkteliste;

    public Integer getPunktelisteNameId() {
        return PunktelisteNameId;
    }

    public void setPunktelisteName(Integer punktelisteName) {
        PunktelisteNameId = PunktelisteNameId;
    }

    public String getUnternehmenname_Punkteliste() {
        return Unternehmenname_Punkteliste;
    }

    public void setUnternehmenname_Punkteliste(String unternehmenname_Punkteliste) {
        Unternehmenname_Punkteliste = unternehmenname_Punkteliste;
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

    public Unternehmen getPunkteliste() {
        return Punkteliste;
    }

    public void setPunkteliste(Unternehmen punkteliste) {
        Punkteliste = punkteliste;
    }

    public void setPunktelisteNameId(Integer punktelisteNameId) {
        PunktelisteNameId = punktelisteNameId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
