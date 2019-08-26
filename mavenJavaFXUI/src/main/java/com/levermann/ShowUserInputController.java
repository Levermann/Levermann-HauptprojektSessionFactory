package com.levermann;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShowUserInputController implements Initializable, ControlledScreenInterface {

    public static String jahresueberschuss;
    public static String eigenkapital;
    public static String gewinnEBIT;
    public static String fremdkapital;
    public static String aktuellerAktienkurs;
    public static String geschaetzterGewinn;
    public static String analystenMeinungen;
    public static String kaufen;
    public static String verkaufen;
    public static String halten;
    public static String kursAnstiegUnternehmen;
    public static String kursanstiegAktienindex;
    public static String gewinnschaetzungVor4Wochen;
    public static String aktuelleGewinnschaetzung;
    public static String aktienkursVor6Monaten;
    public static String aktienkursVor12Monaten;
    public static String kursVor1Monat;
    public static String kursVor2Monaten;
    public static String kursVor3Monaten;
    public static String aktienkursVor1Monaten;
    public static String aktienkursVor2Monaten;
    public static String aktienkursVor3Monaten;
    public static String gewinnschaetzungFuerNaechstesJahr;
    public static String gewinnschaetzungFuerDiesesJahr;

    @FXML
    TableView<ShowUserInputManageUI> checkInputsID;
    @FXML
    TableColumn<ShowUserInputManageUI, String> userInputFigures;
    @FXML
    TableColumn<ShowUserInputManageUI, String> userInputValues;

    final ObservableList<ShowUserInputManageUI> checkIt = FXCollections.observableArrayList(
            /**new ShowUserInputManageUI("Jahresueberschuss", (float) 1231),
            new ShowUserInputManageUI("Eigenkapital", (float) 1231),
            new ShowUserInputManageUI("Gewinn(EBIT)", (float) 1231),
            new ShowUserInputManageUI("Fremdkapital", (float) 1231),
            new ShowUserInputManageUI("Aktueller Aktienkurs", (float) 1231),
            new ShowUserInputManageUI("geschätzer Gewinn", (float) 1231),
            new ShowUserInputManageUI("Analystenmeinungen", (float) 1231),
            new ShowUserInputManageUI("Kaufen", (float) 1231),
            new ShowUserInputManageUI("Verkaufen", (float) 1231),
            new ShowUserInputManageUI("Halten", (float) 1231),
            new ShowUserInputManageUI("Kursanstieg des Unternehmens", (float) 1231),
            new ShowUserInputManageUI("Kursanstieg Aktienindex", (float) 1231),
            new ShowUserInputManageUI("Gewinnschätzung vor 4 Wochen", (float) 1231),
            new ShowUserInputManageUI("Aktuelle Gewinnschätzung", (float) 1231),
            new ShowUserInputManageUI("Aktienkurs vor 6 Monaten", (float) 1231),
            new ShowUserInputManageUI("Aktienkurs vor 12 Monaten", (float) 1231),
            new ShowUserInputManageUI("Kurs vor 1 Monat", (float) 1231),
            new ShowUserInputManageUI("Kurs vor 2 Monaten", (float) 1231),
            new ShowUserInputManageUI("Kurs vor 3 Monaten", (float) 1231),
            new ShowUserInputManageUI("Aktienkurs vor 1 Monat", (float) 1231),
            new ShowUserInputManageUI("Aktienkurs vor 2 Monaten", (float) 1231),
            new ShowUserInputManageUI("Aktienkurs vor 3 Monaten", (float) 1231),
            new ShowUserInputManageUI("Gewinnschätzung für nächstes Jahr", (float) 1231),
            new ShowUserInputManageUI("Gewinnschätzung für dieses Jahr", (float) 1231)**/
            );

    ScreensController myController;

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    userInputFigures.setCellValueFactory(new PropertyValueFactory<ShowUserInputManageUI, String>("inputFigure1"));
    userInputValues.setCellValueFactory(new PropertyValueFactory<ShowUserInputManageUI, String>("inputValue1"));

    checkInputsID.setItems(checkIt);
    }

    @FXML
    public void switchToPrimaryPageAgain(ActionEvent actionEvent) throws IOException {
        //App.setRoot("startPage");
        //TODO Schließe die Session, zurück zu Startseite
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }

    @FXML
    public void zeigeInputAn(ActionEvent actionEvent) throws IOException{
        checkIt.add(new ShowUserInputManageUI("Jahresueberschuss", jahresueberschuss));
        checkIt.add(new ShowUserInputManageUI("Eigenkapital", eigenkapital));
        checkIt.add(new ShowUserInputManageUI("Gewinn(EBIT)", gewinnEBIT));
        checkIt.add(new ShowUserInputManageUI("Fremdkapital", fremdkapital));
        checkIt.add(new ShowUserInputManageUI("Aktueller Aktienkurs", aktuellerAktienkurs));
        checkIt.add(new ShowUserInputManageUI("geschätzer Gewinn", geschaetzterGewinn));
        checkIt.add(new ShowUserInputManageUI("Analystenmeinungen", analystenMeinungen));
        checkIt.add(new ShowUserInputManageUI("Kaufen", kaufen));
        checkIt.add(new ShowUserInputManageUI("Verkaufen", verkaufen));
        checkIt.add(new ShowUserInputManageUI("Halten", halten));
        checkIt.add(new ShowUserInputManageUI("Kursanstieg des Unternehmens", kursAnstiegUnternehmen));
        checkIt.add(new ShowUserInputManageUI("Kursanstieg Aktienindex", kursanstiegAktienindex));
        checkIt.add(new ShowUserInputManageUI("Gewinnschätzung vor 4 Wochen", gewinnschaetzungVor4Wochen));
        checkIt.add(new ShowUserInputManageUI("Aktuelle Gewinnschätzung", aktuelleGewinnschaetzung));
        checkIt.add(new ShowUserInputManageUI("Aktienkurs vor 6 Monaten", aktienkursVor6Monaten));
        checkIt.add(new ShowUserInputManageUI("Aktienkurs vor 12 Monaten", aktienkursVor12Monaten));
        checkIt.add(new ShowUserInputManageUI("Kurs vor 1 Monat", kursVor1Monat));
        checkIt.add(new ShowUserInputManageUI("Kurs vor 2 Monaten", kursVor2Monaten));
        checkIt.add(new ShowUserInputManageUI("Kurs vor 3 Monaten", kursVor3Monaten));
        checkIt.add(new ShowUserInputManageUI("Aktienkurs vor 1 Monat", aktienkursVor1Monaten));
        checkIt.add(new ShowUserInputManageUI("Aktienkurs vor 2 Monaten", aktienkursVor2Monaten));
        checkIt.add(new ShowUserInputManageUI("Aktienkurs vor 3 Monaten", aktienkursVor3Monaten));
        checkIt.add(new ShowUserInputManageUI("Gewinnschätzung für nächstes Jahr", gewinnschaetzungFuerNaechstesJahr));
        checkIt.add(new ShowUserInputManageUI("Gewinnschätzung für dieses Jahr", gewinnschaetzungFuerDiesesJahr));
    }

            /** checkIt.add(new ShowUserInputManageUI("Jahresueberschuss", Float.parseFloat(jahresueberschuss)));
            new ShowUserInputManageUI("Eigenkapital", Float.parseFloat(eigenkapital)),
            new ShowUserInputManageUI("Gewinn(EBIT)", Float.parseFloat(gewinnEBIT)),
            new ShowUserInputManageUI("Fremdkapital", Float.parseFloat(fremdkapital)),
            new ShowUserInputManageUI("Aktueller Aktienkurs", Float.parseFloat(aktuellerAktienkurs)),
            new ShowUserInputManageUI("geschätzer Gewinn", Float.parseFloat(geschaetzterGewinn)),
            new ShowUserInputManageUI("Analystenmeinungen", (float) 1231),
            new ShowUserInputManageUI("Kaufen", Float.parseFloat(kaufen)),
            new ShowUserInputManageUI("Verkaufen", Float.parseFloat(verkaufen)),
            new ShowUserInputManageUI("Halten", Float.parseFloat(halten)),
            new ShowUserInputManageUI("Kursanstieg des Unternehmens", Float.parseFloat(kursAnstiegUnternehmen)),
            new ShowUserInputManageUI("Kursanstieg Aktienindex", Float.parseFloat(kursanstiegAktienindex)),
            new ShowUserInputManageUI("Gewinnschätzung vor 4 Wochen", Float.parseFloat(gewinnschaetzungVor4Wochen)),
            new ShowUserInputManageUI("Aktuelle Gewinnschätzung", Float.parseFloat(aktuelleGewinnschaetzung)),
            new ShowUserInputManageUI("Aktienkurs vor 6 Monaten", Float.parseFloat(aktienkursVor6Monaten)),
            new ShowUserInputManageUI("Aktienkurs vor 12 Monaten", Float.parseFloat(aktienkursVor12Monaten)),
            new ShowUserInputManageUI("Kurs vor 1 Monat", Float.parseFloat(kursVor1Monat)),
            new ShowUserInputManageUI("Kurs vor 2 Monaten", Float.parseFloat(kursVor2Monaten)),
            new ShowUserInputManageUI("Kurs vor 3 Monaten", Float.parseFloat(kursVor3Monaten)),
            new ShowUserInputManageUI("Aktienkurs vor 1 Monat", Float.parseFloat(aktienkursVor1Monaten)),
            new ShowUserInputManageUI("Aktienkurs vor 2 Monaten", Float.parseFloat(aktienkursVor2Monaten)),
            new ShowUserInputManageUI("Aktienkurs vor 3 Monaten", Float.parseFloat(aktienkursVor3Monaten)),
            new ShowUserInputManageUI("Gewinnschätzung für nächstes Jahr", Float.parseFloat(gewinnschaetzungFuerNaechstesJahr)),
            new ShowUserInputManageUI("Gewinnschätzung für dieses Jahr", Float.parseFloat(gewinnschaetzungFuerDiesesJahr)),
            **/
}