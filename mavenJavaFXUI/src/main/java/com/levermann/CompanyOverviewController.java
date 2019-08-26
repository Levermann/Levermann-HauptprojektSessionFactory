package com.levermann;

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
import java.util.ResourceBundle;

public class CompanyOverviewController implements Initializable, ControlledScreenInterface {

    public static String companyNameString;
    public static String dateString = "16.12.1999";
    public static String deleteString = "hierMüllIcon";
    public static String editString = "hierPfeilIcon";
    public static String showString = "hierLupenIcon";
    public static int analysisScoreTest = 10;

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

    public ObservableList<CompanyManageUI> overview = FXCollections.observableArrayList(
        new CompanyManageUI("BMW", "16.12.1999", 12, "hierMüllIcon", "hiePfeilIcon", "hierLupenIcon")
    );
    ScreensController myController;

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

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
    private void tableAktualisieren(){
        overview.add(new CompanyManageUI(companyNameString, dateString, analysisScoreTest, deleteString,editString, showString));
        //tableID.refresh();
        //System.out.println("hi");
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