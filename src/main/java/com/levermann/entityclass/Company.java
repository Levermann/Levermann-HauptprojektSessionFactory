package com.levermann.entityclass;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.annotation.ManagedBean;

@Entity
public class Company implements Serializable  {

    @Id
    @Column(name="Companyname")
    private String Companyname;
    @Basic
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Basic
    @Column(name="datum")
    private String datum;
    @Basic
    @Column(name="eigenkapital")
    private float eigenkapital;
    @Basic
    @Column(name="jahresueberschuss")
    private float jahresueberschuss;
    @Basic
    @Column(name="GewinnEBIT")
    private float GewinnEBIT;
    @Basic
    @Column(name="Jahresumsatz")
    private float Jahresumsatz;
    @Basic
    @Column(name="Fremdkapital")
    private float Fremdkapital;
    @Basic
    @Column(name="AktuellerAktienkurs")
    private float AktuellerAktienkurs;
    @Basic
    @Column(name="Gewinnschaezung")
    private float Gewinnschaezung;
    @Basic
    @Column(name="GewinnAVG")
    private float GewinnAVG;
    @Basic
    @Column(name="Halten")
    private float Halten;
    @Basic
    @Column(name="Verkaufen")
    private float Verkaufen;
    @Basic
    @Column(name="Kaufen")
    private float Kaufen;
    @Basic
    @Column(name="KursanstiegUnternehmen")
    private float KursanstiegUnternehmen;
    @Basic
    @Column(name="KursanstiegIndex")
    private float KursanstiegIndex;
    @Basic
    @Column(name="GewinnschaezungVor4Wochen")
    private float GewinnschaezungVor4Wochen;
    @Basic
    @Column(name="AktienkursTagVeroeffentlichungQartalszahlen")
    private float AktienkursTagVeroeffentlichungQartalszahlen;
    @Basic
    @Column(name="KursVor6Monaten")
    private float KursVor6Monaten;
    @Basic
    @Column(name="KursVor12Monaten")
    private float KursVor12Monaten;
    @Basic
    @Column(name="KursVor3Monaten")
    private float KursVor3Monaten;
    @Basic
    @Column(name="KursVor2Monaten")
    private float KursVor2Monaten;
    @Basic
    @Column(name="KursVor1Monat")
    private float KursVor1Monat;
    @Basic
    @Column(name="DaxVor1Monat")
    private float DaxVor1Monat;
    @Basic
    @Column(name="DaxVor2Monaten")
    private float DaxVor2Monaten;
    @Basic
    @Column(name="DaxVor3Monaten")
    private float DaxVor3Monaten;
    @Basic
    @Column(name="GewinnschaezungNaechstesJahr")
    private float GewinnschaezungNaechstesJahr;
    @Basic
    @Column(name="GewinnschaezungDiesesJahr")
    private float GewinnschaezungDiesesJahr;
    @Basic
    @Column(name="Finanzsektor")
    private float Finanzsektor;
    @Basic
    @Column(name="PerfInJedemMonat", unique = true, nullable = true)
    private Integer PerfInJedemMonat;
    @Basic
    @Column(name="KursgewinnVor3Jahren", unique = true, nullable = true)
    private Integer KursgewinnVor3Jahren;
    @Basic
    @Column(name="KursgewinnVor2Jahren", unique = true, nullable = true)
    private Integer KursgewinnVor2Jahren;
    @Basic
    @Column(name="KursgewinnVor1Jahr", unique = true, nullable = true)
    private Integer KursgewinnVor1Jahr;
    @Basic
    @Column(name="AktuellenErwartetenKursgewinn", unique = true, nullable = true)
    private Integer AktuellenErwartetenKursgewinn;
    @Basic
    @Column(name="KursgewinnschaezungNaechstesJahr", unique = true, nullable = true)
    private Integer KursgewinnschaezungNaechstesJahr;
    //association One To Many: One Company to Many Punktelisten
  /*  @OneToMany(mappedBy = "company")
    private List<AnalysisRating> analysisRatings;
    @OneToMany(mappedBy = "company")
    private List<AnalysisSteps> analysisSteps;

    public Company(List<AnalysisRating> analysisRatings, List<AnalysisSteps> analysisSteps) {
        this.analysisRatings = analysisRatings;
        this.analysisSteps = analysisSteps;
    }

    public Company() {

    }

    public Company(AnalysisRating analysisRatings, AnalysisSteps analysisSteps) {
    }


   */
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