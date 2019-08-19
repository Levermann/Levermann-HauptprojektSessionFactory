package com.levermann;

import javafx.fxml.FXML;

import java.io.IOException;

public class InputControllerController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("startPage");
    }
}