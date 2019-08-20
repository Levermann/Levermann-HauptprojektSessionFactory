package com.levermann;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;




public class CompanyManageUI  {



    private final SimpleStringProperty company1;
    private final SimpleStringProperty dateFormat;
    private final SimpleIntegerProperty score1;
    private final SimpleStringProperty delete1;
    private final SimpleStringProperty edit1;
    private final SimpleStringProperty show1;

    public CompanyManageUI(String companyName, String creationDate, Integer analysisScore,
                           String delete, String  edit, String show) {
        this.company1 = new SimpleStringProperty(companyName);
        this.dateFormat = new SimpleStringProperty (creationDate);
        this.score1 = new SimpleIntegerProperty (analysisScore);
        this.delete1 = new SimpleStringProperty (delete);
        this.edit1 = new SimpleStringProperty(edit);
        this.show1 = new SimpleStringProperty(show);
    }



    public String getCompany1() {
        return company1.get();
    }

    public SimpleStringProperty company1Property() {
        return company1;
    }

    public void setCompany1(String company1) {
        this.company1.set(company1);
    }

    public SimpleStringProperty getDateFormat() {
        return dateFormat;
    }

    public int getScore1() {
        return score1.get();
    }

    public SimpleIntegerProperty score1Property() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1.set(score1);
    }

    public String getDelete1() {
        return delete1.get();
    }

    public SimpleStringProperty delete1Property() {
        return delete1;
    }

    public void setDelete1(String delete1) {
        this.delete1.set(delete1);
    }

    public String getEdit1() {
        return edit1.get();
    }

    public SimpleStringProperty edit1Property() {
        return edit1;
    }

    public void setEdit1(String edit1) {
        this.edit1.set(edit1);
    }

    public String getShow1() {
        return show1.get();
    }

    public SimpleStringProperty show1Property() {
        return show1;
    }

    public void setShow1(String show1) {
        this.show1.set(show1);
    }


}
