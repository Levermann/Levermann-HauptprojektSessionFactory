package com.levermann.mainMethod;

import com.levermann.sessionControlClasses.CalculateUserInput;
import org.apache.log4j.BasicConfigurator;

public class DoCalculation {
    public static void main(String[] args) {

        BasicConfigurator.configure();

        CalculateUserInput xyz = new CalculateUserInput();
        xyz.CalculateEigenkapitalrendite();
    }
}