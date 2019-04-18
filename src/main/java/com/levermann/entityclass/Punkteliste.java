package com.levermann.entityclass;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="punkteliste")
public class Punkteliste implements Serializable {

    public int getCid2() {
        return Cid2;
    }

    public void setCid2(int cid2) {
        Cid2 = cid2;
    }

    public int getEigenkapitalrendite() {
        return Eigenkapitalrendite;
    }

    public void setEigenkapitalrendite(int eigenkapitalrendite) {
        Eigenkapitalrendite = eigenkapitalrendite;
    }

    public int getEBITMarge() {
        return EBITMarge;
    }

    public void setEBITMarge(int EBITMarge) {
        this.EBITMarge = EBITMarge;
    }

    public int getEigenkapitalquote() {
        return Eigenkapitalquote;
    }

    public void setEigenkapitalquote(int eigenkapitalquote) {
        Eigenkapitalquote = eigenkapitalquote;
    }

    public int getKursGewinnVerhältnis() {
        return KursGewinnVerhältnis;
    }

    public void setKursGewinnVerhältnis(int kursGewinnVerhältnis) {
        KursGewinnVerhältnis = kursGewinnVerhältnis;
    }

    public int getKursGewinnVerhältnisAktuell() {
        return KursGewinnVerhältnisAktuell;
    }

    public void setKursGewinnVerhältnisAktuell(int kursGewinnVerhältnisAktuell) {
        KursGewinnVerhältnisAktuell = kursGewinnVerhältnisAktuell;
    }

    public int getAnalystenmeinungen() {
        return Analystenmeinungen;
    }

    public void setAnalystenmeinungen(int analystenmeinungen) {
        Analystenmeinungen = analystenmeinungen;
    }

    public int getReaktionaufQuartalszahlen() {
        return ReaktionaufQuartalszahlen;
    }

    public void setReaktionaufQuartalszahlen(int reaktionaufQuartalszahlen) {
        ReaktionaufQuartalszahlen = reaktionaufQuartalszahlen;
    }

    public int getGewinnrevision() {
        return Gewinnrevision;
    }

    public void setGewinnrevision(int gewinnrevision) {
        Gewinnrevision = gewinnrevision;
    }

    public int getKursverlauf6Monate() {
        return Kursverlauf6Monate;
    }

    public void setKursverlauf6Monate(int kursverlauf6Monate) {
        Kursverlauf6Monate = kursverlauf6Monate;
    }

    public int getKursverlauf12Monate() {
        return Kursverlauf12Monate;
    }

    public void setKursverlauf12Monate(int kursverlauf12Monate) {
        Kursverlauf12Monate = kursverlauf12Monate;
    }

    public int getKursmomentum() {
        return Kursmomentum;
    }

    public void setKursmomentum(int kursmomentum) {
        Kursmomentum = kursmomentum;
    }

    public int getDreimonatsreversal() {
        return Dreimonatsreversal;
    }

    public void setDreimonatsreversal(int dreimonatsreversal) {
        Dreimonatsreversal = dreimonatsreversal;
    }

    public int getGewinnwachstum() {
        return Gewinnwachstum;
    }

    public void setGewinnwachstum(int gewinnwachstum) {
        Gewinnwachstum = gewinnwachstum;
    }


    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Id
    @Column(name="Pid")
    private int Pid;

    @Column(name="Cid2")
    private int Cid2;

    @Column(name="Eigenkapitalrendite")
    private int Eigenkapitalrendite;

    @Column(name="EBITMarge")
    private int EBITMarge;

    @Column(name="Eigenkapitalquote")
    private int Eigenkapitalquote;

    @Column(name="KursGewinnVerhältnis")
    private int KursGewinnVerhältnis;

    @Column(name="KursGewinnVerhältnisAktuell")
    private int KursGewinnVerhältnisAktuell;

    @Column(name="Analystenmeinungen")
    private int Analystenmeinungen;

    @Column(name="ReaktionaufQuartalszahlen")
    private int ReaktionaufQuartalszahlen;

    @Column(name="Gewinnrevision")
    private int Gewinnrevision;

    @Column(name="Kursverlauf6Monate")
    private int Kursverlauf6Monate;

    @Column(name="Kursverlauf12Monate")
    private int Kursverlauf12Monate;

    @Column(name="Kursmomentum")
    private int Kursmomentum;

    @Column(name="Dreimonatsreversal")
    private int Dreimonatsreversal;

    @Column(name="Gewinnwachstum")
    private int Gewinnwachstum;




}