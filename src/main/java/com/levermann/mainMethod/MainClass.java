package com.levermann.mainMethod;

import com.levermann.keyFiguresForAnalysis.Dreimonatsreversal;
import com.levermann.keyFiguresForAnalysis.Kursmomentum;
import com.levermann.keyFiguresForAnalysisOld.Analystenmeinungen;
import com.levermann.keyFiguresForAnalysisOld.Eigenkapitalrendite;
import com.levermann.keyFiguresForAnalysisOld.Gewinnrevision;
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