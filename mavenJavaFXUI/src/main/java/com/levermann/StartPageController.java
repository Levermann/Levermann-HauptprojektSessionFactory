package com.levermann;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class StartPageController implements ControlledScreenInterface {

    ScreensController myController;

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    private void switchToInput() throws IOException {
        //App.setRoot("enterCompanyName");
        myController.setScreen(App.inputID);
        App.setStageTitle("Unternehmensnamen angeben");
    }
    @FXML
    private void switchToCompanyOverview() throws IOException{
        //App.setRoot("companyOverview");
        myController.setScreen(App.companyOverviewID);
        App.setStageTitle("Allgemeine Unternehmensübersicht");
    }
    @FXML
    private void switchToInformations() throws IOException{
        //App.setRoot("companyOverview");
        myController.setScreen(App.informationID);
        App.setStageTitle("Allgemeine Unternehmensübersicht");
    }

}
