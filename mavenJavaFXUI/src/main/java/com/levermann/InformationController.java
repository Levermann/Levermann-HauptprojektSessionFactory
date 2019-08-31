package com.levermann;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
/**
 * this Controller was made for showing closer details: description, meaning and calculation in relation to the Levermannanalyse
 */
public class InformationController implements ControlledScreenInterface {

    ScreensController myController;

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @FXML
    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        //TODO Schließe die Session, zurück zu Startseite
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }
}