package com.levermann;

import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class CompanyOverviewController implements Initializable, ControlledScreenInterface {


    @FXML
    TableView<CompanyManageUI> tableID;
    @FXML
    TableColumn<CompanyManageUI, String> companyName;
    @FXML
    TableColumn<CompanyManageUI, String> creationDate;
    @FXML
    TableColumn<CompanyManageUI, Integer> analysisScore;
    @FXML
    TableColumn<CompanyManageUI, Button> delete;
    @FXML
    TableColumn<CompanyManageUI, Button> edit;
    @FXML
    TableColumn<CompanyManageUI, Button> show;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initTable();
    }

    private void initTable(){
        initCols();
        loadData();
    }

    private void initCols(){
        companyName.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, String>("company1"));
        creationDate.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, String>("dateFormat"));
        analysisScore.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, Integer>("score1"));
        delete.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, Button>("delete1"));
        edit.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, Button>("edit1"));
        show.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, Button>("show1"));

        editTableCols();
    }

    private void editTableCols(){
/*
        companyName.setCellFactory(TextFieldTableCell.forTableColumn());
        companyName.setOnEditCommit(e -> {
            e.getTableView().getItems().get(e.getTablePosition().getRow().setCompany1(e.getNewValue()));
        });

        creationDate.setCellFactory(TextFieldTableCell.forTableColumn());
        creationDate.setOnEditCommit(e -> {
            e.getTableView().getItems().get(e.getTablePosition().getRow().setDateFormat(e.getNewValue()));
        });

 */

        tableID.setEditable(true);
    }

    private void loadData(){
        ObservableList<CompanyManageUI> overview = FXCollections.observableArrayList();
        for (int i= 0; i < 7; i++){
            overview.add(new CompanyManageUI("BMW", "heute" + i, 12 + i, new Button("delete"), new Button("edit"), new Button("show")));
        }
        tableID.setItems(overview);
    }



    ScreensController myController;

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    //TODO Der Firmenname, der vom User in EnterCompanyName Seite eingegeben wurde muss ersetzt werden durch company1

    @FXML
    private void tableAktualisieren(){

    }

    @FXML
    private void switchToEnterCompanyName() throws IOException {
        //App.setRoot("enterCompanyName");
        myController.setScreen(App.enterCompanyNameID);
        App.setStageTitle("Unternehmensnamen angeben");
    }
    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        //App.setRoot("startPage");
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }
}