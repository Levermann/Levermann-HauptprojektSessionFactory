package com.levermann.sessionControlClasses;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "company", schema = "levermann")
public class CompanyEntity implements Serializable {

    private String companyname;
    private Double datum;
    private Double eigenkapital;
    private Double jahresueberschuss;
    private Double gewinnEbit;
    private Double jahresumsatz;
    private Double fremdkapital;
    private Double aktuellerAktienkurs;
    private Double gewinnschaezung;
    private Double gewinnAvg;
    private Double halten;
    private Double verkaufen;
    private Double kaufen;
    private Double kursanstiegUnternehmen;
    private Double kursanstiegIndex;
    private Double gewinnschaezungVor4Wochen;
    private Double aktienkursTagVeroeffentlichungQartalszahlen;
    private Double kursVor6Monaten;
    private Double kursVor12Monaten;
    private Double kursVor3Monaten;
    private Double kursVor2Monaten;
    private Double kursVor1Monat;
    private Double daxVor1Monat;
    private Double daxVor2Monaten;
    private Double daxVor3Monaten;
    private Double gewinnschaezungNaechstesJahr;
    private Double gewinnschaezungDiesesJahr;
    private Double finanzsektor;
    private Double perfInJedemMonat;
    private Double kursgewinnVor3Jahren;
    private Double kursgewinnVor2Jahren;
    private Double kursgewinnVor1Jahr;
    private Double aktuellenErwartetenKursgewinn;
    private Double kursgewinnschaezungNaechstesJahr;

    @Id
    @Column(name = "Companyname", nullable = false, length = 11)
    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Basic
    @Column(name = "datum", nullable = true, precision = 0)
    public Double getDatum() {
        return datum;
    }

    public void setDatum(Double datum) {
        this.datum = datum;
    }

    @Basic
    @Column(name = "eigenkapital", nullable = true, precision = 0)
    public Double getEigenkapital() {
        return eigenkapital;
    }

    public void setEigenkapital(Double eigenkapital) {
        this.eigenkapital = eigenkapital;
    }

    @Basic
    @Column(name = "jahresueberschuss", nullable = true, precision = 0)
    public Double getJahresueberschuss() {
        return jahresueberschuss;
    }

    public void setJahresueberschuss(Double jahresueberschuss) {
        this.jahresueberschuss = jahresueberschuss;
    }

    @Basic
    @Column(name = "GewinnEBIT", nullable = true, precision = 0)
    public Double getGewinnEbit() {
        return gewinnEbit;
    }

    public void setGewinnEbit(Double gewinnEbit) {
        this.gewinnEbit = gewinnEbit;
    }

    @Basic
    @Column(name = "Jahresumsatz", nullable = true, precision = 0)
    public Double getJahresumsatz() {
        return jahresumsatz;
    }

    public void setJahresumsatz(Double jahresumsatz) {
        this.jahresumsatz = jahresumsatz;
    }

    @Basic
    @Column(name = "Fremdkapital", nullable = true, precision = 0)
    public Double getFremdkapital() {
        return fremdkapital;
    }

    public void setFremdkapital(Double fremdkapital) {
        this.fremdkapital = fremdkapital;
    }

    @Basic
    @Column(name = "AktuellerAktienkurs", nullable = true, precision = 0)
    public Double getAktuellerAktienkurs() {
        return aktuellerAktienkurs;
    }

    public void setAktuellerAktienkurs(Double aktuellerAktienkurs) {
        this.aktuellerAktienkurs = aktuellerAktienkurs;
    }

    @Basic
    @Column(name = "Gewinnschaezung", nullable = true, precision = 0)
    public Double getGewinnschaezung() {
        return gewinnschaezung;
    }

    public void setGewinnschaezung(Double gewinnschaezung) {
        this.gewinnschaezung = gewinnschaezung;
    }

    @Basic
    @Column(name = "GewinnAVG", nullable = true, precision = 0)
    public Double getGewinnAvg() {
        return gewinnAvg;
    }

    public void setGewinnAvg(Double gewinnAvg) {
        this.gewinnAvg = gewinnAvg;
    }

    @Basic
    @Column(name = "Halten", nullable = true, precision = 0)
    public Double getHalten() {
        return halten;
    }

    public void setHalten(Double halten) {
        this.halten = halten;
    }

