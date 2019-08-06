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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Max
 */
public class S0Controller implements Initializable, ControlledScreenInterface {
    
    ScreensController myController;
    
    @FXML
    private Button finishButton;
    @FXML
    private TextField JUE;
    @FXML
    private TextField EK;
    @FXML
    private TextField name;    
    @FXML
    private TableView MainTable;
    @FXML
    private TableColumn Unternehmen;
    @FXML
    private TableColumn Gesamtpunkte;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        MainTable.setItems(CompanyHandler.obsAllCompanies);
        TableColumn<Company, String> namecolumn = new TableColumn<>("NAME");
        namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn<Company, String> ergebniscolumn = new TableColumn<>("ERGEBNIS");
        Gesamtpunkte.setCellValueFactory(new PropertyValueFactory<>("ergebnis"));
        MainTable.getColumns().setAll(namecolumn, ergebniscolumn);
    }    
    
    @FXML
    private void handleCloseButton(ActionEvent event){
        System.exit(0);
    }
    
    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    
    @FXML
    private void gotoNext(ActionEvent event){
        //CompanyHandler ch = CompanyHandler.getInstance();
        //Company c = new Company();
        //c.setJahresuberschuss(Integer.parseInt(JUE.getText()));
        //c.setEigenkapital(Integer.parseInt(EK.getText()));
        //c.setName(name.getText());
        //ch.addItem(c);
        //c.refreshCompany();
        myController.setScreen(LevermannPOC.screen1ID);
    }
}
