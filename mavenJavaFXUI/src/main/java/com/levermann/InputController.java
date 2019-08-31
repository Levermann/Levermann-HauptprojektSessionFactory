package com.levermann;

import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.AnalysisSteps;
import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.CalculateUserInput;
import com.levermann.sessionControlClasses.HibernateUtil;
import com.levermann.utilHandling.CompanyG;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.ResourceBundle;
/**
 * this Controller creates a input screen and ask the user for vor values witch will be needed in table Company
 */
public class InputController implements Initializable, ControlledScreenInterface {

    public static TextField unternehmennameDBTF;
    public static TextField jahresueberschussDBTF;
    public static TextField eigenkapitalDBTF;
    public static TextField datumDBTF;
    public static TextField gewinnschaetzungDBTF;
    public static TextField gewinnavgDBTF;
    public static TextField gewinnVor3JahrenDBTF;
    public static TextField gewinnVor2JahrenDBTF;
    public static TextField gewinnVor1JahrDBTF;
    public static TextField aktuellerErwarteterKursgewinnDBTF;
    public static TextField kursgewinnschaetzungNaechstesJahrDBTF;
    public static TextField jahresumsatzDBTF;
    public static TextField gewinnEBITDBTF;
    public static TextField fremdkapitalDBTF;
    public static TextField aktuellerAktienkursDBTF;
    public static TextField analystenKaufenDBTF;
    public static TextField analystenVerkaufenDBTF;
    public static TextField analystenHaltenDBTF;
    public static TextField kursanstiegUnternehmenDBTF;
    public static TextField kursanstiegAktienindexDBTF;
    public static TextField gewinnschaetzungVor4WochenDBTF;
    public static TextField aktuelleGewinnschaetzungDBTF;
    public static TextField aktienkursVor6MonatenDBTF;
    public static TextField aktienkursVor12MonatenDBTF;
    public static TextField kursVor1MonatDBTF;
    public static TextField kursVor2MonatenDBTF;
    public static TextField kursVor3MonatenDBTF;
    public static TextField aktienkursVor1MonatDBTF;
    public static TextField aktienkursVor2MonatenDBTF;
    public static TextField aktienkursVor3MonatenDBTF;
    public static TextField gewinnschaetzungNaechstesJahrDBTF;
    public static TextField gewinnschaetzungDiesesJahrDBTF;

    @FXML
    public TextField unternehmennameDB;
    @FXML
    public TextField jahresueberschussDB;
    @FXML
    public TextField eigenkapitalDB;
    @FXML
    public TextField datumDB;
    @FXML
    public TextField gewinnschaetzungDB;
    @FXML
    public TextField gewinnavgDB;
    @FXML
    public TextField gewinnVor3JahrenDB;
    @FXML
    public TextField gewinnVor2JahrenDB;
    @FXML
    public TextField gewinnVor1JahrDB;
    @FXML
    public TextField aktuellerErwarteterKursgewinnDB;
    @FXML
    public TextField kursgewinnschaetzungNaechstesJahrDB;
    @FXML
    public TextField jahresumsatzDB;
    @FXML
    private TextField gewinnEBITDB;
    @FXML
    private TextField fremdkapitalDB;
    @FXML
    private TextField aktuellerAktienkursDB;
    @FXML
    private TextField analystenKaufenDB;
    @FXML
    private TextField analystenVerkaufenDB;
    @FXML
    private TextField analystenHaltenDB;
    @FXML
    private TextField kursanstiegUnternehmenDB;
    @FXML
    private TextField kursanstiegAktienindexDB;
    @FXML
    private TextField gewinnschaetzungVor4WochenDB;
    @FXML
    private TextField aktuelleGewinnschaetzungDB;
    @FXML
    private TextField aktienkursVor6MonatenDB;
    @FXML
    private TextField aktienkursVor12MonatenDB;
    @FXML
    private TextField kursVor1MonatDB;
    @FXML
    private TextField kursVor2MonatenDB;
    @FXML
    private TextField kursVor3MonatenDB;
    @FXML
    private TextField aktienkursVor1MonatDB;
    @FXML
    private TextField aktienkursVor2MonatenDB;
    @FXML
    private TextField aktienkursVor3MonatenDB;
    @FXML
    private TextField gewinnschaetzungNaechstesJahrDB;
    @FXML
    private TextField gewinnschaetzungDiesesJahrDB;
    @FXML
    private CheckBox finanzwerteDB;

    ScreensController myController;
    private Connection con;

