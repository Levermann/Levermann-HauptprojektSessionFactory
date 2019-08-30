package com.levermann;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

public class AnalysisStepsManageUI {
    private final SimpleStringProperty kennzahlenfürAS;
    private final SimpleFloatProperty ergebnissefürAS;

    public AnalysisStepsManageUI(String keyFiguresSteps, Float resultSteps) {
        this.kennzahlenfürAS = new SimpleStringProperty(keyFiguresSteps);
        this.ergebnissefürAS = new SimpleFloatProperty(resultSteps);
    }

    public String getKennzahlenfürAS() {
        return kennzahlenfürAS.get();
    }

    public SimpleStringProperty kennzahlenfürASProperty() {
        return kennzahlenfürAS;
    }

    public void setKennzahlenfürAS(String kennzahlenfürAS) {
        this.kennzahlenfürAS.set(kennzahlenfürAS);
    }

    public float getErgebnissefürAS() {
        return ergebnissefürAS.get();
    }

    public SimpleFloatProperty ergebnissefürASProperty() {
        return ergebnissefürAS;
    }

    public void setErgebnissefürAS(float ergebnissefürAS) {
        this.ergebnissefürAS.set(ergebnissefürAS);
    }
}
