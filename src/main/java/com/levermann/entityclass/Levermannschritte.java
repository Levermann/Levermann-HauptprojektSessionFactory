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
        @NamedQuery(name = "Levermannschritte.findByName", query = "SELECT D  FROM Levermannschritte D WHERE D.Name2 =:Name2")

})
@Table(name= "levermannschritteold")
 public class Levermannschritte  implements Serializable {
    public String getLevermannschrittName() {
        return LevermannschrittName;
    }

    public void setLevermannschrittName(String LevermannschrittName) {
        LevermannschrittName = LevermannschrittName;
    }

    public String getName2() {
        return Name2;
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

    public Integer getKursGewinnVerhältnis() {
        return KursGewinnVerhältnis;
    }

    public void setKursGewinnVerhältnis(Integer kursGewinnVerhältnis) {
        KursGewinnVerhältnis = kursGewinnVerhältnis;
    }

    public Integer getKursGewinnVerhältnisAktuell() {
        return KursGewinnVerhältnisAktuell;
    }

    public void setKursGewinnVerhältnisAktuell(Integer kursGewinnVerhältnisAktuell) {
        KursGewinnVerhältnisAktuell = kursGewinnVerhältnisAktuell;
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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LevermannschrittName")
    private String LevermannschrittName;

    @Column(name = "Name2", unique = true, nullable = true)
    private String Name2;

    @Column(name = "Eigenkapitalrendite", unique = true, nullable = true)
    private Integer Eigenkapitalrendite;

    @Column(name = "EBITMarge", unique = true, nullable = true)
    private Integer EBITMarge;

    @Column(name = "Eigenkapitalquote", unique = true, nullable = true)
    private Integer Eigenkapitalquote;

    @Column(name = "KursGewinnVerhältnis", unique = true, nullable = true)
    private Integer KursGewinnVerhältnis;

    @Column(name = "KursGewinnVerhältnisAktuell", unique = true, nullable = true)
    private Integer KursGewinnVerhältnisAktuell;

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


    public void setName2(String name2) {
        Name2 = name2;
    }
}