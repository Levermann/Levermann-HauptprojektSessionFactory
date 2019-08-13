package Gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.text.Element;
import javax.swing.text.html.ImageView;

import java.awt.*;
import javafx.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.util.Date;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class JavaFXMain extends Application {

    public static String screen0ID = "com.levermann.GuiNew.StartseiteController.java";
    public static String screen0File = "com.levermann.GuiNew.Startseite.fxml";

    public static String screen1ID = "AnalyseErstellenController";
    public static String screen1File = "AnalyseErstellen.fxml";

    public static String screen2ID = "AnalyseEinsehenController";
    public static String screen2File = "AnalyseEinsehen.fxml";

    public static String screen3ID = "AnalyseSpeichernController";
    public static String screen3File = "AnalyseSpeichern.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception {



        ScreensController mainContainer = new ScreensController();


        mainContainer.loadScreen(JavaFXMain.screen0ID, JavaFXMain.screen0File);
        //mainContainer.loadScreen(JavaFXMain.screen0ID, JavaFXMain.screen0File);

        mainContainer.loadScreen(JavaFXMain.screen1ID, JavaFXMain.screen1File);
        //mainContainer.loadScreen(JavaFXMain.screen1ID, JavaFXMain.screen1File);

        mainContainer.loadScreen(JavaFXMain.screen2ID, JavaFXMain.screen2File);
        //mainContainer.loadScreen(JavaFXMain.screen2ID, JavaFXMain.screen2File);

        mainContainer.loadScreen(JavaFXMain.screen3ID, JavaFXMain.screen3File);
        //mainContainer.loadScreen(JavaFXMain.screen3ID, JavaFXMain.screen3File);


        mainContainer.setScreen(JavaFXMain.screen0ID);

        FXMLLoader loader = new FXMLLoader(JavaFXMain.class.getResource("Startseite.fxml"));
        GridPane root = new GridPane();

        // Button 1
        Button button1 = new Button(":) Klick me");

        DropShadow shadow = new DropShadow();

        // Set Style
    //   button1.setStyle("-fx-font: 70 arial; -fx-base: #b6e7c9;");



        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                button1.setText("hello");
            }
        });

        // Adding the shadow when the mouse cursor is on
      /*  button1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>()) {
            @Override
            public void handle(MouseEvent e) {
                button1.setEffect(shadow);
            }
        };

       */

        root.getChildren().add (button1 );

        primaryStage.setTitle("Levermannnnn");
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.setHeight(750);
        primaryStage.setWidth(750);
        primaryStage.show();



       }

    /**
     * @param args the command line arguments
     */
        public static void main (String[] args) {

   launch(args);


    }
}