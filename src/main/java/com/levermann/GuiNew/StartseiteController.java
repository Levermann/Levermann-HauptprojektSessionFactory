/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.GuiNew;

import com.levermann.GuiNew.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;




/**
 * FXML Controller class
 *
 * @author blendajazi
 */
public class StartseiteController implements Initializable, ControlledScreenInterface {

    ScreensController myController;
    
    @FXML
    public Button LAerstellen;
    @FXML
    public Button LAeinsehen;
    @FXML
    public Button LevermannDetails;
    @FXML
    public TableColumn Unternehmen;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
  
    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    
   
    
    public void handleButtonClick(){
        
     
    }
    
//      @FXML
//    private void (ActionEvent event){
//        
//       Update update = new Update();
//        
//       update.Unternehmen(Integer.parseInt(Unternehmen.getText()));
//       
//       
//       
//       myController.setScreen(com.levermann.GuiNew.screen0ID);
//       
//    }  
    


}


