/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author blendajazi
 */
public class AnalyseErstellenController implements Initializable, ControlledScreenInterface {

    ScreensController myController;
    
    @FXML
    public TextField Unternehmen;
    @FXML
    public Button sreen1Weiter;
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent; }
    
    
    public void handleButtonClick(){
    }
     
//    @FXML
//    private void Update(ActionEvent event){
//        
//       Update update = new Update();
//        
//       update.Unternehmen(Integer.parseInt(Unternehmen.getText()));
//       
//       
//       
//       myController.setScreen(com.levermann.GuiNew.screen1ID);
//       
//    }
     
    
    
   
    
}
