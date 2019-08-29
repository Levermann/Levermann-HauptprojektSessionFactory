package com.levermann;

import com.levermann.DB.DBConnection;
import com.levermann.entityclass.Company;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CompanyOverviewController implements Initializable, ControlledScreenInterface {
    final static Logger logger = Logger.getLogger(com.levermann.CompanyOverviewController.class);
    private Connection con;

    @FXML
    private TableView<Company> tableID;
    @FXML
    private TableColumn<Company, String> companyName;
    @FXML
    private TableColumn<Company, String> creationDate;
    @FXML
    private TableColumn<Company, Float> analysisScore;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Connection con = DBConnection.getConnection();
            System.out.println("Levermann database connected!");

        } catch (SQLException e) {
            System.err.println("Could not connect to Leverman database...");
            e.printStackTrace();
        }
        try {
            ResultSet rs = con.createStatement().executeQuery("select Companyname, datum, GesamtPunkte from company");

            while (rs.next()) {
                overview.add(new Company(rs.getString("Companyname"), rs.getString("datum"), rs.getFloat("GesamtPunke")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        companyName.setCellValueFactory(new PropertyValueFactory<Company, String>("Companyname"));
        creationDate.setCellValueFactory(new PropertyValueFactory<Company, String>("datum"));
        analysisScore.setCellValueFactory(new PropertyValueFactory<Company, Float>("GesamtPunkte"));

        tableID.setItems(overview);
    }
    ObservableList<Company> overview = FXCollections.observableArrayList();

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