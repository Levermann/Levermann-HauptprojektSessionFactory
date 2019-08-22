package com.levermann.entityclass;

import javax.persistence.*;


@Entity
@Access(AccessType.FIELD)
@NamedQueries({
        @NamedQuery(name = "AnalysisSteps.findall", query = "SELECT A FROM AnalysisSteps A"),
        @NamedQuery(name = "AnalysisSteps.findByfindByName", query = "SELECT c FROM AnalysisSteps c WHERE c.AnalysisStepsName =:AnalysisStepsName")

})
@Table(name="AnalysisSteps")
 public class AnalysisSteps  {
    @Override
    public String toString() {
        return "AnalysisSteps{" +
                "AnalysisStepsName='" + AnalysisStepsName + '\'' +
                ", id=" + id +
                ", Companyname_AnalysisSteps='" + Companyname_AnalysisSteps + '\'' +
                ", Eigenkapitalrendite=" + Eigenkapitalrendite +
                ", EBITMarge=" + EBITMarge +
                ", Eigenkapitalquote=" + Eigenkapitalquote +
                ", KursGewinnVerhaeltnis=" + KursGewinnVerhaeltnis +
                ", KursGewinnVerhaeltnisAktuell=" + KursGewinnVerhaeltnisAktuell +
                ", Analystenmeinungen=" + Analystenmeinungen +
                ", ReaktionaufQuartalszahlen=" + ReaktionaufQuartalszahlen +
                ", Gewinnrevision=" + Gewinnrevision +
                ", Kursverlauf6Monate=" + Kursverlauf6Monate +
                ", Kursverlauf12Monate=" + Kursverlauf12Monate +
                ", Kursmomentum=" + Kursmomentum +
                ", Dreimonatsreversal=" + Dreimonatsreversal +
                ", Gewinnwachstum=" + Gewinnwachstum +
                ", company=" + company +
                '}';
    }

    public AnalysisSteps(Company company) {
        this.company = company;
    }

    public AnalysisSteps() {

    }

    @Id
    @Column(name = "AnalysisStepsName")
    private String AnalysisStepsName;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Float id;

    @Column(name = "Companyname_AnalysisSteps")
    private String Companyname_AnalysisSteps;

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


}
