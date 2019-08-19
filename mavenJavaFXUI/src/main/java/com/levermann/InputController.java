package com.levermann;

import javafx.fxml.FXML;

import java.io.IOException;

public class InputController {

    @FXML
    private void switchToShowResult() throws IOException {
        App.setRoot("showResult");
    }
}