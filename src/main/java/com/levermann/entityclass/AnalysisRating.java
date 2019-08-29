package com.levermann.entityclass;

import javax.inject.Named;
import javax.persistence.*;
import java.io.Serializable;




@Entity
@Access(AccessType.FIELD)
@NamedQueries({
        @NamedQuery(name = "AnalysisRating.findAll", query = "SELECT B FROM AnalysisRating B"),
        @NamedQuery(name = "AnalysisRating.findByName", query = "SELECT D  FROM AnalysisRating D WHERE D.Companyname_AnalysisRating =:Companyname_AnalysisRating")

})
@Table(name= "AnalysisRating")
public class AnalysisRating  implements Serializable {
    public AnalysisRating(String Analysisratingname, String companyname_AnalysisRating ) {
        AnalysisRatingName = Analysisratingname;
        Companyname_AnalysisRating = companyname_AnalysisRating;

    }
    @Id
    @Column(name = "AnalysisRatingName")
    private String AnalysisRatingName;

    @Basic
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Float id;

    @Basic
    @Column(name = "Companyname_AnalysisRating")
    private String Companyname_AnalysisRating;

    @Basic
    @Column(name = "Eigenkapitalrendite")
    private Float Eigenkapitalrendite;

    @Basic
    @Column(name = "EBITMarge")
    private Float EBITMarge;

    @Basic
    @Column(name = "Eigenkapitalquote")
    private Float Eigenkapitalquote;

    @Basic
    @Column(name = "KursGewinnVerhaeltnis")
    private Float KursGewinnVerhaeltnis;

    @Basic
    @Column(name = "KursGewinnVerhaeltnisAktuell")
    private Float KursGewinnVerhaeltnisAktuell;

    @Basic
    @Column(name = "Analystenmeinungen")
    private Float Analystenmeinungen;

    @Basic
    @Column(name = "ReaktionaufQuartalszahlen")
    private Float ReaktionaufQuartalszahlen;

    @Basic
    @Column(name = "Gewinnrevision")
    private Float Gewinnrevision;

    @Basic
    @Column(name = "Kursverlauf6Monate")
    private Float Kursverlauf6Monate;

    @Basic
    @Column(name = "Kursverlauf12Monate")
    private Float Kursverlauf12Monate;

    @Basic
    @Column(name = "Kursmomentum")
    private Float Kursmomentum;

    @Basic
    @Column(name = "Dreimonatsreversal")
    private Float Dreimonatsreversal;

    @Basic
    @Column(name = "Gewinnwachstum")
    private Float Gewinnwachstum;


    public AnalysisRating() { }



    public String getAnalysisRatingName() {
        return AnalysisRatingName;
    }

    public void setAnalysisRatingName(String analysisRatingName) {
        AnalysisRatingName = analysisRatingName;
    }

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getCompanyname_AnalysisRating() {
        return Companyname_AnalysisRating;
    }

    public void setCompanyname_AnalysisRating(String companyname_AnalysisRating) {
        Companyname_AnalysisRating = companyname_AnalysisRating;
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


}
