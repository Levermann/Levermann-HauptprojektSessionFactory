/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Max
 */
public class S2Controller implements Initializable, ControlledScreenInterface {

    /**
     * Initializes the controller class.
     */
    ScreensController myController;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    
    @FXML
    public void gotoNext(ActionEvent event){
        myController.setScreen(LevermannPOC.screen3ID);
    }
    
    @FXML
    public void gotoPrev(ActionEvent event){
        myController.setScreen(LevermannPOC.screen1ID);
    }
    
}
