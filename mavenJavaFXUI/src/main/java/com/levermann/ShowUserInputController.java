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
            new ShowUserInputManageUI("Jahresueberschuss", (float) 20000),
            new ShowUserInputManageUI("Eigenkapital", (float) 100000),
            new ShowUserInputManageUI("Gewinn(EBIT)", (float) 75000),
            new ShowUserInputManageUI("Fremdkapital", (float) 150000),
            new ShowUserInputManageUI("Aktueller Aktienkurs", (float) 10),
            new ShowUserInputManageUI("Kaufen", (float) 1),
            new ShowUserInputManageUI("Verkaufen", (float) 4),
            new ShowUserInputManageUI("Halten", (float) 2),
            new ShowUserInputManageUI("Kursanstieg des Unternehmens", (float) 0.04),
            new ShowUserInputManageUI("Kursanstieg Aktienindex", (float) 0.01),
            new ShowUserInputManageUI("Gewinnschätzung vor 4 Wochen", (float) 2.0),
            new ShowUserInputManageUI("Aktuelle Gewinnschätzung", (float) 1.84),
            new ShowUserInputManageUI("Aktienkurs vor 6 Monaten", (float) 45),
            new ShowUserInputManageUI("Aktienkurs vor 12 Monaten", (float) 40),
            new ShowUserInputManageUI("aktuell erwarteter Kursgewinn", (float) 1.25),
            new ShowUserInputManageUI("Kurs vor 1 Monat", (float) 0.02),
            new ShowUserInputManageUI("Kurs vor 2 Monaten", (float) -0.02),
            new ShowUserInputManageUI("Kurs vor 3 Monaten", (float) 0.05),
            new ShowUserInputManageUI("Aktienkurs vor 1 Monat", (float) 0.04),
            new ShowUserInputManageUI("Aktienkurs vor 2 Monaten", (float) -0.01),
            new ShowUserInputManageUI("Aktienkurs vor 3 Monaten", (float) 0.08),
            new ShowUserInputManageUI("Gewinnschätzung für nächstes Jahr", (float) 1.23),
            new ShowUserInputManageUI("Gewinnschätzung für dieses Jahr", (float) 1.23),
            new ShowUserInputManageUI("Gewinn vor einem Jahr", (float) 1.23),
            new ShowUserInputManageUI("Jahresumsatz", (float) 1.23),
            new ShowUserInputManageUI("Gewinnschätzung", (float) 1.23),
            new ShowUserInputManageUI("durchschnittlicher Gewinn", (float) 1.23),
            new ShowUserInputManageUI("Gewinn vor 3 Jahren", (float) 7000),
            new ShowUserInputManageUI("Gewinn vor 2 Jahren", (float) 7500),
            new ShowUserInputManageUI("Kursgewinn nächstes Jahr", (float) 1.23)

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