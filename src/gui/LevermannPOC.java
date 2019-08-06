/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.*;

/**
 *
 * @author Max
 */
public class LevermannPOC extends Application {
    
    //initialisiere den company handler, in dem die aktive Liste der Unternehmen gespeichert ist
    public static CompanyHandler ch = CompanyHandler.getInstance();
    
    public static String screen0ID = "S0Controller";
    //public static String screen0File = "fxmlfiles.S0MainInput.fxml";
    public static String screen0File = "S0Startseite.fxml";
    public static String screen1ID = "S1Controller";
    //public static String screen1File = "fxmlfiles.S1ShowAllResults.fxml";    
    public static String screen1File = "S1ShowAllResults.fxml"; 
    public static String screen2ID = "S2Controller";
    //public static String screen2File = "fxmlfiles.S2ShowSpecificResult.fxml";
    public static String screen2File = "S2ShowSpecificResult.fxml";
    public static String screen3ID = "S3Controller";
    //public static String screen3File = "fxmlfiles.S3ShowSingleMethod.fxml";
    public static String screen3File = "S3ShowSingleMethod.fxml";
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        ScreensController mainContainer = new ScreensController();
        
        mainContainer.loadScreen(LevermannPOC.screen0ID, LevermannPOC.screen0File);
        mainContainer.loadScreen(LevermannPOC.screen1ID, LevermannPOC.screen1File);
        mainContainer.loadScreen(LevermannPOC.screen2ID, LevermannPOC.screen2File);
        mainContainer.loadScreen(LevermannPOC.screen3ID, LevermannPOC.screen3File);
        
        mainContainer.setScreen(LevermannPOC.screen0ID);
        
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
    
    private void dummy(){
        CompanyHandler ch = CompanyHandler.getInstance();
        Company c = new Company();
        c.setJahresuberschuss(500);
        c.setEigenkapital(500);
        c.setName("BMW");
        c.refreshCompany();
        ch.addItem(c);
        
        
        Company b = new Company();
        b.setJahresuberschuss(200);
        b.setEigenkapital(100);
        b.setName("VW");        
        b.refreshCompany();
        ch.addItem(b);
        
        
    }
    
}
