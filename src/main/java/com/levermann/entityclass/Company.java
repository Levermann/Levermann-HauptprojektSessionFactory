package com.levermann.entityclass;

import javafx.scene.control.Button;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "company")
@Access(AccessType.FIELD)
@NamedQueries({

        @NamedQuery(name = "Company.findAll", query = "SELECT A FROM Company A"),
        @NamedQuery(name = "Company.findByName", query = "SELECT c FROM Company c WHERE c.Companyname =:Companyname"),
        @NamedQuery(name = "Company.findByEigenkapital", query = "SELECT c FROM Company c WHERE c.eigenkapital =:eigenkapital"),
        @NamedQuery(name = "Company.findByJahresüberschuss", query = "SELECT jahresueberschuss FROM Company")

})
public class Company implements Serializable  {

    public Company(String Companyname, String datum, float GesamtPunkte) {
        this.Companyname = Companyname;
        this.datum = datum;
        this.GesamtPunkte = GesamtPunkte;
    }

    public Company(String companyname, String datum, float eigenkapital, float jahresueberschuss, float gewinnEBIT,
                   float jahresumsatz, float fremdkapital, float aktuellerAktienkurs, float gewinnschaezung,
                   float gewinnAVG, float halten, float verkaufen, float kaufen, float kursanstiegUnternehmen,
                   float kursanstiegIndex, float gewinnschaezungVor4Wochen,
                   float aktienkursTagVeroeffentlichungQartalszahlen, float kursVor6Monaten, float kursVor12Monaten,
                   float kursVor3Monaten, float kursVor2Monaten, float kursVor1Monat, float daxVor1Monat,
                   float daxVor2Monaten, float daxVor3Monaten, float gewinnschaezungNaechstesJahr,
                   float gewinnschaezungDiesesJahr, float finanzsektor,
                   Integer kursgewinnVor3Jahren, Integer kursgewinnVor2Jahren, Integer kursgewinnVor1Jahr,
                   Integer aktuellenErwartetenKursgewinn, Integer kursgewinnschaezungNaechstesJahr) {
        Companyname = companyname;
        this.datum = datum;
        this.eigenkapital = eigenkapital;
        this.jahresueberschuss = jahresueberschuss;
        GewinnEBIT = gewinnEBIT;
        Jahresumsatz = jahresumsatz;
        Fremdkapital = fremdkapital;
        AktuellerAktienkurs = aktuellerAktienkurs;
        Gewinnschaezung = gewinnschaezung;
        GewinnAVG = gewinnAVG;
        Halten = halten;
        Verkaufen = verkaufen;
        Kaufen = kaufen;
        KursanstiegUnternehmen = kursanstiegUnternehmen;
        KursanstiegIndex = kursanstiegIndex;
        GewinnschaezungVor4Wochen = gewinnschaezungVor4Wochen;
        AktienkursTagVeroeffentlichungQartalszahlen = aktienkursTagVeroeffentlichungQartalszahlen;
        KursVor6Monaten = kursVor6Monaten;
        KursVor12Monaten = kursVor12Monaten;
        KursVor3Monaten = kursVor3Monaten;
        KursVor2Monaten = kursVor2Monaten;
        KursVor1Monat = kursVor1Monat;
        DaxVor1Monat = daxVor1Monat;
        DaxVor2Monaten = daxVor2Monaten;
        DaxVor3Monaten = daxVor3Monaten;
        GewinnschaezungNaechstesJahr = gewinnschaezungNaechstesJahr;
        GewinnschaezungDiesesJahr = gewinnschaezungDiesesJahr;
        Finanzsektor = finanzsektor;
        KursgewinnVor3Jahren = kursgewinnVor3Jahren;
        KursgewinnVor2Jahren = kursgewinnVor2Jahren;
        KursgewinnVor1Jahr = kursgewinnVor1Jahr;
        AktuellenErwartetenKursgewinn = aktuellenErwartetenKursgewinn;
        KursgewinnschaezungNaechstesJahr = kursgewinnschaezungNaechstesJahr;
    }
    @Id
    @Column(name="Companyname")
    private String Companyname;
    @Basic
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = true)
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
    @Column(name="KursgewinnVor3Jahren", unique = true, nullable = true)
    private float KursgewinnVor3Jahren;
    @Basic
    @Column(name="KursgewinnVor2Jahren", unique = true, nullable = true)
    private float KursgewinnVor2Jahren;
    @Basic
    @Column(name="KursgewinnVor1Jahr", unique = true, nullable = true)
    private float KursgewinnVor1Jahr;
    @Basic
    @Column(name="AktuellenErwartetenKursgewinn", unique = true, nullable = true)
    private float AktuellenErwartetenKursgewinn;
    @Basic
    @Column(name="KursgewinnschaezungNaechstesJahr", unique = true, nullable = true)
    private float KursgewinnschaezungNaechstesJahr;
    @Basic
    @Column(name="GesamtPunkte")
    private float GesamtPunkte;

    public Company() {
        
    }

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

    public float getKursgewinnVor3Jahren() {
        return KursgewinnVor3Jahren;
    }

    public void setKursgewinnVor3Jahren(Integer kursgewinnVor3Jahren) {
        KursgewinnVor3Jahren = kursgewinnVor3Jahren;
    }

    public float getKursgewinnVor2Jahren() {
        return KursgewinnVor2Jahren;
    }

    public void setKursgewinnVor2Jahren(Integer kursgewinnVor2Jahren) {
        KursgewinnVor2Jahren = kursgewinnVor2Jahren;
    }

    public float getKursgewinnVor1Jahr() {
        return KursgewinnVor1Jahr;
    }

    public void setKursgewinnVor1Jahr(Integer kursgewinnVor1Jahr) {
        KursgewinnVor1Jahr = kursgewinnVor1Jahr;
    }

    public float getAktuellenErwartetenKursgewinn() {
        return AktuellenErwartetenKursgewinn;
    }

    public void setAktuellenErwartetenKursgewinn(Integer aktuellenErwartetenKursgewinn) {
        AktuellenErwartetenKursgewinn = aktuellenErwartetenKursgewinn;
    }

    public float getKursgewinnschaezungNaechstesJahr() {
        return KursgewinnschaezungNaechstesJahr;
    }

    public void setKursgewinnschaezungNaechstesJahr(Integer kursgewinnschaezungNaechstesJahr) {
        KursgewinnschaezungNaechstesJahr = kursgewinnschaezungNaechstesJahr;
    }

    public float getGesamtPunkte() {
        return GesamtPunkte;
    }

    public void setGesamtPunkte(float gesamtPunkte) {
        GesamtPunkte = gesamtPunkte;
    }
}