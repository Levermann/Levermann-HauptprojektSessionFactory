package com.levermann;

import com.levermann.DB.DBConnection;
import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.AnalysisSteps;
import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.log4j.Logger;
import org.hibernate.*;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.ResourceBundle;

public class CompanyOverviewController implements Initializable, ControlledScreenInterface {
    final static Logger logger = Logger.getLogger(com.levermann.CompanyOverviewController.class);
    private Connection con;
    @FXML
    private TextField companyNameDelete;
    @FXML
    private TableView<Company> tableID;
    @FXML
    private TableColumn<Company, String> companyName;
    @FXML
    private TableColumn<Company, String> creationDate;
    @FXML
    private TableColumn<Company, Float> analysisScore;
    @FXML
    private TableColumn<Company, Button> delete;



    private void ConnectionDB() {
        //TODO Die vom Benutzer eingegebenen Daten in die MySQL Datenbank schreiben
        //Load the jdbc diver
        System.out.println("Trying to load the JDBC driver...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded!");
        } catch (Exception e) {
            System.err.println("Cound not load JDBC driver...");
            System.err.println(e);
            throw new IllegalStateException("Failed loading the JDBC driver!");
        }

        //connect to the levermann database
        System.out.println("Trying to connect to Levermann database...");
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/levermann?useSSL=false&serverTimezone=UTC", "Levermann", "Levermann");
            System.out.println("Levermann database connected!");
        } catch (Exception e) {
            System.err.println("Could not connect to Leverman database...");
            System.err.println(e);
            throw new IllegalStateException("Failed connecting to Levermann database!");
        }
    }

    //TODO Füge hier SQL-Queries ein, die die jeweiligen Datensätze in die Table "Company" hinzufügen
    private void DisconnectionDB(){
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

    public void initCols(){

        ConnectionDB();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session1 = sessionFactory.getCurrentSession();

        session1.beginTransaction();
        /*
        Company company1 = (Company) session1.get(Company.class, 1L);
        company1.getGesamtPunkte();
        company1.getCompanyname();
        company1.getDatum();

         */
        Query query = session1.getNamedQuery("Company.findAll");
        List<Company> unList = (List<Company>) query.list();

        for (Company un : unList) {

            String nameforOverview = un.getCompanyname();
            String datumForOverview = un.getDatum();
            float SumScore = un.getGesamtPunkte();
            Button deletemach = new Button("delete");

            final ObservableList<Company> overview = FXCollections.observableArrayList(
                    new Company(nameforOverview, datumForOverview, SumScore, deletemach)
            );
            companyName.setCellValueFactory(new PropertyValueFactory<Company, String>("Companyname"));
            creationDate.setCellValueFactory(new PropertyValueFactory<Company, String>("datum"));
            analysisScore.setCellValueFactory(new PropertyValueFactory<Company, Float>("GesamtPunkte"));
            delete.setCellValueFactory(new PropertyValueFactory<Company, Button>("delete1"));

            tableID.getItems().addAll(overview);
        }
        DisconnectionDB();

        session1.getTransaction().commit();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initCols();
    }

    ScreensController myController;

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    //TODO Der Firmenname, der vom User in EnterCompanyName Seite eingegeben wurde muss ersetzt werden durch company1

    @FXML
    private void tableAktualisieren(){
        ConnectionDB();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session1 = sessionFactory.getCurrentSession();

        session1.beginTransaction();
        tableID.getItems().clear();

        Query query = session1.getNamedQuery("Company.findAll");
        List<Company> unList = (List<Company>) query.list();

        for (Company un : unList) {

            String nameforOverview = un.getCompanyname();
            String datumForOverview = un.getDatum();
            float SumScore = un.getGesamtPunkte();
            Button deletemach = new Button("delete");

            final ObservableList<Company> overview = FXCollections.observableArrayList(
                    new Company(nameforOverview, datumForOverview, SumScore, deletemach)
            );
            companyName.setCellValueFactory(new PropertyValueFactory<Company, String>("Companyname"));
            creationDate.setCellValueFactory(new PropertyValueFactory<Company, String>("datum"));
            analysisScore.setCellValueFactory(new PropertyValueFactory<Company, Float>("GesamtPunkte"));
            delete.setCellValueFactory(new PropertyValueFactory<Company, Button>("delete1"));

            tableID.getItems().addAll(overview);
        }


        session1.getTransaction().commit();
        DisconnectionDB();
    }

    @FXML
    private void takeStringandShowResult() throws IOException {
        //App.setRoot("enterCompanyName");
        myController.setScreen(App.showResultID);
        App.setStageTitle("Unternehmensnamen angeben");
    }
    @FXML
    private void switchToEnterCompanyName() throws IOException {
        //App.setRoot("enterCompanyName");
        clearInput();
        myController.setScreen(App.inputID);
        App.setStageTitle("Unternehmensnamen angeben");
    }

    private void clearInput(){
        InputController.unternehmennameDBTF.clear();
        InputController.jahresueberschussDBTF.clear();
        InputController.eigenkapitalDBTF.clear();
        InputController.datumDBTF.clear();
        InputController.gewinnschaetzungDBTF.clear();
        InputController.gewinnavgDBTF.clear();
        InputController.gewinnVor3JahrenDBTF.clear();
        InputController.gewinnVor2JahrenDBTF.clear();
        InputController.gewinnVor1JahrDBTF.clear();
        InputController.aktuellerErwarteterKursgewinnDBTF.clear();
        InputController.kursgewinnschaetzungNaechstesJahrDBTF.clear();
        InputController.jahresumsatzDBTF.clear();
        InputController.gewinnEBITDBTF.clear();
        InputController.fremdkapitalDBTF.clear();
        InputController.aktuellerAktienkursDBTF.clear();
        InputController.analystenKaufenDBTF.clear();
        InputController.analystenVerkaufenDBTF.clear();
        InputController.analystenHaltenDBTF.clear();
        InputController.kursanstiegUnternehmenDBTF.clear();
        InputController.kursanstiegAktienindexDBTF.clear();
        InputController.gewinnschaetzungVor4WochenDBTF.clear();
        InputController.aktuelleGewinnschaetzungDBTF.clear();
        InputController.aktienkursVor6MonatenDBTF.clear();
        InputController.aktienkursVor12MonatenDBTF.clear();
        InputController.kursVor1MonatDBTF.clear();
        InputController.kursVor2MonatenDBTF.clear();
        InputController.kursVor3MonatenDBTF.clear();
        InputController.aktienkursVor1MonatDBTF.clear();
        InputController.aktienkursVor2MonatenDBTF.clear();
        InputController.aktienkursVor3MonatenDBTF.clear();
        InputController.gewinnschaetzungNaechstesJahrDBTF.clear();
        InputController.gewinnschaetzungDiesesJahrDBTF.clear();
    }

    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        //App.setRoot("startPage");
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }

    @FXML
    private void deleteCompanyButtonController(ActionEvent actionEvent) throws IOException{

        String deleteName = companyNameDelete.getText();
        System.out.println("Trying to load the JDBC driver...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded!");
        } catch (Exception e) {
            System.err.println("Cound not load JDBC driver...");
            System.err.println(e);
            throw new IllegalStateException("Failed loading the JDBC driver!");
        }

        System.out.println("Trying to connect to Levermann database...");
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/levermann?useSSL=false&serverTimezone=UTC", "Levermann", "Levermann");
            System.out.println("Levermann database connected!");
        } catch (Exception e) {
            System.err.println("Could not connect to Leverman database...");
            System.err.println(e);
            throw new IllegalStateException("Failed connecting to Levermann database!");
        }

        //Aufrufen der aktuellen Session aus HibernateUtil
        final Session session = HibernateUtil.getSessionFactory().openSession();
        Query query7 = session.getNamedQuery("AnalysisRating.findAll");
        final List<AnalysisRating> analysisRatingsFilled = (List<AnalysisRating>) query7.list();

        try {
            Transaction tx = null;
            tx = session.beginTransaction();

            //HQL Named Query FindAll Unternehmen
            Query query = session.getNamedQuery("Company.findAll");
            List<Company> unList = (List<Company>) query.list();

            for (Company un : unList) {

                //todo Hier companyname setzen

                String companyUserInput = deleteName;

                //HQL Named Query FindAll Levermannschritte
                Query query1 = session.getNamedQuery("AnalysisSteps.findall");
                List<AnalysisSteps> unList1 = (List<AnalysisSteps>) query1.list();
                for (AnalysisSteps un1 : unList1) {
                    System.out.println("Analyse Liste = " + un1.getAnalysisStepsName()
                            + ","
                            + un1.getCompanyname_AnalysisSteps());

                    // Ausgabe eines Datensatzes mit Cid
                    query1 = session.getNamedQuery("AnalysisSteps.findByName");
                    query1.setString("Companyname_AnalysisSteps", companyUserInput);
                    //unList1 = query1.list();
                    System.out.println("fuck y");

                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", companyUserInput);
                            if (un.getCompanyname().equals(companyUserInput) && un2.getCompanyname_AnalysisRating().equals(companyUserInput) && un1.getCompanyname_AnalysisSteps().equals(companyUserInput)) {
                                //un2.setEigenkapitalrendite((float)0);

                                System.out.println("Das Unternehmen" + un.getCompanyname() + "wurde erfolgreich gelöscht");

                                session.delete(un1);
                                session.delete(un2);
                                session.delete(un);
                            }
                        }
                    }}

            session.getTransaction().commit();
            session.close();
            //    System.out.println("fuck youuuuuuuuuuuu" + un1.getEigenkapitalrendite()+ un1.getCompanyname_AnalysisSteps());
            System.out.println("Speichere Unternehmen...");
            System.out.println("Done!");
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception" + e.getMessage());
            session.getTransaction().rollback();
            throw new RuntimeException(e);
        } finally {
        }



        tableAktualisieren();

    }
}