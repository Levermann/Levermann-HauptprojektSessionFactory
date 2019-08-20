package com.levermann;

import javafx.beans.binding.ObjectExpression;
import javafx.beans.property.ReadOnlyProperty;
import javafx.beans.property.SimpleBooleanProperty;
import java.time.LocalDate;


public abstract class CompanyManageUI extends ObjectExpression implements ReadOnlyProperty {
    public CompanyManageUI() {
    }
    //ReadOnlyPropertie for AnalysisSteps
    Object company = this.getBean();
    String analysisID = this.getName();



    public SimpleBooleanProperty name, id;
    private LocalDate creationDate;





}
