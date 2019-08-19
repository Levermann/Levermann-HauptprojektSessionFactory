package com.levermann;

import java.io.IOException;
import javafx.fxml.FXML;

public class EnterCompanyNameController {

    @FXML
    private void switchToStartPage() throws IOException {
        App.setRoot("startPage");
    }
}