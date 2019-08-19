package com.levermann.entityclass;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.annotation.ManagedBean;

@Named
@ManagedBean
@Entity
@Table(name = "company")
@Access(AccessType.FIELD)
//@Table(name="unternehmen")
@NamedQueries({


        @NamedQuery(name = "Company.findAll", query = "SELECT A FROM Company A"),
        @NamedQuery(name = "Company.findByName", query = "SELECT c FROM Company c WHERE c.Companyname =:Companyname"),
        @NamedQuery(name = "Company.findByEigenkapital", query = "SELECT c FROM Company c WHERE c.eigenkapital =:eigenkapital"),
        @NamedQuery(name = "Company.findByJahresüberschuss", query = "SELECT jahresueberschuss FROM Company")

})
public class Company implements Serializable  {

    @Id
    @Column(name="Companyname")
    private String Companyname;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="datum")
    private String datum;

    @Column(name="eigenkapital")
    private float eigenkapital;

    @Column(name="jahresueberschuss")
    private float jahresueberschuss;

    @Column(name="GewinnEBIT")
    private float GewinnEBIT;

    @Column(name="Jahresumsatz")
    private float Jahresumsatz;

    @Column(name="Fremdkapital")
    private float Fremdkapital;

    @Column(name="AktuellerAktienkurs")
    private float AktuellerAktienkurs;

    @Column(name="Gewinnschaezung")
    private float Gewinnschaezung;

    @Column(name="GewinnAVG")
    private float GewinnAVG;

    @Column(name="Halten")
    private float Halten;

    @Column(name="Verkaufen")
    private float Verkaufen;

    @Column(name="Kaufen")
    private float Kaufen;

    @Column(name="KursanstiegUnternehmen")
    private float KursanstiegUnternehmen;

    @Column(name="KursanstiegIndex")
    private float KursanstiegIndex;

    @Column(name="GewinnschaezungVor4Wochen")
    private float GewinnschaezungVor4Wochen;

   @Column(name="AktienkursTagVeroeffentlichungQartalszahlen")
   private float AktienkursTagVeroeffentlichungQartalszahlen;

    @Column(name="KursVor6Monaten")
    private float KursVor6Monaten;

    @Column(name="KursVor12Monaten")
    private float KursVor12Monaten;

    @Column(name="KursVor3Monaten")
    private float KursVor3Monaten;

    @Column(name="KursVor2Monaten")
    private float KursVor2Monaten;

    @Column(name="KursVor1Monat")
    private float KursVor1Monat;

    @Column(name="DaxVor1Monat")
    private float DaxVor1Monat;

    @Column(name="DaxVor2Monaten")
    private float DaxVor2Monaten;

    @Column(name="DaxVor3Monaten")
    private float DaxVor3Monaten;

    @Column(name="GewinnschaezungNaechstesJahr")
    private float GewinnschaezungNaechstesJahr;

    @Column(name="GewinnschaezungDiesesJahr")
    private float GewinnschaezungDiesesJahr;

    @Column(name="Finanzsektor")
    private float Finanzsektor;

    @Column(name="PerfInJedemMonat", unique = true, nullable = true)
    private Integer PerfInJedemMonat;

    @Column(name="KursgewinnVor3Jahren", unique = true, nullable = true)
    private Integer KursgewinnVor3Jahren;

    @Column(name="KursgewinnVor2Jahren", unique = true, nullable = true)
    private Integer KursgewinnVor2Jahren;

    @Column(name="KursgewinnVor1Jahr", unique = true, nullable = true)
    private Integer KursgewinnVor1Jahr;

    @Column(name="AktuellenErwartetenKursgewinn", unique = true, nullable = true)
    private Integer AktuellenErwartetenKursgewinn;

    @Column(name="KursgewinnschaezungNaechstesJahr", unique = true, nullable = true)
    private Integer KursgewinnschaezungNaechstesJahr;
