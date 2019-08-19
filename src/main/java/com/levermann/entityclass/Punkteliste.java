package com.levermann.entityclass;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Access(AccessType.FIELD)
@NamedQueries({
        @NamedQuery(name = "Punkteliste.findall", query = "SELECT A FROM Punkteliste A"),
        @NamedQuery(name = "Punkteliste.findById", query = "SELECT c FROM Punkteliste c WHERE c.id =:id")

})
@Table(name="punkteliste")
 public class Punkteliste implements Serializable {


    @Id
    @Column(name = "PunktelisteNameId")
    private String PunktelisteNameId;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Float id;

    @Column(name = "Unternehmenname_Punkteliste")
    private String Unternehmenname_Punkteliste;

    @Column(name = "Eigenkapitalrendite")
    private Float Eigenkapitalrendite;

    @Column(name = "EBITMarge")
    private Float EBITMarge;

    @Column(name = "Eigenkapitalquote")
    private Float Eigenkapitalquote;

    @Column(name = "KursGewinnVerhaeltnis")
    private Float KursGewinnVerhaeltnis;

    @Column(name = "KursGewinnVerhaeltnisAktuell")
    private Float KursGewinnVerhaeltnisAktuell;

    @Column(name = "Analystenmeinungen")
    private Float Analystenmeinungen;

    @Column(name = "ReaktionaufQuartalszahlen")
    private Float ReaktionaufQuartalszahlen;

    @Column(name = "Gewinnrevision")
    private Float Gewinnrevision;

    @Column(name = "Kursverlauf6Monate")
    private Float Kursverlauf6Monate;

    @Column(name = "Kursverlauf12Monate")
    private Float Kursverlauf12Monate;

    @Column(name = "Kursmomentum")
    private Float Kursmomentum;

    @Column(name = "Dreimonatsreversal")
    private Float Dreimonatsreversal;

    @Column(name = "Gewinnwachstum")
    private Float Gewinnwachstum;

    @ManyToOne
    @JoinColumn(name = "UnternehmennameId")
    private Unternehmen unternehmen;
    private Object Punkteliste;

    public Punkteliste(Unternehmen unternehmen) {
        this.unternehmen = unternehmen;
    }

    public Punkteliste() {

    }


    public String getPunktelisteNameId() {
        return PunktelisteNameId;
    }

    public String getUnternehmenname_Punkteliste() {
        return Unternehmenname_Punkteliste;
    }

    public void setUnternehmenname_Punkteliste(String unternehmenname_Punkteliste) {
        Unternehmenname_Punkteliste = unternehmenname_Punkteliste;
    }

    public Float getEigenkapitalrendite() {
        return Eigenkapitalrendite;
    }

    public void setEigenkapitalrendite(Float eigenkapitalrendite) {
        Eigenkapitalrendite = eigenkapitalrendite;
    }

    public Float getEBITMarge() {
        return EBITMarge;
    }

    public void setEBITMarge(Float EBITMarge) {
        this.EBITMarge = EBITMarge;
    }

    public Float getEigenkapitalquote() {
        return Eigenkapitalquote;
    }

    public void setEigenkapitalquote(Float eigenkapitalquote) {
        Eigenkapitalquote = eigenkapitalquote;
    }

    public Float getKursGewinnVerhaeltnis() {
        return KursGewinnVerhaeltnis;
    }

    public void setKursGewinnVerhaeltnis(Float kursGewinnVerhaeltnis) {
        KursGewinnVerhaeltnis = kursGewinnVerhaeltnis;
    }

    public Float getKursGewinnVerhaeltnisAktuell() {
        return KursGewinnVerhaeltnisAktuell;
    }

    public void setKursGewinnVerhaeltnisAktuell(Float kursGewinnVerhaeltnisAktuell) {
        KursGewinnVerhaeltnisAktuell = kursGewinnVerhaeltnisAktuell;
    }

    public Float getAnalystenmeinungen() {
        return Analystenmeinungen;
    }

    public void setAnalystenmeinungen(Float analystenmeinungen) {
        Analystenmeinungen = analystenmeinungen;
    }

    public Float getReaktionaufQuartalszahlen() {
        return ReaktionaufQuartalszahlen;
    }

    public void setReaktionaufQuartalszahlen(Float reaktionaufQuartalszahlen) {
        ReaktionaufQuartalszahlen = reaktionaufQuartalszahlen;
    }

    public Float getGewinnrevision() {
        return Gewinnrevision;
    }

    public void setGewinnrevision(Float gewinnrevision) {
        Gewinnrevision = gewinnrevision;
    }

    public Float getKursverlauf6Monate() {
        return Kursverlauf6Monate;
    }

    public void setKursverlauf6Monate(Float kursverlauf6Monate) {
        Kursverlauf6Monate = kursverlauf6Monate;
    }

    public Float getKursverlauf12Monate() {
        return Kursverlauf12Monate;
    }

    public void setKursverlauf12Monate(Float kursverlauf12Monate) {
        Kursverlauf12Monate = kursverlauf12Monate;
    }

    public Float getKursmomentum() {
        return Kursmomentum;
    }

    public void setKursmomentum(Float kursmomentum) {
        Kursmomentum = kursmomentum;
    }

    public Float getDreimonatsreversal() {
        return Dreimonatsreversal;
    }

    public void setDreimonatsreversal(Float dreimonatsreversal) {
        Dreimonatsreversal = dreimonatsreversal;
    }

    public Float getGewinnwachstum() {
        return Gewinnwachstum;
    }

    public void setGewinnwachstum(Float gewinnwachstum) {
        Gewinnwachstum = gewinnwachstum;
    }

    public Unternehmen getPunkteliste() {
        return (Unternehmen) Punkteliste;
    }

    public void setPunkteliste(Unternehmen punkteliste) {
        Punkteliste = punkteliste;
    }

    public void setPunktelisteNameId(String PunktelisteNameId) {
        PunktelisteNameId = PunktelisteNameId;
    }

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

}
