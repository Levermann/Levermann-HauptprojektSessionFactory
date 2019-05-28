package com.levermann.GuiNew;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class JavaFXMain extends Application {
   
    public static String screen0ID = "StartseiteController";
    public static String screen0File = "Startseite.fxml";
    
    public static String screen1ID = "AnalyseErstellenController";
    public static String screen1File = "AnalyseErstellen.fxml";
    
    public static String screen2ID = "AnalyseEinsehenController";
    public static String screen2File = "AnalyseEinsehen.fxml";
    
    public static String screen3ID = "AnalyseSpeichernController";
    public static String screen3File = "AnalyseSpeichern.fxml";
   
    public static String screenS1ID = "S1EigenkapitalrenditeController";  
    public static String screenS1File = "S1Eigenkapitalrendite.fxml";
    
    public static String screenS2ID = "S2EBITmargeController";
    public static String screenS2File = "S2EBITmarge.fxml";
   
    public static String screenS3ID = "S3EigenkapitalquoteController";
    public static String screenS3File = "S3Eigenkapitalquote.fxml";
    
    public static String screenS4ID = "S4KGVueber5JahreController";
    public static String screenS4File = "SS4KGVueber5Jahre.fxml";
    
    public static String screenS5ID = "S5KGVaktJahrController";
    public static String screenS5File = "S5KGVaktJahr.fxml";
    
    public static String screenS6ID = "S6AnalystenmeinungenController";
    public static String screenS6File = "S6Analystenmeinungen.fxml";
    
    public static String screenS7ID = "S7ReaktionQuartalszahlenController";
    public static String screenS7File = "S7ReaktionQuartalszahlen.fxml";
    
    public static String screenS8ID = "S8GewinnrevisionenController";
    public static String screenS8File = "S8Gewinnrevisionen.fxml";
    
    public static String screenS9ID = "S9KursheuteggKursvor6MonatenController";
    public static String screenS9File = "S9KursheuteggKursvor6Monaten.fxml";
    
    public static String screenS10ID = "S10KursheuteggKursvor1JahrController";
    public static String screenS10File = "S10KursheuteggKursvor1Jahr.fxml";
    
    public static String screenS11ID = "S11KursmomentumController";
    public static String screenS11File = "S11Kursmomentum.fxml";
    
    public static String screenS12ID = "S12DreimonatsreversalController";
    public static String screenS12File = "S12Dreimonatsreversal.fxml";
    
    public static String screenS13ID = "S13GewinnwachstumController";
    public static String screenS13File = "S13Gewinnwachstum.fxml";
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        com.levermann.GuiNew.ScreensController mainContainer = new com.levermann.GuiNew.ScreensController();
        
        mainContainer.loadScreen(JavaFXMain.screen0ID, JavaFXMain.screen0File);
        mainContainer.loadScreen(JavaFXMain.screen0ID, JavaFXMain.screen0File);
        
        mainContainer.loadScreen(JavaFXMain.screen1ID, JavaFXMain.screen1File);
        mainContainer.loadScreen(JavaFXMain.screen1ID, JavaFXMain.screen1File);
        
        mainContainer.loadScreen(JavaFXMain.screen2ID, JavaFXMain.screen2File);
        mainContainer.loadScreen(JavaFXMain.screen2ID, JavaFXMain.screen2File);
        
        mainContainer.loadScreen(JavaFXMain.screen3ID, JavaFXMain.screen3File);
        mainContainer.loadScreen(JavaFXMain.screen3ID, JavaFXMain.screen3File);
        
        mainContainer.loadScreen(JavaFXMain.screenS1ID, JavaFXMain.screenS1File);
        mainContainer.loadScreen(JavaFXMain.screenS1ID, JavaFXMain.screenS1File);
        
        mainContainer.loadScreen(JavaFXMain.screenS2ID, JavaFXMain.screenS2File);
        mainContainer.loadScreen(JavaFXMain.screenS2ID, JavaFXMain.screenS2File);
        
        mainContainer.loadScreen(JavaFXMain.screenS3ID, JavaFXMain.screenS3File);
        mainContainer.loadScreen(JavaFXMain.screenS3ID, JavaFXMain.screenS3File);
        
        mainContainer.loadScreen(JavaFXMain.screenS4ID, JavaFXMain.screenS4File);
        mainContainer.loadScreen(JavaFXMain.screenS4ID, JavaFXMain.screenS4File);
        
        mainContainer.loadScreen(JavaFXMain.screenS4ID, JavaFXMain.screenS4File);
        mainContainer.loadScreen(JavaFXMain.screenS4ID, JavaFXMain.screenS4File);
        
        mainContainer.loadScreen(JavaFXMain.screenS5ID, JavaFXMain.screenS5File);
        mainContainer.loadScreen(JavaFXMain.screenS5ID, JavaFXMain.screenS5File);
        
        mainContainer.loadScreen(JavaFXMain.screenS6ID, JavaFXMain.screenS6File);
        mainContainer.loadScreen(JavaFXMain.screenS6ID, JavaFXMain.screenS6File);
        
        mainContainer.loadScreen(JavaFXMain.screenS7ID, JavaFXMain.screenS7File);
        mainContainer.loadScreen(JavaFXMain.screenS7ID, JavaFXMain.screenS7File);
        
        mainContainer.loadScreen(JavaFXMain.screenS8ID, JavaFXMain.screenS8File);
        mainContainer.loadScreen(JavaFXMain.screenS8ID, JavaFXMain.screenS8File);
        
        mainContainer.loadScreen(JavaFXMain.screenS9ID, JavaFXMain.screenS9File);
        mainContainer.loadScreen(JavaFXMain.screenS9ID, JavaFXMain.screenS9File);
        
        mainContainer.loadScreen(JavaFXMain.screenS10ID, JavaFXMain.screenS10File);
        mainContainer.loadScreen(JavaFXMain.screenS10ID, JavaFXMain.screenS10File);
   
        mainContainer.loadScreen(JavaFXMain.screenS11ID, JavaFXMain.screenS11File);
        mainContainer.loadScreen(JavaFXMain.screenS11ID, JavaFXMain.screenS11File);
        
        mainContainer.loadScreen(JavaFXMain.screenS12ID, JavaFXMain.screenS12File);
        mainContainer.loadScreen(JavaFXMain.screenS12ID, JavaFXMain.screenS12File);
        
        mainContainer.loadScreen(JavaFXMain.screenS13ID, JavaFXMain.screenS13File);
        mainContainer.loadScreen(JavaFXMain.screenS13ID, JavaFXMain.screenS13File);
        
        
        
        
        mainContainer.setScreen(JavaFXMain.screen0ID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setHeight(750);
        primaryStage.setWidth(750);
        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
   
    
    
    }    
}