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
    public int hashCode() {
        return Objects.hash(getLid(), getCid3(), getEigenkapitalrendite(), getEBITMarge(), getEigenkapitalquote(), getKursGewinnVerhältnis(), getKursGewinnVerhältnisAktuell(), getAnalystenmeinungen(), getReaktionaufQuartalszahlen(), getGewinnrevision(), getKursverlauf6Monate(), getKursverlauf12Monate(), getKursmomentum(), getDreimonatsreversal(), getGewinnwachstum());
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

    public int getLid() {
        return Lid;
    }

    public void setLid(int lid) {
        Lid = lid;
    }

    public int getCid3() {
        return Cid3;
    }

    public void setCid3(int cid3) {
        Cid3 = cid3;
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
// @ManyToOne
   // @JoinColumn(name="unternehmen_Cid", nullable=false)
   // private Unternehmen unternehmen;

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
    private int Analystenmeinungen;

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