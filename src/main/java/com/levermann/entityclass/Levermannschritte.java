package com.levermann.entityclass;

import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.persistence.*;
import java.io.Serializable;


@Named
@ManagedBean
@Entity
@Access(AccessType.FIELD)
@NamedQueries({
        @NamedQuery(name = "Levermannschritte.findAll", query = "SELECT B FROM Levermannschritte B"),
        @NamedQuery(name = "Levermannschritte.findByName", query = "SELECT D  FROM Levermannschritte D WHERE D.id =:id")

})
@Table(name= "levermannschritte")
 public class Levermannschritte  implements Serializable {


    @Id
    @Column(name = "LevermannschrittAnalyseNameId")
    private String LevermannschrittAnalyseNameId;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "Unternehmenname_Levermannschritte", unique = true, nullable = true)
    private String Unternehmenname_Levermannschritte;

    @Column(name = "Eigenkapitalrendite", unique = true, nullable = true)
    private Integer Eigenkapitalrendite;

    @Column(name = "EBITMarge", unique = true, nullable = true)
    private Integer EBITMarge;

    @Column(name = "Eigenkapitalquote", unique = true, nullable = true)
    private Integer Eigenkapitalquote;

    @Column(name = "KursGewinnVerhaeltnis", unique = true, nullable = true)
    private Integer KursGewinnVerhaeltnis;

    @Column(name = "KursGewinnVerhaeltnisAktuell", unique = true, nullable = true)
    private Integer KursGewinnVerhaeltnisAktuell;

    @Column(name = "Analystenmeinungen", unique = true, nullable = true)
    private Integer Analystenmeinungen;

    @Column(name = "ReaktionaufQuartalszahlen", unique = true, nullable = true)
    private Integer ReaktionaufQuartalszahlen;

    @Column(name = "Gewinnrevision", unique = true, nullable = true)
    private Integer Gewinnrevision;

    @Column(name = "Kursverlauf6Monate", unique = true, nullable = true)
    private Integer Kursverlauf6Monate;

    @Column(name = "Kursverlauf12Monate", unique = true, nullable = true)
    private Integer Kursverlauf12Monate;

    @Column(name = "Kursmomentum", unique = true, nullable = true)
    private Integer Kursmomentum;

    @Column(name = "Dreimonatsreversal", unique = true, nullable = true)
    private Integer Dreimonatsreversal;

    @Column(name = "Gewinnwachstum", unique = true, nullable = true)
    private Integer Gewinnwachstum;


    public String getLevermannschrittAnalyseNameId() {
        return LevermannschrittAnalyseNameId;
    }

    public void setLevermannschrittAnalyseNameId(String LevermannschrittAnalyseNameId) {
        LevermannschrittAnalyseNameId = LevermannschrittAnalyseNameId;
    }

    public String getUnternehmenname_Levermannschritte() {
        return Unternehmenname_Levermannschritte;
    }

    public void setUnternehmenname_Levermannschritte(String unternehmenname_Levermannschritte) {
        Unternehmenname_Levermannschritte = unternehmenname_Levermannschritte;
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

    public Levermannschritte() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}