package com.levermann.mainMethod;

import com.levermann.keyFiguresForAnalysis.Eigenkapitalrendite;
import org.apache.log4j.BasicConfigurator;


abstract public class MainClass {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

     BasicConfigurator.configure();



     Eigenkapitalrendite anm = new Eigenkapitalrendite();

     anm.CalculateEigenkapitalrendite();


/*
        Kursmomentum km = new Kursmomentum();

     km.Kursmomentum();

 */


 }
}