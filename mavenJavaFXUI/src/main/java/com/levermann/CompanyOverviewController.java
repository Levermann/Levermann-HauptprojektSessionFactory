package com.levermann;

import com.levermann.DB.DBConnection;
import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
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

        Company company = new Company();

        Session session1 = HibernateUtil.getSessionFactory().openSession();
        session1.beginTransaction();
        /*
        Company company1 = (Company) session1.get(Company.class, 1L);
        company1.getGesamtPunkte();
        company1.getCompanyname();
        company1.getDatum();

         */
        String nameforOverview = company.getCompanyname();
        String datumForOverview = company.getDatum();
        float SumScore = company.getGesamtPunkte();
        System.out.println(company.getCompanyname() + " - " +company.getGesamtPunkte());


        final ObservableList<Company> overview = FXCollections.observableArrayList(
                new Company(nameforOverview, datumForOverview, SumScore)
        );
        companyName.setCellValueFactory(new PropertyValueFactory<Company, String>("Companyname"));
        creationDate.setCellValueFactory(new PropertyValueFactory<Company, String>("datum"));
        analysisScore.setCellValueFactory(new PropertyValueFactory<Company, Float>("GesamtPunkte"));

        tableID.setItems(overview);


        session1.getTransaction().commit();

        session1.close();

        System.out.println("Trying to close the connection to Levermann database...");
        try{
            con.close();
            System.out.println("Levermann database disconnected!");
        }catch(Exception e){
            System.err.println("Could not disconnect Leverman database...");
            System.err.println(e);
            throw new IllegalStateException("Failed disconnecting Levermann database!");
        }
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