    @Basic
    @Column(name = "Verkaufen", nullable = true, precision = 0)
    public Double getVerkaufen() {
        return verkaufen;
    }

    public void setVerkaufen(Double verkaufen) {
        this.verkaufen = verkaufen;
    }

    @Basic
    @Column(name = "Kaufen", nullable = true, precision = 0)
    public Double getKaufen() {
        return kaufen;
    }

    public void setKaufen(Double kaufen) {
        this.kaufen = kaufen;
    }

    @Basic
    @Column(name = "KursanstiegUnternehmen", nullable = true, precision = 0)
    public Double getKursanstiegUnternehmen() {
        return kursanstiegUnternehmen;
    }

    public void setKursanstiegUnternehmen(Double kursanstiegUnternehmen) {
        this.kursanstiegUnternehmen = kursanstiegUnternehmen;
    }

    @Basic
    @Column(name = "KursanstiegIndex", nullable = true, precision = 0)
    public Double getKursanstiegIndex() {
        return kursanstiegIndex;
    }

    public void setKursanstiegIndex(Double kursanstiegIndex) {
        this.kursanstiegIndex = kursanstiegIndex;
    }

    @Basic
    @Column(name = "GewinnschaezungVor4Wochen", nullable = true, precision = 0)
    public Double getGewinnschaezungVor4Wochen() {
        return gewinnschaezungVor4Wochen;
    }

    public void setGewinnschaezungVor4Wochen(Double gewinnschaezungVor4Wochen) {
        this.gewinnschaezungVor4Wochen = gewinnschaezungVor4Wochen;
    }

    @Basic
    @Column(name = "AktienkursTagVeroeffentlichungQartalszahlen", nullable = true, precision = 0)
    public Double getAktienkursTagVeroeffentlichungQartalszahlen() {
        return aktienkursTagVeroeffentlichungQartalszahlen;
    }

    public void setAktienkursTagVeroeffentlichungQartalszahlen(Double aktienkursTagVeroeffentlichungQartalszahlen) {
        this.aktienkursTagVeroeffentlichungQartalszahlen = aktienkursTagVeroeffentlichungQartalszahlen;
    }

    @Basic
    @Column(name = "KursVor6Monaten", nullable = true, precision = 0)
    public Double getKursVor6Monaten() {
        return kursVor6Monaten;
    }

    public void setKursVor6Monaten(Double kursVor6Monaten) {
        this.kursVor6Monaten = kursVor6Monaten;
    }

    @Basic
    @Column(name = "KursVor12Monaten", nullable = true, precision = 0)
    public Double getKursVor12Monaten() {
        return kursVor12Monaten;
    }

    public void setKursVor12Monaten(Double kursVor12Monaten) {
        this.kursVor12Monaten = kursVor12Monaten;
    }

    @Basic
    @Column(name = "KursVor3Monaten", nullable = true, precision = 0)
    public Double getKursVor3Monaten() {
        return kursVor3Monaten;
    }

    public void setKursVor3Monaten(Double kursVor3Monaten) {
        this.kursVor3Monaten = kursVor3Monaten;
    }

    @Basic
    @Column(name = "KursVor2Monaten", nullable = true, precision = 0)
    public Double getKursVor2Monaten() {
        return kursVor2Monaten;
    }

    public void setKursVor2Monaten(Double kursVor2Monaten) {
        this.kursVor2Monaten = kursVor2Monaten;
    }

    @Basic
    @Column(name = "KursVor1Monat", nullable = true, precision = 0)
    public Double getKursVor1Monat() {
        return kursVor1Monat;
    }

    public void setKursVor1Monat(Double kursVor1Monat) {
        this.kursVor1Monat = kursVor1Monat;
    }

    @Basic
    @Column(name = "DaxVor1Monat", nullable = true, precision = 0)
    public Double getDaxVor1Monat() {
        return daxVor1Monat;
    }

    public void setDaxVor1Monat(Double daxVor1Monat) {
        this.daxVor1Monat = daxVor1Monat;
    }

    @Basic
    @Column(name = "DaxVor2Monaten", nullable = true, precision = 0)
    public Double getDaxVor2Monaten() {
        return daxVor2Monaten;
    }

    public void setDaxVor2Monaten(Double daxVor2Monaten) {
        this.daxVor2Monaten = daxVor2Monaten;
    }

