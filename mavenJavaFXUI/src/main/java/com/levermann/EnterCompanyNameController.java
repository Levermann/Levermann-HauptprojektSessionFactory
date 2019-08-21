package com.levermann;

import java.io.IOException;
import javafx.fxml.FXML;

public class EnterCompanyNameController implements ControlledScreenInterface {

    ScreensController myController;

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    private void switchToInput() throws IOException {
        //App.setRoot("input");
        myController.setScreen(App.inputID);
        App.setStageTitle("Kerndateneingabe");
    }
}