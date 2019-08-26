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

    @FXML
    TableView<ShowUserInputManageUI> checkInputsID;
    @FXML
    TableColumn<ShowUserInputManageUI, String> userInputFigures;
    @FXML
    TableColumn<ShowUserInputManageUI, Float> userInputValues;

    final ObservableList<ShowUserInputManageUI> checkIt = FXCollections.observableArrayList(
            new ShowUserInputManageUI("Jahresueberschuss", (float) 15003),
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
            new ShowUserInputManageUI("Gewinnschätzung für dieses Jahr", (float) 1231)

            );

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


}