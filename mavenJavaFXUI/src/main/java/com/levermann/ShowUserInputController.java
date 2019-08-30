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

    public static Float jahresueberschuss;
    public static Float eigenkapital;
    public static Float gewinnEBIT;
    public static Float fremdkapital;
    public static Float aktuellerAktienkurs;
    public static Float kaufen;
    public static Float verkaufen;
    public static Float halten;
    public static Float kursAnstiegUnternehmen;
    public static Float kursAnstiegAktienindex;
    public static Float gewinnschaetzungVor4Wochen;
    public static Float aktuelleGewinnschaetzung;
    public static Float aktienkursVor6Monaten;
    public static Float aktienkursVor12Monaten;
    public static Float aktuellerErwarteterKursgewinn;
    public static Float kursVor1Monat;
    public static Float kursVor2Monaten;
    public static Float kursVor3Monaten;
    public static Float aktienkursVor1Monaten;
    public static Float aktienkursVor2Monaten;
    public static Float aktienkursVor3Monaten;
    public static Float gewinnschaetzungFuerNaechstesJahr;
    public static Float gewinnschaetzungFuerDiesesJahr;
    public static Float gewinnVor1Jahr;
    public static Float jahresumsatz;
    public static Float gewinnschaetzung;
    public static Float gewinnAVG;
    public static Float GewinnVor3Jahren;
    public static Float GewinnVor2Jahren;
    public static Float kursgewinnschaetzungNaechstesJahr;

    @FXML
    public TableView<ShowUserInputManageUI> checkInputsID;
    @FXML
    TableColumn<ShowUserInputManageUI, String> userInputFigures;
    @FXML
    TableColumn<ShowUserInputManageUI, Float> userInputValues;

    private final ObservableList<ShowUserInputManageUI> checkIt = FXCollections.observableArrayList();

    ScreensController myController;

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userInputFigures.setCellValueFactory(new PropertyValueFactory<ShowUserInputManageUI, String>("inputFigure1"));
        userInputValues.setCellValueFactory(new PropertyValueFactory<ShowUserInputManageUI, Float>("inputValue1"));

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
        checkIt.clear();
        checkIt.add(new ShowUserInputManageUI("Jahresueberschuss", jahresueberschuss));
        checkIt.add(new ShowUserInputManageUI("Eigenkapital", eigenkapital));
        checkIt.add(new ShowUserInputManageUI("Gewinn(EBIT)", gewinnEBIT));
        checkIt.add(new ShowUserInputManageUI("Fremdkapital", fremdkapital));
        checkIt.add(new ShowUserInputManageUI("Aktueller Aktienkurs", aktuellerAktienkurs));
        checkIt.add(new ShowUserInputManageUI("Kaufen", kaufen));
        checkIt.add(new ShowUserInputManageUI("Verkaufen", verkaufen));
        checkIt.add(new ShowUserInputManageUI("Halten", halten));
        checkIt.add(new ShowUserInputManageUI("Kursanstieg Unternehmen", kursAnstiegUnternehmen));
        checkIt.add(new ShowUserInputManageUI("Kursanstieg Aktienindex", kursAnstiegAktienindex));
        checkIt.add(new ShowUserInputManageUI("Gewinnschätzung vor 4 Wochen", gewinnschaetzungVor4Wochen));
        checkIt.add(new ShowUserInputManageUI("Aktuelle Gewinnschätzung", aktuelleGewinnschaetzung));
        checkIt.add(new ShowUserInputManageUI("Aktienkurs vor 6 Monaten", aktienkursVor6Monaten));
        checkIt.add(new ShowUserInputManageUI("Aktienkurs vor 12 Monaten", aktienkursVor12Monaten));
        checkIt.add(new ShowUserInputManageUI("Aktueller erwarteter Kursgewinn", aktuellerErwarteterKursgewinn));
        checkIt.add(new ShowUserInputManageUI("Kurs vor 1 Monat", kursVor1Monat));
        checkIt.add(new ShowUserInputManageUI("Kurs vor 2 Monaten", kursVor2Monaten));
        checkIt.add(new ShowUserInputManageUI("Kurs vor 3 Monaten", kursVor3Monaten));
        checkIt.add(new ShowUserInputManageUI("Aktienkurs vor 1 Monat", aktienkursVor1Monaten));
        checkIt.add(new ShowUserInputManageUI("Aktienkurs vor 2 Monaten", aktienkursVor2Monaten));
        checkIt.add(new ShowUserInputManageUI("Aktienkurs vor 3 Monaten", aktienkursVor3Monaten));
        checkIt.add(new ShowUserInputManageUI("Gewinnschätzung für nächstes Jahr", gewinnschaetzungFuerNaechstesJahr));
        checkIt.add(new ShowUserInputManageUI("Gewinnschätzung für dieses Jahr", gewinnschaetzungFuerDiesesJahr));
        checkIt.add(new ShowUserInputManageUI("Gewinn vor 1 Jahr", gewinnVor1Jahr));
        checkIt.add(new ShowUserInputManageUI("Jahresumsatz", jahresumsatz));
        checkIt.add(new ShowUserInputManageUI("Gewinnschätzung", gewinnschaetzung));
        checkIt.add(new ShowUserInputManageUI("Gewinn AVG", gewinnAVG));
        checkIt.add(new ShowUserInputManageUI("Gewinn vor 3 Jahren", GewinnVor3Jahren));
        checkIt.add(new ShowUserInputManageUI("Gewinn vor 2 Jahren", GewinnVor2Jahren));
        checkIt.add(new ShowUserInputManageUI("Kursgewinnschätzung n. Jahr", kursgewinnschaetzungNaechstesJahr));
    }

}