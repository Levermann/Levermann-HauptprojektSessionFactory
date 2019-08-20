package com.levermann;

import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class CompanyOverviewController implements Initializable {



    @FXML
    TableView<CompanyManageUI> tableID;
    @FXML
    TableColumn<CompanyManageUI, String> companyName;
    @FXML
    TableColumn<CompanyManageUI, String> creationDate;
    @FXML
    TableColumn<CompanyManageUI, Integer> analysisScore;
    @FXML
    TableColumn<CompanyManageUI, String> delete;
    @FXML
    TableColumn<CompanyManageUI, String> edit;
    @FXML
    TableColumn<CompanyManageUI, String> show;


    final ObservableList<CompanyManageUI> overview = FXCollections.observableArrayList(
            new CompanyManageUI("BMW", "hansWurschti", 12, "hierMüllIcon", "hiePfeilIcon", "hierLupenIcon")


    );


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        companyName.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, String>("company1"));
        creationDate.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, String>("dateFormat"));
        analysisScore.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, Integer>("score1"));
        delete.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, String>("delete1"));
        edit.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, String>("edit1"));
        show.setCellValueFactory(new PropertyValueFactory<CompanyManageUI, String>("show1"));

        tableID.setItems(overview);
    }
    @FXML
    private void switchToEnterCompanyName() throws IOException {
        App.setRoot("enterCompanyName");
    }
    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        App.setRoot("startPage");
    }
}