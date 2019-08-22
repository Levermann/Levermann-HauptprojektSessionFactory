package com.levermann.sessionControlClasses;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Analysisrating implements Serializable {
    private String analysisRatingName;
    private String companynameAnalysisRating;
    private Double eigenkapitalrendite;
    private Double ebitMarge;
    private Double eigenkapitalquote;
    private Double kursGewinnVerhaeltnis;
    private Double kursGewinnVerhaeltnisAktuell;
    private Double analystenmeinungen;
    private Double reaktionaufQuartalszahlen;
    private Double gewinnrevision;
    private Double kursverlauf6Monate;
    private Double kursverlauf12Monate;
    private Double kursmomentum;
    private Double dreimonatsreversal;
    private Double gewinnwachstum;

    @Id
    public String getAnalysisRatingName() {
        return analysisRatingName;
    }

    public void setAnalysisRatingName(String analysisRatingName) {
        this.analysisRatingName = analysisRatingName;
    }

    @Basic
    public String getCompanynameAnalysisRating() {
        return companynameAnalysisRating;
    }

    public void setCompanynameAnalysisRating(String companynameAnalysisRating) {
        this.companynameAnalysisRating = companynameAnalysisRating;
    }

    @Basic
    public Double getEigenkapitalrendite() {
        return eigenkapitalrendite;
    }

    public void setEigenkapitalrendite(Double eigenkapitalrendite) {
        this.eigenkapitalrendite = eigenkapitalrendite;
    }

    @Basic
    public Double getEbitMarge() {
        return ebitMarge;
    }

    public void setEbitMarge(Double ebitMarge) {
        this.ebitMarge = ebitMarge;
    }

    @Basic
    public Double getEigenkapitalquote() {
        return eigenkapitalquote;
    }

    public void setEigenkapitalquote(Double eigenkapitalquote) {
        this.eigenkapitalquote = eigenkapitalquote;
    }

    @Basic
    public Double getKursGewinnVerhaeltnis() {
        return kursGewinnVerhaeltnis;
    }

    public void setKursGewinnVerhaeltnis(Double kursGewinnVerhaeltnis) {
        this.kursGewinnVerhaeltnis = kursGewinnVerhaeltnis;
    }

    @Basic
    public Double getKursGewinnVerhaeltnisAktuell() {
        return kursGewinnVerhaeltnisAktuell;
    }

    public void setKursGewinnVerhaeltnisAktuell(Double kursGewinnVerhaeltnisAktuell) {
        this.kursGewinnVerhaeltnisAktuell = kursGewinnVerhaeltnisAktuell;
    }

    @Basic
    public Double getAnalystenmeinungen() {
        return analystenmeinungen;
    }

    public void setAnalystenmeinungen(Double analystenmeinungen) {
        this.analystenmeinungen = analystenmeinungen;
    }

    @Basic
    public Double getReaktionaufQuartalszahlen() {
        return reaktionaufQuartalszahlen;
    }

    public void setReaktionaufQuartalszahlen(Double reaktionaufQuartalszahlen) {
        this.reaktionaufQuartalszahlen = reaktionaufQuartalszahlen;
    }

    @Basic
    public Double getGewinnrevision() {
        return gewinnrevision;
    }

    public void setGewinnrevision(Double gewinnrevision) {
        this.gewinnrevision = gewinnrevision;
    }

    @Basic
    public Double getKursverlauf6Monate() {
        return kursverlauf6Monate;
    }

    public void setKursverlauf6Monate(Double kursverlauf6Monate) {
        this.kursverlauf6Monate = kursverlauf6Monate;
    }

    @Basic
    public Double getKursverlauf12Monate() {
        return kursverlauf12Monate;
    }

    public void setKursverlauf12Monate(Double kursverlauf12Monate) {
        this.kursverlauf12Monate = kursverlauf12Monate;
    }

    @Basic
    public Double getKursmomentum() {
        return kursmomentum;
    }

    public void setKursmomentum(Double kursmomentum) {
        this.kursmomentum = kursmomentum;
    }

    @Basic
    public Double getDreimonatsreversal() {
        return dreimonatsreversal;
    }

    public void setDreimonatsreversal(Double dreimonatsreversal) {
        this.dreimonatsreversal = dreimonatsreversal;
    }

    @Basic
    public Double getGewinnwachstum() {
        return gewinnwachstum;
    }

    public void setGewinnwachstum(Double gewinnwachstum) {
        this.gewinnwachstum = gewinnwachstum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Analysisrating that = (Analysisrating) o;

        if (analysisRatingName != null ? !analysisRatingName.equals(that.analysisRatingName) : that.analysisRatingName != null)
            return false;
        if (companynameAnalysisRating != null ? !companynameAnalysisRating.equals(that.companynameAnalysisRating) : that.companynameAnalysisRating != null)
            return false;
        if (eigenkapitalrendite != null ? !eigenkapitalrendite.equals(that.eigenkapitalrendite) : that.eigenkapitalrendite != null)
            return false;
        if (ebitMarge != null ? !ebitMarge.equals(that.ebitMarge) : that.ebitMarge != null) return false;
        if (eigenkapitalquote != null ? !eigenkapitalquote.equals(that.eigenkapitalquote) : that.eigenkapitalquote != null)
            return false;
        if (kursGewinnVerhaeltnis != null ? !kursGewinnVerhaeltnis.equals(that.kursGewinnVerhaeltnis) : that.kursGewinnVerhaeltnis != null)
            return false;
        if (kursGewinnVerhaeltnisAktuell != null ? !kursGewinnVerhaeltnisAktuell.equals(that.kursGewinnVerhaeltnisAktuell) : that.kursGewinnVerhaeltnisAktuell != null)
            return false;
        if (analystenmeinungen != null ? !analystenmeinungen.equals(that.analystenmeinungen) : that.analystenmeinungen != null)
            return false;
        if (reaktionaufQuartalszahlen != null ? !reaktionaufQuartalszahlen.equals(that.reaktionaufQuartalszahlen) : that.reaktionaufQuartalszahlen != null)
            return false;
        if (gewinnrevision != null ? !gewinnrevision.equals(that.gewinnrevision) : that.gewinnrevision != null)
            return false;
        if (kursverlauf6Monate != null ? !kursverlauf6Monate.equals(that.kursverlauf6Monate) : that.kursverlauf6Monate != null)
            return false;
        if (kursverlauf12Monate != null ? !kursverlauf12Monate.equals(that.kursverlauf12Monate) : that.kursverlauf12Monate != null)
            return false;
        if (kursmomentum != null ? !kursmomentum.equals(that.kursmomentum) : that.kursmomentum != null) return false;
        if (dreimonatsreversal != null ? !dreimonatsreversal.equals(that.dreimonatsreversal) : that.dreimonatsreversal != null)
            return false;
        if (gewinnwachstum != null ? !gewinnwachstum.equals(that.gewinnwachstum) : that.gewinnwachstum != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = analysisRatingName != null ? analysisRatingName.hashCode() : 0;
        result = 31 * result + (companynameAnalysisRating != null ? companynameAnalysisRating.hashCode() : 0);
        result = 31 * result + (eigenkapitalrendite != null ? eigenkapitalrendite.hashCode() : 0);
        result = 31 * result + (ebitMarge != null ? ebitMarge.hashCode() : 0);
        result = 31 * result + (eigenkapitalquote != null ? eigenkapitalquote.hashCode() : 0);
        result = 31 * result + (kursGewinnVerhaeltnis != null ? kursGewinnVerhaeltnis.hashCode() : 0);
        result = 31 * result + (kursGewinnVerhaeltnisAktuell != null ? kursGewinnVerhaeltnisAktuell.hashCode() : 0);
        result = 31 * result + (analystenmeinungen != null ? analystenmeinungen.hashCode() : 0);
        result = 31 * result + (reaktionaufQuartalszahlen != null ? reaktionaufQuartalszahlen.hashCode() : 0);
        result = 31 * result + (gewinnrevision != null ? gewinnrevision.hashCode() : 0);
        result = 31 * result + (kursverlauf6Monate != null ? kursverlauf6Monate.hashCode() : 0);
        result = 31 * result + (kursverlauf12Monate != null ? kursverlauf12Monate.hashCode() : 0);
        result = 31 * result + (kursmomentum != null ? kursmomentum.hashCode() : 0);
        result = 31 * result + (dreimonatsreversal != null ? dreimonatsreversal.hashCode() : 0);
        result = 31 * result + (gewinnwachstum != null ? gewinnwachstum.hashCode() : 0);
        return result;
    }
}