    @Basic
    @Column(name = "DaxVor3Monaten", nullable = true, precision = 0)
    public Double getDaxVor3Monaten() {
        return daxVor3Monaten;
    }

    public void setDaxVor3Monaten(Double daxVor3Monaten) {
        this.daxVor3Monaten = daxVor3Monaten;
    }

    @Basic
    @Column(name = "GewinnschaezungNaechstesJahr", nullable = true, precision = 0)
    public Double getGewinnschaezungNaechstesJahr() {
        return gewinnschaezungNaechstesJahr;
    }

    public void setGewinnschaezungNaechstesJahr(Double gewinnschaezungNaechstesJahr) {
        this.gewinnschaezungNaechstesJahr = gewinnschaezungNaechstesJahr;
    }

    @Basic
    @Column(name = "GewinnschaezungDiesesJahr", nullable = true, precision = 0)
    public Double getGewinnschaezungDiesesJahr() {
        return gewinnschaezungDiesesJahr;
    }

    public void setGewinnschaezungDiesesJahr(Double gewinnschaezungDiesesJahr) {
        this.gewinnschaezungDiesesJahr = gewinnschaezungDiesesJahr;
    }

    @Basic
    @Column(name = "Finanzsektor", nullable = true, precision = 0)
    public Double getFinanzsektor() {
        return finanzsektor;
    }

    public void setFinanzsektor(Double finanzsektor) {
        this.finanzsektor = finanzsektor;
    }

    @Basic
    @Column(name = "PerfInJedemMonat", nullable = true, precision = 0)
    public Double getPerfInJedemMonat() {
        return perfInJedemMonat;
    }

    public void setPerfInJedemMonat(Double perfInJedemMonat) {
        this.perfInJedemMonat = perfInJedemMonat;
    }

    @Basic
    @Column(name = "KursgewinnVor3Jahren", nullable = true, precision = 0)
    public Double getKursgewinnVor3Jahren() {
        return kursgewinnVor3Jahren;
    }

    public void setKursgewinnVor3Jahren(Double kursgewinnVor3Jahren) {
        this.kursgewinnVor3Jahren = kursgewinnVor3Jahren;
    }

    @Basic
    @Column(name = "KursgewinnVor2Jahren", nullable = true, precision = 0)
    public Double getKursgewinnVor2Jahren() {
        return kursgewinnVor2Jahren;
    }

    public void setKursgewinnVor2Jahren(Double kursgewinnVor2Jahren) {
        this.kursgewinnVor2Jahren = kursgewinnVor2Jahren;
    }

    @Basic
    @Column(name = "KursgewinnVor1Jahr", nullable = true, precision = 0)
    public Double getKursgewinnVor1Jahr() {
        return kursgewinnVor1Jahr;
    }

    public void setKursgewinnVor1Jahr(Double kursgewinnVor1Jahr) {
        this.kursgewinnVor1Jahr = kursgewinnVor1Jahr;
    }

    @Basic
    @Column(name = "AktuellenErwartetenKursgewinn", nullable = true, precision = 0)
    public Double getAktuellenErwartetenKursgewinn() {
        return aktuellenErwartetenKursgewinn;
    }

    public void setAktuellenErwartetenKursgewinn(Double aktuellenErwartetenKursgewinn) {
        this.aktuellenErwartetenKursgewinn = aktuellenErwartetenKursgewinn;
    }

    @Basic
    @Column(name = "KursgewinnschaezungNaechstesJahr", nullable = true, precision = 0)
    public Double getKursgewinnschaezungNaechstesJahr() {
        return kursgewinnschaezungNaechstesJahr;
    }

