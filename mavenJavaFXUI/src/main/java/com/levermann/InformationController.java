package com.levermann;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class InformationController implements ControlledScreenInterface {

    ScreensController myController;

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @FXML
    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        //App.setRoot("startPage");
        //TODO Schließe die Session, zurück zu Startseite
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }
}