/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.GuiNew;

import java.net.URL;
import java.util.ResourceBundle;

import com.levermann.DatabaseStatements.UpdateUnternehmenDB;
import com.mycompany.demo.Update;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import com.levermann.kennzahlen_fertig_review.*;
import com.levermann.GuiNew.*;



public class S1EigenkapitalrenditeController implements Initializable, ControlledScreenInterface {
    
    ScreensController myController;
 
    @FXML
    public TextField Jahresueberschuss;
    @FXML
    public TextField Eigenkapital;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
   
//    
//    @FXML
//    private void handleCloseButton(ActionEvent event){
//        System.exit(0);
//      }
    
    @Override
    public void setScreenParent(ScreensController screenParent){
    myController = screenParent; }
    
    @FXML
    private void Update(ActionEvent event){
        
       UpdateUnternehmenDB update = new UpdateUnternehmenDB();

        update.Jahresueberschuss ("Jahresüberschuss",Integer.parseInt(Jahresueberschuss.getText()));
       //update.DaoEigenkapital(" ", Integer.parseInt(Eigenkapital.getText()));
       
    }
    

//    @FXMl
//    private void gotoNext(ActionEvent event){
//        kaufen ch = kaufen.getInstance();
//        Company c = new Company();
//        c.setJahresuberschuss(Integer.parseInt(JUE.getText()));
//        c.setEigenkapital(Integer.parseInt(EK.getText()));
//        c.setName(name.getText());
//        ch.addItem(c);
//        c.refreshCompany();
//        myController.setScreen(LevermannPOC.screen1ID);
//    }
//    



}
      
       
    