    public void setKursgewinnschaezungNaechstesJahr(Double kursgewinnschaezungNaechstesJahr) {
        this.kursgewinnschaezungNaechstesJahr = kursgewinnschaezungNaechstesJahr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyEntity that = (CompanyEntity) o;

        if (companyname != null ? !companyname.equals(that.companyname) : that.companyname != null) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;
        if (eigenkapital != null ? !eigenkapital.equals(that.eigenkapital) : that.eigenkapital != null) return false;
        if (jahresueberschuss != null ? !jahresueberschuss.equals(that.jahresueberschuss) : that.jahresueberschuss != null)
            return false;
        if (gewinnEbit != null ? !gewinnEbit.equals(that.gewinnEbit) : that.gewinnEbit != null) return false;
        if (jahresumsatz != null ? !jahresumsatz.equals(that.jahresumsatz) : that.jahresumsatz != null) return false;
        if (fremdkapital != null ? !fremdkapital.equals(that.fremdkapital) : that.fremdkapital != null) return false;
        if (aktuellerAktienkurs != null ? !aktuellerAktienkurs.equals(that.aktuellerAktienkurs) : that.aktuellerAktienkurs != null)
            return false;
        if (gewinnschaezung != null ? !gewinnschaezung.equals(that.gewinnschaezung) : that.gewinnschaezung != null)
            return false;
        if (gewinnAvg != null ? !gewinnAvg.equals(that.gewinnAvg) : that.gewinnAvg != null) return false;
        if (halten != null ? !halten.equals(that.halten) : that.halten != null) return false;
        if (verkaufen != null ? !verkaufen.equals(that.verkaufen) : that.verkaufen != null) return false;
        if (kaufen != null ? !kaufen.equals(that.kaufen) : that.kaufen != null) return false;
        if (kursanstiegUnternehmen != null ? !kursanstiegUnternehmen.equals(that.kursanstiegUnternehmen) : that.kursanstiegUnternehmen != null)
            return false;
        if (kursanstiegIndex != null ? !kursanstiegIndex.equals(that.kursanstiegIndex) : that.kursanstiegIndex != null)
            return false;
        if (gewinnschaezungVor4Wochen != null ? !gewinnschaezungVor4Wochen.equals(that.gewinnschaezungVor4Wochen) : that.gewinnschaezungVor4Wochen != null)
            return false;
        if (aktienkursTagVeroeffentlichungQartalszahlen != null ? !aktienkursTagVeroeffentlichungQartalszahlen.equals(that.aktienkursTagVeroeffentlichungQartalszahlen) : that.aktienkursTagVeroeffentlichungQartalszahlen != null)
            return false;
        if (kursVor6Monaten != null ? !kursVor6Monaten.equals(that.kursVor6Monaten) : that.kursVor6Monaten != null)
            return false;
        if (kursVor12Monaten != null ? !kursVor12Monaten.equals(that.kursVor12Monaten) : that.kursVor12Monaten != null)
            return false;
        if (kursVor3Monaten != null ? !kursVor3Monaten.equals(that.kursVor3Monaten) : that.kursVor3Monaten != null)
            return false;
        if (kursVor2Monaten != null ? !kursVor2Monaten.equals(that.kursVor2Monaten) : that.kursVor2Monaten != null)
            return false;
        if (kursVor1Monat != null ? !kursVor1Monat.equals(that.kursVor1Monat) : that.kursVor1Monat != null)
            return false;
        if (daxVor1Monat != null ? !daxVor1Monat.equals(that.daxVor1Monat) : that.daxVor1Monat != null) return false;
        if (daxVor2Monaten != null ? !daxVor2Monaten.equals(that.daxVor2Monaten) : that.daxVor2Monaten != null)
            return false;
        if (daxVor3Monaten != null ? !daxVor3Monaten.equals(that.daxVor3Monaten) : that.daxVor3Monaten != null)
            return false;
        if (gewinnschaezungNaechstesJahr != null ? !gewinnschaezungNaechstesJahr.equals(that.gewinnschaezungNaechstesJahr) : that.gewinnschaezungNaechstesJahr != null)
            return false;
        if (gewinnschaezungDiesesJahr != null ? !gewinnschaezungDiesesJahr.equals(that.gewinnschaezungDiesesJahr) : that.gewinnschaezungDiesesJahr != null)
            return false;
        if (finanzsektor != null ? !finanzsektor.equals(that.finanzsektor) : that.finanzsektor != null) return false;
        if (perfInJedemMonat != null ? !perfInJedemMonat.equals(that.perfInJedemMonat) : that.perfInJedemMonat != null)
            return false;
        if (kursgewinnVor3Jahren != null ? !kursgewinnVor3Jahren.equals(that.kursgewinnVor3Jahren) : that.kursgewinnVor3Jahren != null)
            return false;
        if (kursgewinnVor2Jahren != null ? !kursgewinnVor2Jahren.equals(that.kursgewinnVor2Jahren) : that.kursgewinnVor2Jahren != null)
            return false;
        if (kursgewinnVor1Jahr != null ? !kursgewinnVor1Jahr.equals(that.kursgewinnVor1Jahr) : that.kursgewinnVor1Jahr != null)
            return false;
        if (aktuellenErwartetenKursgewinn != null ? !aktuellenErwartetenKursgewinn.equals(that.aktuellenErwartetenKursgewinn) : that.aktuellenErwartetenKursgewinn != null)
            return false;
        if (kursgewinnschaezungNaechstesJahr != null ? !kursgewinnschaezungNaechstesJahr.equals(that.kursgewinnschaezungNaechstesJahr) : that.kursgewinnschaezungNaechstesJahr != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyname != null ? companyname.hashCode() : 0;
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (eigenkapital != null ? eigenkapital.hashCode() : 0);
        result = 31 * result + (jahresueberschuss != null ? jahresueberschuss.hashCode() : 0);
        result = 31 * result + (gewinnEbit != null ? gewinnEbit.hashCode() : 0);
        result = 31 * result + (jahresumsatz != null ? jahresumsatz.hashCode() : 0);
        result = 31 * result + (fremdkapital != null ? fremdkapital.hashCode() : 0);
        result = 31 * result + (aktuellerAktienkurs != null ? aktuellerAktienkurs.hashCode() : 0);
        result = 31 * result + (gewinnschaezung != null ? gewinnschaezung.hashCode() : 0);
        result = 31 * result + (gewinnAvg != null ? gewinnAvg.hashCode() : 0);
        result = 31 * result + (halten != null ? halten.hashCode() : 0);
        result = 31 * result + (verkaufen != null ? verkaufen.hashCode() : 0);
        result = 31 * result + (kaufen != null ? kaufen.hashCode() : 0);
        result = 31 * result + (kursanstiegUnternehmen != null ? kursanstiegUnternehmen.hashCode() : 0);
        result = 31 * result + (kursanstiegIndex != null ? kursanstiegIndex.hashCode() : 0);
        result = 31 * result + (gewinnschaezungVor4Wochen != null ? gewinnschaezungVor4Wochen.hashCode() : 0);
        result = 31 * result + (aktienkursTagVeroeffentlichungQartalszahlen != null ? aktienkursTagVeroeffentlichungQartalszahlen.hashCode() : 0);
        result = 31 * result + (kursVor6Monaten != null ? kursVor6Monaten.hashCode() : 0);
        result = 31 * result + (kursVor12Monaten != null ? kursVor12Monaten.hashCode() : 0);
        result = 31 * result + (kursVor3Monaten != null ? kursVor3Monaten.hashCode() : 0);
        result = 31 * result + (kursVor2Monaten != null ? kursVor2Monaten.hashCode() : 0);
        result = 31 * result + (kursVor1Monat != null ? kursVor1Monat.hashCode() : 0);
        result = 31 * result + (daxVor1Monat != null ? daxVor1Monat.hashCode() : 0);
        result = 31 * result + (daxVor2Monaten != null ? daxVor2Monaten.hashCode() : 0);
        result = 31 * result + (daxVor3Monaten != null ? daxVor3Monaten.hashCode() : 0);
        result = 31 * result + (gewinnschaezungNaechstesJahr != null ? gewinnschaezungNaechstesJahr.hashCode() : 0);
        result = 31 * result + (gewinnschaezungDiesesJahr != null ? gewinnschaezungDiesesJahr.hashCode() : 0);
        result = 31 * result + (finanzsektor != null ? finanzsektor.hashCode() : 0);
        result = 31 * result + (perfInJedemMonat != null ? perfInJedemMonat.hashCode() : 0);
        result = 31 * result + (kursgewinnVor3Jahren != null ? kursgewinnVor3Jahren.hashCode() : 0);
        result = 31 * result + (kursgewinnVor2Jahren != null ? kursgewinnVor2Jahren.hashCode() : 0);
        result = 31 * result + (kursgewinnVor1Jahr != null ? kursgewinnVor1Jahr.hashCode() : 0);
        result = 31 * result + (aktuellenErwartetenKursgewinn != null ? aktuellenErwartetenKursgewinn.hashCode() : 0);
        result = 31 * result + (kursgewinnschaezungNaechstesJahr != null ? kursgewinnschaezungNaechstesJahr.hashCode() : 0);
        return result;
    }
}
