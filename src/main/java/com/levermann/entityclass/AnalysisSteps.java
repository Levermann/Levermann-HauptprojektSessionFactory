package com.levermann.entityclass;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="AnalysisSteps")
public class AnalysisSteps implements Serializable {

    public AnalysisSteps(Company company) {
        this.company = company;
    }

    public AnalysisSteps() {

    }

    @Id
    @Column(name = "AnalysisStepsName")
    private String AnalysisStepsName;
    @Basic
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Float id;
    @Basic
    @Column(name = "Companyname_AnalysisSteps", insertable = false, updatable = false)
    private String Companyname_AnalysisSteps;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Companyname_AnalysisSteps")
    private Company company;

    public String getAnalysisStepsName() {
        return AnalysisStepsName;
    }

    public void setAnalysisStepsName(String analysisStepsName) {
        AnalysisStepsName = analysisStepsName;
    }

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getCompanyname_AnalysisSteps() {
        return Companyname_AnalysisSteps;
    }

    public void setCompanyname_AnalysisSteps(String companyname_AnalysisSteps) {
        Companyname_AnalysisSteps = companyname_AnalysisSteps;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnalysisSteps that = (AnalysisSteps) o;

        if (Double.compare(that.id, id) != 0) return false;
        if (AnalysisStepsName != null ? !AnalysisStepsName.equals(that.AnalysisStepsName) :
                that.AnalysisStepsName != null)
            return false;
        if (Eigenkapitalrendite != null ? !Eigenkapitalrendite.equals(that.Eigenkapitalrendite) :
                that.Eigenkapitalrendite != null)
            return false;
        if (EBITMarge != null ? !EBITMarge.equals(that.EBITMarge) : that.EBITMarge != null) return false;
        if (Eigenkapitalquote != null ? !Eigenkapitalquote.equals(that.Eigenkapitalquote) :
                that.Eigenkapitalquote != null)
            return false;
        if (KursGewinnVerhaeltnis != null ? !KursGewinnVerhaeltnis.equals(that.KursGewinnVerhaeltnis) :
                that.KursGewinnVerhaeltnis != null)
            return false;
        if (KursGewinnVerhaeltnisAktuell != null ?
                !KursGewinnVerhaeltnisAktuell.equals(that.KursGewinnVerhaeltnisAktuell) :
                that.KursGewinnVerhaeltnisAktuell != null)
            return false;
        if (Analystenmeinungen != null ? !Analystenmeinungen.equals(that.Analystenmeinungen) :
                that.Analystenmeinungen != null)
            return false;
        if (ReaktionaufQuartalszahlen != null ? !ReaktionaufQuartalszahlen.equals(that.ReaktionaufQuartalszahlen) :
                that.ReaktionaufQuartalszahlen != null)
            return false;
        if (Gewinnrevision!= null ? !Gewinnrevision.equals(that.Gewinnrevision) : that.Gewinnrevision != null)
            return false;
        if (Kursverlauf6Monate != null ? !Kursverlauf6Monate.equals(that.Kursverlauf6Monate) :
                that.Kursverlauf6Monate != null)
            return false;
        if (Kursverlauf12Monate != null ? !Kursverlauf12Monate.equals(that.Kursverlauf12Monate) :
                that.Kursverlauf12Monate != null)
            return false;
        if (Kursmomentum != null ? !Kursmomentum.equals(that.Kursmomentum) : that.Kursmomentum != null) return false;
        if (Dreimonatsreversal != null ? !Dreimonatsreversal.equals(that.Dreimonatsreversal) :
                that.Dreimonatsreversal != null)
            return false;
        if (Gewinnwachstum != null ? !Gewinnwachstum.equals(that.Gewinnwachstum) : that.Gewinnwachstum != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = AnalysisStepsName != null ? AnalysisStepsName.hashCode() : 0;
        temp = Double.doubleToLongBits(id);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (Eigenkapitalrendite != null ? Eigenkapitalrendite.hashCode() : 0);
        result = 31 * result + (EBITMarge != null ? EBITMarge.hashCode() : 0);
        result = 31 * result + (Eigenkapitalquote != null ? Eigenkapitalquote.hashCode() : 0);
        result = 31 * result + (KursGewinnVerhaeltnis != null ? KursGewinnVerhaeltnis.hashCode() : 0);
        result = 31 * result + (KursGewinnVerhaeltnisAktuell != null ? KursGewinnVerhaeltnisAktuell.hashCode() : 0);
        result = 31 * result + (Analystenmeinungen != null ? Analystenmeinungen.hashCode() : 0);
        result = 31 * result + (ReaktionaufQuartalszahlen != null ? ReaktionaufQuartalszahlen.hashCode() : 0);
        result = 31 * result + (Gewinnrevision != null ? Gewinnrevision.hashCode() : 0);
        result = 31 * result + (Kursverlauf6Monate != null ? Kursverlauf6Monate.hashCode() : 0);
        result = 31 * result + (Kursverlauf12Monate != null ? Kursverlauf12Monate.hashCode() : 0);
        result = 31 * result + (Kursmomentum != null ? Kursmomentum.hashCode() : 0);
        result = 31 * result + (Dreimonatsreversal != null ? Dreimonatsreversal.hashCode() : 0);
        result = 31 * result + (Gewinnwachstum != null ? Gewinnwachstum.hashCode() : 0);
        return result;
    }
}