/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * FXML Controller class
 *
 * @author Max
 */
public class S1Controller implements Initializable, ControlledScreenInterface{

    ScreensController myController;
    
    @FXML
    private TableView mainTable;
    @FXML
    private TableColumn cName;
    @FXML
    private TableColumn cPoints;
    
    private CompanyHandler ch;
    private List<Company> l;
    
    private final ObservableList<Company> data = FXCollections.observableArrayList();    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*l = ch.getAllCompanies();
        mainTable.setEditable(true);
        cName.setMinWidth(150);
        cName.setCellValueFactory(new PropertyValueFactory<Company, String>("name"));
        cName.setMinWidth(150);
        cName.setCellValueFactory(new PropertyValueFactory<Company, String>("ergebnis"));
        mainTable.setItems((ObservableList) l);*/
        mainTable.setEditable(true);
        cName.setCellValueFactory(new PropertyValueFactory<Company, String>("name"));
        cPoints.setCellValueFactory(new PropertyValueFactory<Company, String>("ergebnis"));
        fillObservable();
        mainTable.setItems(data);
    }   
    
    private void fillObservable(){
        ch = CompanyHandler.getInstance();     
        List<Company> l = ch.getAllCompanies();
        for(int i = 0; i < ch.getListSize(); i++){
            data.add(l.get(i));
        }
        for(int i = 0; i < data.size(); i++){
            System.out.println(data.get(i));
        }
    }
    
    @FXML
    public void fillTable(ActionEvent event){
        
    }

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    
    @FXML
    private void gotoPrevious(ActionEvent event){
        myController.setScreen(LevermannPOC.screen0ID);
    }
    
    //gibt alle Listenelemente auf der Konsole aus
    @FXML
    public void refreshView(ActionEvent event){
        //listProperty.set(FXCollections.observableArrayList(l));
        CompanyHandler ch = CompanyHandler.getInstance();
        System.out.println(ch.toString());
    }
    
    //füge neues Unternehmen zur Liste hinzu
    @FXML
    public void addCustomer(ActionEvent event){
        CompanyHandler ch = CompanyHandler.getInstance();
        System.out.println(ch.toString());
        myController.setScreen(LevermannPOC.screen0ID);
    }
    
    @FXML
    public void gotoNext(){
        //listProperty.set(FXCollections.observableArrayList(l));
        myController.setScreen(LevermannPOC.screen2ID);
    }
    
}
