package com.levermann;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

public class ShowUserInputManageUI {


    private final SimpleStringProperty inputFigure1;
    private final SimpleStringProperty inputValue1;

    public ShowUserInputManageUI(String userInputFigures, String userInputValues) {
        this.inputFigure1 = new SimpleStringProperty(userInputFigures);
        this.inputValue1 = new SimpleStringProperty(userInputValues);
    }

    public String getInputFigure1() {
        return inputFigure1.get();
    }

    public SimpleStringProperty inputFigure1Property() {
        return inputFigure1;
    }

    public String getInputValue1() {
        return inputValue1.get();
    }

    public SimpleStringProperty inputValue1Property() {
        return inputValue1;
    }
    public void setInputFigure1(String inputFigure1) {
        this.inputFigure1.set(inputFigure1);
    }

    public void setInputValue1(String inputValue1) {
        this.inputValue1.set(inputValue1);
    }
}
