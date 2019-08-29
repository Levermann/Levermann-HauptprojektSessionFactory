package com.levermann;

import com.levermann.entityclass.Company;
import javafx.scene.control.Button;
import org.hibernate.Session;

import static com.levermann.sessionControlClasses.HibernateUtil.getSessionFactory;


public class CompanyManageUI  {

    private String company1;
    private String dateFormat;
    private int score1;
    private Button delete1;
    private Button edit1;
    private Button show1;


    public CompanyManageUI(String company1, String dateFormat, int score1,
                           Button delete1, Button  edit1, Button show1) {
        this.company1 = company1;
        this.dateFormat = dateFormat;
        this.score1 = score1;
        this.delete1 = new Button("deleteIt");
        delete1.setOnAction(event -> {
            Company company = new Company();
            Session session1 = getSessionFactory().openSession();
            session1.delete(company);
            session1.getTransaction().commit();
            //TODO eventuell hier noch die Methodenaufrufe für die Berechnungen bevor die Session closed
            session1.close();
        });
        this.edit1 = new Button("editIt");
        this.show1 = new Button("showIt");
    }


    public String getCompany1() {
        return company1;
    }

    public void setCompany1(String company1) {
        this.company1 = company1;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public Button getDelete1() {
        return delete1;
    }

    public void setDelete1(Button delete1) {
        this.delete1 = delete1;
    }

    public Button getEdit1() {
        return edit1;
    }

    public void setEdit1(Button edit1) {
        this.edit1 = edit1;
    }

    public Button getShow1() {
        return show1;
    }

    public void setShow1(Button show1) {
        this.show1 = show1;
    }
}