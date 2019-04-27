package com.levermann.entityclass;

import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Named
@ManagedBean
@Entity
@Access(AccessType.FIELD)
@NamedQueries({
        @NamedQuery(name = "Levermannschritte.findAll", query = "SELECT B FROM Levermannschritte B"),
        @NamedQuery(name = "Levermannschritte.findByCId", query = "SELECT D  FROM Levermannschritte D WHERE D.Cid3 =:Cid3")

})
@Table(name="levermannschritte")
 public class Levermannschritte  implements Serializable {
    public Integer getLid() {
        return Lid;
    }

    public void setLid(Integer lid) {
        Lid = lid;
    }

    public Integer getCid3() {
        return Cid3;
    }

    public void setCid3(Integer cid3) {
        Cid3 = cid3;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Levermannschritte)) return false;
        Levermannschritte that = (Levermannschritte) o;
        return getLid() == that.getLid() &&
                getCid3() == that.getCid3() &&
                getEigenkapitalrendite() == that.getEigenkapitalrendite() &&
                getEBITMarge() == that.getEBITMarge() &&
                getEigenkapitalquote() == that.getEigenkapitalquote() &&
                getKursGewinnVerhältnis() == that.getKursGewinnVerhältnis() &&
                getKursGewinnVerhältnisAktuell() == that.getKursGewinnVerhältnisAktuell() &&
                getAnalystenmeinungen() == that.getAnalystenmeinungen() &&
                getReaktionaufQuartalszahlen() == that.getReaktionaufQuartalszahlen() &&
                getGewinnrevision() == that.getGewinnrevision() &&
                getKursverlauf6Monate() == that.getKursverlauf6Monate() &&
                getKursverlauf12Monate() == that.getKursverlauf12Monate() &&
                getKursmomentum() == that.getKursmomentum() &&
                getDreimonatsreversal() == that.getDreimonatsreversal() &&
                getGewinnwachstum() == that.getGewinnwachstum();
    }


    @Override
    public String toString() {
        return "Levermannschritte{" +
                "Lid=" + Lid +
                ", Cid3=" + Cid3 +
                ", Eigenkapitalrendite=" + Eigenkapitalrendite +
                ", EBITMarge=" + EBITMarge +
                ", Eigenkapitalquote=" + Eigenkapitalquote +
                ", KursGewinnVerhältnis=" + KursGewinnVerhältnis +
                ", KursGewinnVerhältnisAktuell=" + KursGewinnVerhältnisAktuell +
                ", Analystenmeinungen=" + Analystenmeinungen +
                ", ReaktionaufQuartalszahlen=" + ReaktionaufQuartalszahlen +
                ", Gewinnrevision=" + Gewinnrevision +
                ", Kursverlauf6Monate=" + Kursverlauf6Monate +
                ", Kursverlauf12Monate=" + Kursverlauf12Monate +
                ", Kursmomentum=" + Kursmomentum +
                ", Dreimonatsreversal=" + Dreimonatsreversal +
                ", Gewinnwachstum=" + Gewinnwachstum +
                '}';
    }

    public Levermannschritte() {
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Lid")
    private Integer Lid;

    @Column(name = "Cid3", unique = true, nullable = false)
    private Integer Cid3;

    @Column(name = "Eigenkapitalrendite", unique = true, nullable = false)
    private Integer Eigenkapitalrendite;

    @Column(name = "EBITMarge", unique = true, nullable = false)
    private Integer EBITMarge;

    @Column(name = "Eigenkapitalquote", unique = true, nullable = false)
    private Integer Eigenkapitalquote;

    @Column(name = "KursGewinnVerhältnis", unique = true, nullable = false)
    private Integer KursGewinnVerhältnis;

    @Column(name = "KursGewinnVerhältnisAktuell", unique = true, nullable = false)
    private Integer KursGewinnVerhältnisAktuell;

    @Column(name = "Analystenmeinungen")
    private Integer Analystenmeinungen;

    @Column(name = "ReaktionaufQuartalszahlen")
    private Integer ReaktionaufQuartalszahlen;

    @Column(name = "Gewinnrevision")
    private Integer Gewinnrevision;

    @Column(name = "Kursverlauf6Monate")
    private Integer Kursverlauf6Monate;

    @Column(name = "Kursverlauf12Monate")
    private Integer Kursverlauf12Monate;

    @Column(name = "Kursmomentum")
    private Integer Kursmomentum;

    @Column(name = "Dreimonatsreversal", unique = true, nullable = false)
    private Integer Dreimonatsreversal;

    @Column(name = "Gewinnwachstum")
    private Integer Gewinnwachstum;



}