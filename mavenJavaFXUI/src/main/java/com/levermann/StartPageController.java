package com.levermann;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class StartPageController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");

        Image imageBackground = new Image(getClass().getResource("pictures/aktienchart.png").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);

        ImageView imageView = new ImageView(imageBackground);
    }
}