    public ObservableList<Company> addtoDB = FXCollections.observableArrayList(
            new Company()
    );
    public ObservableList<AnalysisRating> addtoDBAnalysisRating = FXCollections.observableArrayList(
            new AnalysisRating()
    );
    public ObservableList<AnalysisSteps> addtoDBAnalysisSteps = FXCollections.observableArrayList(
            new AnalysisSteps()
    );
    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }


    private void comparingInputwithTables(){
        ShowResultController.Companyname1 = unternehmennameDB.getText();
    }
    private void takeOverUserInput(){
        ShowUserInputController.eigenkapital = Float.parseFloat(eigenkapitalDB.getText());
        ShowUserInputController.jahresueberschuss = Float.parseFloat(jahresueberschussDB.getText());
        ShowUserInputController.gewinnEBIT = Float.parseFloat(gewinnEBITDB.getText());
        ShowUserInputController.fremdkapital = Float.parseFloat(fremdkapitalDB.getText());
        ShowUserInputController.aktuellerAktienkurs = Float.parseFloat(aktuellerAktienkursDB.getText());
        ShowUserInputController.kaufen = Float.parseFloat(analystenKaufenDB.getText());
        ShowUserInputController.verkaufen = Float.parseFloat(analystenVerkaufenDB.getText());
        ShowUserInputController.halten = Float.parseFloat(analystenHaltenDB.getText());
        ShowUserInputController.kursAnstiegUnternehmen = Float.parseFloat(kursanstiegUnternehmenDB.getText());
        ShowUserInputController.kursAnstiegAktienindex = Float.parseFloat(kursanstiegAktienindexDB.getText());
        ShowUserInputController.gewinnschaetzungVor4Wochen = Float.parseFloat(gewinnschaetzungVor4WochenDB.getText());
        ShowUserInputController.aktuelleGewinnschaetzung = Float.parseFloat(aktuelleGewinnschaetzungDB.getText());
        ShowUserInputController.aktienkursVor6Monaten = Float.parseFloat(aktienkursVor6MonatenDB.getText());
        ShowUserInputController.aktienkursVor12Monaten = Float.parseFloat(aktienkursVor12MonatenDB.getText());
        ShowUserInputController.aktuellerErwarteterKursgewinn = Float.parseFloat(aktuellerErwarteterKursgewinnDB.getText());
        ShowUserInputController.kursVor1Monat = Float.parseFloat(kursVor1MonatDB.getText());
        ShowUserInputController.kursVor2Monaten = Float.parseFloat(kursVor2MonatenDB.getText());
        ShowUserInputController.kursVor3Monaten = Float.parseFloat(kursVor3MonatenDB.getText());
        ShowUserInputController.aktienkursVor1Monaten = Float.parseFloat(aktienkursVor1MonatDB.getText());
        ShowUserInputController.aktienkursVor2Monaten = Float.parseFloat(aktienkursVor2MonatenDB.getText());
        ShowUserInputController.aktienkursVor3Monaten = Float.parseFloat(aktienkursVor3MonatenDB.getText());
        ShowUserInputController.gewinnschaetzungFuerNaechstesJahr = Float.parseFloat(gewinnschaetzungNaechstesJahrDB.getText());
        ShowUserInputController.gewinnschaetzungFuerDiesesJahr = Float.parseFloat(gewinnschaetzungDiesesJahrDB.getText());
        ShowUserInputController.gewinnVor1Jahr = Float.parseFloat(gewinnVor1JahrDB.getText());
        ShowUserInputController.jahresumsatz = Float.parseFloat(jahresumsatzDB.getText());
        ShowUserInputController.gewinnschaetzung = Float.parseFloat(gewinnschaetzungDB.getText());
        ShowUserInputController.gewinnAVG = Float.parseFloat(gewinnavgDB.getText());
        ShowUserInputController.GewinnVor3Jahren = Float.parseFloat(gewinnVor3JahrenDB.getText());
        ShowUserInputController.GewinnVor2Jahren = Float.parseFloat(gewinnVor2JahrenDB.getText());
        ShowUserInputController.kursgewinnschaetzungNaechstesJahr = Float.parseFloat(kursgewinnschaetzungNaechstesJahrDB.getText());
    }

    @FXML
        public void insertInputToDb (ActionEvent event){

            String companyname = unternehmennameDB.getText();
            String datum = datumDB.getText();
            float eigenkapital = Float.parseFloat(eigenkapitalDB.getText());
            float jahresueberschuss = Float.parseFloat(jahresueberschussDB.getText());
            float gewinnEBIT = Float.parseFloat(gewinnEBITDB.getText());
            float jahresumsatz = Float.parseFloat(jahresumsatzDB.getText());
            float fremdkapital = Float.parseFloat(fremdkapitalDB.getText());
            float aktuellerAktienkurs = Float.parseFloat(aktuellerAktienkursDB.getText());
            float gewinnschaezung = Float.parseFloat(aktuelleGewinnschaetzungDB.getText());
            float gewinnAVG = Float.parseFloat(gewinnavgDB.getText());
            float halten = Float.parseFloat(analystenHaltenDB.getText());
            float verkaufen = Float.parseFloat(analystenVerkaufenDB.getText());
            float kaufen = Float.parseFloat(analystenKaufenDB.getText());
            float kursanstiegUnternehmen = Float.parseFloat(kursanstiegUnternehmenDB.getText());
            float kursanstiegIndex = Float.parseFloat(kursanstiegAktienindexDB.getText());
            float gewinnschaezungVor4Wochen = Float.parseFloat(gewinnEBITDB.getText());
            float aktienkursTagVeroeffentlichungQartalszahlen = Float.parseFloat(gewinnEBITDB.getText());
            float kursVor6Monaten = Float.parseFloat(aktienkursVor6MonatenDB.getText());
            float kursVor12Monaten = Float.parseFloat(aktienkursVor12MonatenDB.getText());
            float kursVor3Monaten = Float.parseFloat(kursVor3MonatenDB.getText());
            float kursVor2Monaten = Float.parseFloat(kursVor2MonatenDB.getText());
            float kursVor1Monat = Float.parseFloat(kursVor1MonatDB.getText());
            float daxVor1Monat = Float.parseFloat(aktienkursVor1MonatDB.getText());
            float daxVor2Monaten = Float.parseFloat(aktienkursVor2MonatenDB.getText());
            float daxVor3Monaten = Float.parseFloat(aktienkursVor3MonatenDB.getText());
            float gewinnschaezungDiesesJahr = Float.parseFloat(gewinnschaetzungDiesesJahrDB.getText());
            float gewinnschaezungNaechstesJahr = Float.parseFloat(gewinnschaetzungNaechstesJahrDB.getText());
            float finanzsektor = 0;
            int kursgewinnVor3Jahren = Integer.parseInt(gewinnVor3JahrenDB.getText());
            int kursgewinnVor2Jahren = Integer.parseInt(gewinnVor2JahrenDB.getText());
            int kursgewinnVor1Jahr = Integer.parseInt(gewinnVor1JahrDB.getText());
            int aktuellenErwartetenKursgewinn = Integer.parseInt(aktuellerErwarteterKursgewinnDB.getText());
            int kursgewinnschaezungNaechstesJahr = Integer.parseInt(kursgewinnschaetzungNaechstesJahrDB.getText());

            Company wxyz = new Company(companyname,  datum,  eigenkapital,  jahresueberschuss,  gewinnEBIT,
             jahresumsatz,  fremdkapital,  aktuellerAktienkurs,  gewinnschaezung,
             gewinnAVG,  halten,  verkaufen,  kaufen,  kursanstiegUnternehmen,
             kursanstiegIndex,  gewinnschaezungVor4Wochen,
             aktienkursTagVeroeffentlichungQartalszahlen,  kursVor6Monaten,  kursVor12Monaten,
             kursVor3Monaten,  kursVor2Monaten,  kursVor1Monat,  daxVor1Monat,
             daxVor2Monaten,  daxVor3Monaten,  gewinnschaezungNaechstesJahr,
             gewinnschaezungDiesesJahr,  finanzsektor,
                     kursgewinnVor3Jahren,  kursgewinnVor2Jahren,  kursgewinnVor1Jahr,
                     aktuellenErwartetenKursgewinn,  kursgewinnschaezungNaechstesJahr);

            String Analysisratingname = unternehmennameDB.getText() + "analyse";
            String companyname_AnalysisRating = unternehmennameDB.getText();

            AnalysisRating analysisRating = new AnalysisRating(Analysisratingname, companyname_AnalysisRating);

            String analysisstepsname = unternehmennameDB.getText() + "analyse";
            String companyname_AnalysisSteps = unternehmennameDB.getText();

            AnalysisSteps analysisSteps = new AnalysisSteps(analysisstepsname, companyname_AnalysisSteps);

            addtoDB.add(wxyz);
            addtoDBAnalysisRating.add(analysisRating);
            addtoDBAnalysisSteps.add(analysisSteps);

            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session1 = sessionFactory.getCurrentSession();

            session1.beginTransaction();

            CompanyG companyG = new CompanyG();
            companyG.setSession(session1);

            companyG.makePersistent(wxyz);
            session1.save(wxyz);
            session1.save(analysisRating);
            session1.save(analysisSteps);
            session1.getTransaction().commit();
            CalculateUserInput xyz = new CalculateUserInput();
            xyz.CalculateEigenkapitalrendite();

            session1.close();
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        unternehmennameDBTF = unternehmennameDB;
        jahresueberschussDBTF = jahresueberschussDB;
        eigenkapitalDBTF = eigenkapitalDB;
        datumDBTF = datumDB;
        gewinnschaetzungDBTF = gewinnschaetzungDB;
        gewinnavgDBTF = gewinnavgDB;
        gewinnVor3JahrenDBTF = gewinnVor3JahrenDB;
        gewinnVor2JahrenDBTF = gewinnVor2JahrenDB;
        gewinnVor1JahrDBTF = gewinnVor1JahrDB;
        aktuellerErwarteterKursgewinnDBTF = aktuellerErwarteterKursgewinnDB;
        kursgewinnschaetzungNaechstesJahrDBTF = kursgewinnschaetzungNaechstesJahrDB;
        jahresumsatzDBTF = jahresumsatzDB;
        gewinnEBITDBTF = gewinnEBITDB;
        fremdkapitalDBTF = fremdkapitalDB;
        aktuellerAktienkursDBTF = aktuellerAktienkursDB;
        analystenKaufenDBTF=analystenKaufenDB;
        analystenVerkaufenDBTF = analystenVerkaufenDB;
        analystenHaltenDBTF = analystenHaltenDB;
        kursanstiegUnternehmenDBTF = kursanstiegUnternehmenDB;
        kursanstiegAktienindexDBTF =kursanstiegAktienindexDB;
        gewinnschaetzungVor4WochenDBTF=gewinnschaetzungVor4WochenDB;
        aktuelleGewinnschaetzungDBTF = aktuelleGewinnschaetzungDB;
        aktienkursVor6MonatenDBTF = aktienkursVor6MonatenDB;
        aktienkursVor12MonatenDBTF = aktienkursVor12MonatenDB;
        kursVor1MonatDBTF = kursVor1MonatDB;
        kursVor2MonatenDBTF = kursVor2MonatenDB;
        kursVor3MonatenDBTF = kursVor3MonatenDB;
        aktienkursVor1MonatDBTF = aktienkursVor1MonatDB;
        aktienkursVor2MonatenDBTF = aktienkursVor2MonatenDB;
        aktienkursVor3MonatenDBTF = aktienkursVor3MonatenDB;
        gewinnschaetzungNaechstesJahrDBTF=gewinnschaetzungNaechstesJahrDB;
        gewinnschaetzungDiesesJahrDBTF =gewinnschaetzungDiesesJahrDB;
    }
    @FXML
    private void switchToShowResult() throws IOException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session1 = sessionFactory.getCurrentSession();

        ShowResultController.Companyname2 = CompanyOverviewController.companyNameDeletestatic.getText();

        session1.beginTransaction();
        CompanyOverviewController.tableIDstatic.getItems().clear();

        Query query = session1.getNamedQuery("Company.findAll");
        List<Company> unList = (List<Company>) query.list();

        for (Company un : unList) {

            String nameforOverview = un.getCompanyname();
            String datumForOverview = un.getDatum();
            float SumScore = un.getGesamtPunkte();

            final ObservableList<Company> overview = FXCollections.observableArrayList(
                    new Company(nameforOverview, datumForOverview, SumScore)
            );
            CompanyOverviewController.companyNamestatic.setCellValueFactory(new PropertyValueFactory<Company, String>("Companyname"));
            CompanyOverviewController.creationDatestatic.setCellValueFactory(new PropertyValueFactory<Company, String>("datum"));
            CompanyOverviewController.analysisScorestatic.setCellValueFactory(new PropertyValueFactory<Company, Float>("GesamtPunkte"));

            CompanyOverviewController.tableIDstatic.getItems().addAll(overview);
        }
        /**
         * saves the transaction within the commit
         */
        session1.getTransaction().commit();

        takeOverUserInput();
        myController.setScreen(App.companyOverviewID);
        App.setStageTitle("Allgemeine Unternehmensübersicht");
        /*comparingInputwithTables();
        takeOverUserInput();
        myController.setScreen(App.showResultID);
        App.setStageTitle("Unternehmensergebnisse");*/
    }
    @FXML
    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        //TODO Schließe die Session, zurück zu Startseite
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }
}

