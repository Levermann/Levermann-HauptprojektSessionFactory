package com.levermann;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class ShowResultController {

    //configure to the table
    @FXML private TableView<Object> tableView;


    @FXML
    private void switchToCompanyOverview() throws IOException {
        App.setRoot("companyOverview");
    }
}