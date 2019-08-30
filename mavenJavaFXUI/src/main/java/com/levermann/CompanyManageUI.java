package com.levermann;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;


public class CompanyManageUI {

    private final SimpleStringProperty kennzahlenfürAR;
    private final SimpleFloatProperty ergebnissefürAR;

    public CompanyManageUI(String keyFiguresRating, Float resultRating) {
        this.kennzahlenfürAR = new SimpleStringProperty(keyFiguresRating);
        this.ergebnissefürAR = new SimpleFloatProperty(resultRating);
    }

    public String getKennzahlenfürAR() {
        return kennzahlenfürAR.get();
    }

    public SimpleStringProperty kennzahlenfürARProperty() {
        return kennzahlenfürAR;
    }

    public void setKennzahlenfürAR(String kennzahlenfürAR) {
        this.kennzahlenfürAR.set(kennzahlenfürAR);
    }

    public float getErgebnissefürAR() {
        return ergebnissefürAR.get();
    }

    public SimpleFloatProperty ergebnissefürARProperty() {
        return ergebnissefürAR;
    }

    public void setErgebnissefürAR(float ergebnissefürAR) {
        this.ergebnissefürAR.set(ergebnissefürAR);
    }
}