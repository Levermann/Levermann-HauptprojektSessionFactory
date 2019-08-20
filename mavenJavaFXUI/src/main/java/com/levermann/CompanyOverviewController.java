package com.levermann;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.io.IOException;

public class CompanyOverviewController {

    @FXML
    private void switchToEnterCompanyName() throws IOException {
        App.setRoot("enterCompanyName");
    }
    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        App.setRoot("startPage");
    }
}