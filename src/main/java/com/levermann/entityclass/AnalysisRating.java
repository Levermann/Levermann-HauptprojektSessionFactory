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
        @NamedQuery(name = "AnalysisRating.findAll", query = "SELECT B FROM AnalysisRating B"),
        @NamedQuery(name = "AnalysisRating.findByName", query = "SELECT D  FROM AnalysisRating D WHERE D.AnalyseRatingName =:AnalyseRatingName")

})
@Table(name= "AnalysisRating")
 public class AnalysisRating  implements Serializable {


    @Id
    @Column(name = "AnalysisRatingName")
    private String AnalyseRatingName;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Float id;

    @Column(name = "Companyname_AnalysisRating", unique = true, nullable = true)
    private String Companyname_AnalysisRating;

    @Column(name = "Eigenkapitalrendite", unique = true, nullable = true)
    private Float Eigenkapitalrendite;

    @Column(name = "EBITMarge", unique = true, nullable = true)
    private Float EBITMarge;

    @Column(name = "Eigenkapitalquote", unique = true, nullable = true)
    private Float Eigenkapitalquote;

    @Column(name = "KursGewinnVerhaeltnis", unique = true, nullable = true)
    private Float KursGewinnVerhaeltnis;

    @Column(name = "KursGewinnVerhaeltnisAktuell", unique = true, nullable = true)
    private Float KursGewinnVerhaeltnisAktuell;

    @Column(name = "Analystenmeinungen", unique = true, nullable = true)
    private Float Analystenmeinungen;

    @Column(name = "ReaktionaufQuartalszahlen", unique = true, nullable = true)
    private Float ReaktionaufQuartalszahlen;

    @Column(name = "Gewinnrevision", unique = true, nullable = true)
    private Float Gewinnrevision;

    @Column(name = "Kursverlauf6Monate", unique = true, nullable = true)
    private Float Kursverlauf6Monate;

    @Column(name = "Kursverlauf12Monate", unique = true, nullable = true)
    private Float Kursverlauf12Monate;

    @Column(name = "Kursmomentum", unique = true, nullable = true)
    private Float Kursmomentum;

    @Column(name = "Dreimonatsreversal", unique = true, nullable = true)
    private Float Dreimonatsreversal;

    @Column(name = "Gewinnwachstum", unique = true, nullable = true)
    private Float Gewinnwachstum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Companyname_AnalysisRating")
    private Company company;

    public String getAnalysisRatingName() {
        return AnalyseRatingName;
    }

    public void setAnalysisRatingName(String AnalysisRatingName) {
        AnalyseRatingName = AnalyseRatingName;
    }

    public String getCompanyname_AnalysisRating() {
        return Companyname_AnalysisRating;
    }

    public void setCompanyname_AnalysisRating(String unternehmenname_AnalysisRating) {
        Companyname_AnalysisRating = unternehmenname_AnalysisRating;
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

    public AnalysisRating() {
    }

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }
}