package com.levermann;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class InputController {

    @FXML
    private void switchToShowResult() throws IOException {
        App.setRoot("showResult");
    }

    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        App.setRoot("startPage");
    }
}
