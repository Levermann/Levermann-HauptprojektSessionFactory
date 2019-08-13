/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import com.levermann.DatabaseStatements.UpdateUnternehmenDB;
import javafx.fxml.*;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader.*;




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
    
      @FXML
    private void Jahresueberschuss(ActionEvent event){
        
       UpdateUnternehmenDB update = new UpdateUnternehmenDB();
        
       update.Jahresueberschuss("Bmw", 2000);
       
       
       
       myController.setScreen(JavaFXMain.screen0ID);
       
    }



}


