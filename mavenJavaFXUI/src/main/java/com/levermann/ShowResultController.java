package com.levermann;

import javafx.fxml.FXML;

import java.io.IOException;

public class ShowResultController {

    @FXML
    private void switchToEnterCompanyName() throws IOException {
        App.setRoot("input");
    }
}