//association One To Many: One Company to Many Punktelisten



    public String getCompanyname() {
        return Companyname;
    }

    public void setCompanyname(String companyname) {
        Companyname = companyname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public float getEigenkapital() {
        return eigenkapital;
    }

    public void setEigenkapital(float eigenkapital) {
        this.eigenkapital = eigenkapital;
    }

    public float getJahresueberschuss() {
        return jahresueberschuss;
    }

    public void setJahresueberschuss(float jahresueberschuss) {
        this.jahresueberschuss = jahresueberschuss;
    }

    public float getGewinnEBIT() {
        return GewinnEBIT;
    }

    public void setGewinnEBIT(float gewinnEBIT) {
        GewinnEBIT = gewinnEBIT;
    }

    public float getJahresumsatz() {
        return Jahresumsatz;
    }

    public void setJahresumsatz(float jahresumsatz) {
        Jahresumsatz = jahresumsatz;
    }

    public float getFremdkapital() {
        return Fremdkapital;
    }

    public void setFremdkapital(float fremdkapital) {
        Fremdkapital = fremdkapital;
    }

    public float getAktuellerAktienkurs() {
        return AktuellerAktienkurs;
    }

    public void setAktuellerAktienkurs(float aktuellerAktienkurs) {
        AktuellerAktienkurs = aktuellerAktienkurs;
    }

    public float getGewinnschaezung() {
        return Gewinnschaezung;
    }

    public void setGewinnschaezung(float gewinnschaezung) {
        Gewinnschaezung = gewinnschaezung;
    }

    public float getGewinnAVG() {
        return GewinnAVG;
    }

    public void setGewinnAVG(float gewinnAVG) {
        GewinnAVG = gewinnAVG;
    }

    public float getHalten() {
        return Halten;
    }

    public void setHalten(float halten) {
        Halten = halten;
    }

    public float getVerkaufen() {
        return Verkaufen;
    }

    public void setVerkaufen(float verkaufen) {
        Verkaufen = verkaufen;
    }

    public float getKaufen() {
        return Kaufen;
    }

    public void setKaufen(float kaufen) {
        Kaufen = kaufen;
    }

    public float getKursanstiegUnternehmen() {
        return KursanstiegUnternehmen;
    }

    public void setKursanstiegUnternehmen(float kursanstiegUnternehmen) {
        KursanstiegUnternehmen = kursanstiegUnternehmen;
    }

    public float getKursanstiegIndex() {
        return KursanstiegIndex;
    }

    public void setKursanstiegIndex(float kursanstiegIndex) {
        KursanstiegIndex = kursanstiegIndex;
    }

    public float getGewinnschaezungVor4Wochen() {
        return GewinnschaezungVor4Wochen;
    }

    public void setGewinnschaezungVor4Wochen(float gewinnschaezungVor4Wochen) {
        GewinnschaezungVor4Wochen = gewinnschaezungVor4Wochen;
    }

    public float getAktienkursTagVeroeffentlichungQartalszahlen() {
        return AktienkursTagVeroeffentlichungQartalszahlen;
    }

    public void setAktienkursTagVeroeffentlichungQartalszahlen(float aktienkursTagVeroeffentlichungQartalszahlen) {
        AktienkursTagVeroeffentlichungQartalszahlen = aktienkursTagVeroeffentlichungQartalszahlen;
    }

    public float getKursVor6Monaten() {
        return KursVor6Monaten;
    }

    public void setKursVor6Monaten(float kursVor6Monaten) {
        KursVor6Monaten = kursVor6Monaten;
    }

    public float getKursVor12Monaten() {
        return KursVor12Monaten;
    }

    public void setKursVor12Monaten(float kursVor12Monaten) {
        KursVor12Monaten = kursVor12Monaten;
    }

    public float getKursVor3Monaten() {
        return KursVor3Monaten;
    }

    public void setKursVor3Monaten(float kursVor3Monaten) {
        KursVor3Monaten = kursVor3Monaten;
    }

    public float getKursVor2Monaten() {
        return KursVor2Monaten;
    }

    public void setKursVor2Monaten(float kursVor2Monaten) {
        KursVor2Monaten = kursVor2Monaten;
    }

    public float getKursVor1Monat() {
        return KursVor1Monat;
    }

    public void setKursVor1Monat(float kursVor1Monat) {
        KursVor1Monat = kursVor1Monat;
    }

    public float getDaxVor1Monat() {
        return DaxVor1Monat;
    }

    public void setDaxVor1Monat(float daxVor1Monat) {
        DaxVor1Monat = daxVor1Monat;
    }

    public float getDaxVor2Monaten() {
        return DaxVor2Monaten;
    }

    public void setDaxVor2Monaten(float daxVor2Monaten) {
        DaxVor2Monaten = daxVor2Monaten;
    }

    public float getDaxVor3Monaten() {
        return DaxVor3Monaten;
    }

    public void setDaxVor3Monaten(float daxVor3Monaten) {
        DaxVor3Monaten = daxVor3Monaten;
    }

    public float getGewinnschaezungNaechstesJahr() {
        return GewinnschaezungNaechstesJahr;
    }

    public void setGewinnschaezungNaechstesJahr(float gewinnschaezungNaechstesJahr) {
        GewinnschaezungNaechstesJahr = gewinnschaezungNaechstesJahr;
    }

    public float getGewinnschaezungDiesesJahr() {
        return GewinnschaezungDiesesJahr;
    }

    public void setGewinnschaezungDiesesJahr(float gewinnschaezungDiesesJahr) {
        GewinnschaezungDiesesJahr = gewinnschaezungDiesesJahr;
    }

    public float getFinanzsektor() {
        return Finanzsektor;
    }

    public void setFinanzsektor(float finanzsektor) {
        Finanzsektor = finanzsektor;
    }

    public Integer getPerfInJedemMonat() {
        return PerfInJedemMonat;
    }

    public void setPerfInJedemMonat(Integer perfInJedemMonat) {
        PerfInJedemMonat = perfInJedemMonat;
    }

    public Integer getKursgewinnVor3Jahren() {
        return KursgewinnVor3Jahren;
    }

    public void setKursgewinnVor3Jahren(Integer kursgewinnVor3Jahren) {
        KursgewinnVor3Jahren = kursgewinnVor3Jahren;
    }

    public Integer getKursgewinnVor2Jahren() {
        return KursgewinnVor2Jahren;
    }

    public void setKursgewinnVor2Jahren(Integer kursgewinnVor2Jahren) {
        KursgewinnVor2Jahren = kursgewinnVor2Jahren;
    }

    public Integer getKursgewinnVor1Jahr() {
        return KursgewinnVor1Jahr;
    }

    public void setKursgewinnVor1Jahr(Integer kursgewinnVor1Jahr) {
        KursgewinnVor1Jahr = kursgewinnVor1Jahr;
    }

    public Integer getAktuellenErwartetenKursgewinn() {
        return AktuellenErwartetenKursgewinn;
    }

    public void setAktuellenErwartetenKursgewinn(Integer aktuellenErwartetenKursgewinn) {
        AktuellenErwartetenKursgewinn = aktuellenErwartetenKursgewinn;
    }

    public Integer getKursgewinnschaezungNaechstesJahr() {
        return KursgewinnschaezungNaechstesJahr;
    }

    public void setKursgewinnschaezungNaechstesJahr(Integer kursgewinnschaezungNaechstesJahr) {
        KursgewinnschaezungNaechstesJahr = kursgewinnschaezungNaechstesJahr;
    }


}
