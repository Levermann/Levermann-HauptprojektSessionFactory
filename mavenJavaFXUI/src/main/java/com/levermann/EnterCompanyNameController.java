package com.levermann;

import java.io.IOException;
import javafx.fxml.FXML;

public class EnterCompanyNameController {

    @FXML
    private void switchToInput() throws IOException {
        App.setRoot("input");
    }
}