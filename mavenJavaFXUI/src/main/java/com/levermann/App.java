package com.levermann;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;



import java.io.IOException;


/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    public static String startPageID = "startPage";
    public static String startPageFile = "startPage.fxml";
    public static String enterCompanyNameID = "enterCompanyName";
    public static String enterCompanyNameFile = "enterCompanyName.fxml";
    public static String inputID = "input";
    public static String inputFile = "input.fxml";
    public static String showResultID = "showResult";
    public static String showResultFile = "showResult.fxml";
    public static String companyOverviewID = "companyOverview";
    public static String companyOverviewFile = "companyOverview.fxml";
    public static String informationID = "information";
    public static String informationFile = "information.fxml";
    public static String showUserInputID = "ShowUserInput";
    public static String showUserInputFile = "userInput.fxml";

    private static Stage stage;

    @Override
    public void start(Stage startStage) throws IOException {

        setStage(startStage);

        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(App.startPageID, App.startPageFile);
        mainContainer.loadScreen(App.enterCompanyNameID, App.enterCompanyNameFile);
        mainContainer.loadScreen(App.inputID, App.inputFile);
        mainContainer.loadScreen(App.showResultID, App.showResultFile);
        mainContainer.loadScreen(App.companyOverviewID, App. companyOverviewFile);
        mainContainer.loadScreen(App.informationID, App.informationFile);
        mainContainer.loadScreen(App.showUserInputID, App.showUserInputFile);
        mainContainer.setScreen(App.startPageID);


        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        setStageTitle("Hauptmenü");

        //stage.setTitle("Hauptmenü");
        setStageSize(810,1500);
        stage.show();

            /**
            scene = new Scene(loadFXML("startPage"));
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Main Menu");
        **/
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    private void setStage(Stage startStage){
        stage = startStage;
    }

    public Stage getStage(){
        return stage;
    }

    public static void setStageTitle(String name){
        stage.setTitle(name);
    }

    public static void setStageSize(int height, int width){
        stage.setHeight(810);
        stage.setWidth(1500);
    }

    //http://javafx.com/javafx/11.0.1 für fxml

}