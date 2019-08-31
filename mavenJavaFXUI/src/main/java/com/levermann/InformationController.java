package com.levermann;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InformationController implements Initializable, ControlledScreenInterface {

    ScreensController myController;

    @FXML
    private Text Lev1;
    @FXML
    private Text Lev2;
    @FXML
    private Text Lev3;
    @FXML
    private Text Lev4;
    @FXML
    private Text Lev5;
    @FXML
    private Text Lev6;
    @FXML
    private Text Lev7;
    @FXML
    private Text Lev8;
    @FXML
    private Text Lev9;
    @FXML
    private Text Lev10;
    @FXML
    private Text Lev11;
    @FXML
    private Text Lev12;
    @FXML
    private Text Lev13;

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Lev1.setText("Definition:\nDie Eigenkapitalrendite (engl. Return on Equity, kurz RoE) beschreibt das Verhältnis von Gewinn zu Eigenkapital.\nBedeutung:\nDie Eigenkapitalrendite hat für Aktien eine wichtige Bedeutung. Es hat sich herausgestellt, dass es eine Verbindung zwischen der Eigenkapitalrendite und der Performance der Aktie gibt. Je höher die Eigenkapitalrendite ist, desto wahrscheinlicher ist eine Wertsteigerung.\nBewertung:\nBeträgt der Prozentsatz weniger als 10 Prozent, gibt es einen Minuspunkt.\nLiegt der Wert zwischen 10 und 20 Prozent, werden 0 Punkte verteilt.\nWenn er über 20 Prozent liegt, gibt es einen Pluspunkt.\nBerechnung:\n(Jahresüberschuss / Eigenkapital)*100 = Eigenkapitalrendite in Prozent");
        Lev2.setText("Definition:\nDie EBIT-Marge ist eine betriebswirtschaftliche Kennzahl, die Aussagen über die Rentabilität von Unternehmen macht. Sie ergibt sich aus dem Quotienten von EBIT und Umsatz.\nBedeutung:\nHohe EBIT-Margen sind ein Qualitätskriterium für das Anlagerisiko. Je höher die EBIT-Marge ist, desto leichter lassen sich Umsatzrückgänge wirtschaftlich verkraften. Mit der EBIT-Marge hast Du einen Blick auf das operative Ergebnis eines Unternehmens. Je höher die Prozentzahl, um so profitabler ist das Unternehmen. Das EBIT ist der Gewinn vor Zinsen und Steuern.\nBerechnung:\nGewinnEBIT / Jahresumsatz * 100 = EBIT-Marge in Prozent");
        Lev3.setText("Definition:\nDie Eigenkapitalquote ist eine betriebswirtschaftliche Kennzahl, die das Verhältnis von Eigenkapital zum Gesamtkapital eines Unternehmens wiedergibt. Ist sie oberhalb der 25 Prozent-Marke, darfst Du der Aktie einen Pluspunkt geben.\nBedeutung:\nDie Eigenkapitalquote ist die bedeutendste Bilanzkennzahl, die Auskunft über die Kapitalstruktur eines Unternehmens gibt. Sie ist für die Kreditwürdigkeit eines Unternehmens von Bedeutung.\nBerechnung:\n(Eigenkapital / Eigenkapital + Fremdkapital) * 100 = Eigenkapitalquote in Prozent");
        Lev4.setText("Definition:\nDas Kurs-Gewinn-Verhältnis (kurz KGV) ist eine ökonomische Kennzahl zur Beurteilung von Aktien. Hierfür wird der Kurs der Aktie ins Verhältnis zu dem für einen Vergleichszeitraum bestimmten oder erwarteten Gewinn je Aktie gesetzt.\nBedeutung:\nDas KGV sagt aus, mit welchem Vielfachen ihres erwarteten Ergebnisses eine Aktie an der Börse zurzeit bewertet wird. Anders formuliert besagt das KGV nach wie vielen Jahren der Gewinn des Unternehmens den Preis der Aktie bezahlt hat.\nBewertung:\nDie bewertete Aktie erhält für ein KGV unter 12 einen Punkt. Liegt die Kennzahl zwischen 12 und 16 gibt es keinen Punkt. Alle Werte darüber erhalten einen Minuspunkt.\nBewertung:\nAktueller Aktienkurs / Gewinnschäzung = Kurs-Gewinn-Verhältnis");
        Lev5.setText("Definition:\nEntwicklung des durchschnittlichen Jahresgewinns im Verhältnis zum Kurs Bedeutung: KVG zeigt, ob die Aktien eher günstig oder teuer sind im Vergleich zum Rest niedriger KGV hat in der Vergangenheit zu Überrenditen geführt.\nBewertung:\nAktueller Aktienkurs / Gewinn AVG = aktuelles Kurs-Gewinn-Verhältnis");
        Lev6.setText("Definition:\nAktien werden von den Analysten in einer dreistufigen Skala eingestuft: Kaufen=1, Halten=2, Verkaufen=3. Es wird ein Durchschnittswert der Analystenmeinungen berechnet.\nBedeutung:\nDie Meinungen der Analysten spiegeln eine Mehrheitsmeinung wieder, die keine Überraschungen mehr sind und somit auch kein großes Kurspotential mit sich bringen. Im Falle von großen und mittelgroßen Unternehmen wird diese Kennzahl als Kontraindikator verwendet. Für kleinere Unternehmen mit geringer Anzahl an Analystenmeinung gilt dies nicht. Für die Einteilung der Unternehmen in Smallcap, Midcap und Largecap.\nBewertung:\nEs gibt bei Verkaufsempfehlungen großer Unternehmen einen Pluspunkt (entgegengesetzt der Expertenmeinung) und bei Kaufempfehlungen einen Minuspunkt.\nBewertung:\n(Kaufen + (Halten *  2) + (Verkaufen * 3)) / Kaufen + Verkaufen + Halten = Analystenmeinungen");
        Lev7.setText("Definition:\nEs wird berechnet wie sich der Kurs der Aktie am Tag der Veröffentlichung der letzten Quartalszahlen im Vergleich zum zugehörigen Index verändert hat. Die Kennzahl ergibt sich aus der Differenz der Tagesperformance des betrachteten Wertes und des Index.\nBedeutung:\nÜberraschend positive oder negative Quartalszahlen drücken sich in der Performance des Wertes am Handelstag aus. Auf positive oder negative Nachrichten folgen häufig weitere positive oder negative Nachrichten.\nBerechnung:\nKursanstieg des Unternehmens - Kursanstieg des Aktienindex = Analystenreaktionen auf die Quartalszahlen");
        Lev8.setText("Definition:\nBerechnet wird die Differenz der Analystenerwartungen für den Gewinn pro Aktie vor 4 Wochen mit den aktuellen Erwartungen für das laufende Jahr sowie das kommende Jahr. Bedeutung: Auf den Börsenkurs hat eine Gewinnwarnung oder prognostizierte Erhöhung immer einen riesigen Einfluss. Überraschend positive oder negative Analystenerwartungen drücken sich in der Performance des Wertes am Handelstag aus.\nBewertung:\nSobald es eine Änderung von über 5 Prozent gibt, addierst oder subtrahierst Du einen Punkt – je nachdem ob es nach oben oder unten ging.\nBerechnung:\n(Gewinnschäzung  / Gewinnschäzung vor 4 Wochen) - 1 = Gewinnrevision");
        Lev9.setText("Definition:\nBerechnet wird die Differenz zwischen dem Kurs vor 6 Monaten und dem Kurs von heute.\nBedeutung:\nEine Aktie, deren Kurs in einem bestimmten Zeitraum um mehr als +5% oder -5% verändert hat, wird sich mit relativer Wahrscheinlichkeit weiter in die selbe Richtung entwickeln.\nBewertung:\nBei einem Kursanstieg über 5 Prozent gibt es einen Pluspunkt, bei einem Kursverlust von über 5 Prozent einen Minuspunkt. Dazwischen gibt es keinen.\nBerechnung:\n(Aktueller Aktienkurs - Kurs vor 6 Monaten) / Kurs vor 6 Monaten = Kursverlauf 6 Monate");
        Lev10.setText("Definition:\nBerechnet wird die Differenz zwischen dem Kurs vor 12 Monaten und dem Kurs von heute.\nBedeutung:\nEine Aktie, deren Kurs in einem bestimmten Zeitraum um mehr als +5% oder -5% verändert hat, wird sich mit relativer Wahrscheinlichkeit weiter in die selbe Richtung entwickeln.\nBewertung:\nGibt es in dem Entwicklungsverlauf eine Trendwende, so kommt Kennzahl 12 ins Spiel. Gibt es eine positive Trendwende zwischen den 6 und 12 Monaten, darfst Du hier einen weiteren Punkt vergeben. Wenn es negativ ist, dann natürlich nicht.\nBerechnung:\n(Aktueller Aktienkurs - Kurs vor 12 Monaten) / Kurs vor 12 Monaten = Kursverlauf 12 Monate");
        Lev11.setText("Definition:\nMit dieser Kennzahl wird berechnet, ob es zu einer Trendumkehr im Kursverlauf gekommen ist.\nBedeutung:\nTrendwenden zum Positiven werden belohnt. Trendwenden zum Negativen werden bestraft.\nTrendwende zum positiven:\n+1 falls Schritt 9 = 1 und Schritt 10 = 0 oder -1\nTrendwende zum negativen:\n-1 falls Schritt 9 = -1 und Schritt 10 = 0 oder 1\nsonst 0 ");
        Lev12.setText("Definition:\nBei der vorletzten Kennzahl handelt es sich um den Reversaleffekt, der aber nur in großen Indizes wie dem DAX eine Rolle spielt. Dieser Faktor berücksichtigt die Entwicklung des Wertes in den letzten 3 Monaten in Relation zum Vergleichsindex.\nBedeutung:\nViele Fonds sortieren Werte aus, die in den letzten 3 Monaten eine schlechte Performance hingelegt haben oder kaufen Aktien hinzu, die eine positive Performance hinter sich haben. Diese Käufe und Verkäufe wirken sich Anfangs auf den Kurs aus und korrigieren sich später wieder.\nSchlechte Performance:\n+1 falls Performance in jedem Monat schlechter ist als Vergleichsindex\nGute Performance:\n-1 falls Performance in jedem Monat besser ist als Vergleichsindex\nsonst 0 ");
        Lev13.setText("Definition:\nVergleicht die Gewinnschätzungen für dieses Geschäftsjahr und die für das nächste.\nBerechnung:\n(Gewinnschäzung für nächstes Jahr - Gewinnschäzung für dieses Jahr) / Gewinnschäzung für dieses Jahr = Gewinnwachstum");
    }

    @FXML
    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        //TODO Schließe die Session, zurück zu Startseite
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }
}