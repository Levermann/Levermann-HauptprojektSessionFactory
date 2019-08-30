
INSERT INTO company (Companyname,datum,eigenkapital,jahresueberschuss,GewinnEBIT,Jahresumsatz,Fremdkapital,AktuellerAktienkurs,Gewinnschaezung,GewinnAVG,Halten,Verkaufen,Kaufen,KursanstiegUnternehmen,KursanstiegIndex,GewinnschaezungVor4Wochen,AktienkursTagVeroeffentlichungQartalszahlen,KursVor6Monaten,KursVor12Monaten,KursVor3Monaten,KursVor2Monaten,KursVor1Monat,DaxVor1Monat,DaxVor2Monaten,DaxVor3Monaten,GewinnschaezungNaechstesJahr,GewinnschaezungDiesesJahr,Finanzsektor,PerfInJedemMonat,KursgewinnVor3Jahren,KursgewinnVor2Jahren,KursgewinnVor1Jahr,AktuellenErwartetenKursgewinn,KursgewinnschaezungNaechstesJahr)
VALUES ('Audi','01.01.2018','247500.0','515900.23','150000.0','75020.2','250000.41','45.2','81234.0','60740.0','20.0','5.0','15.0','5.0','8.0','75000.0','43.1','40.0','38.5','41.0','42.0','44.0','13500.0','13300.0','13100.0','15000.0','40000.0','1.0','1.0','5.0','2.3','2.5','2.7','3.0');

INSERT INTO analysisrating (AnalysisRatingName, Companyname_Analysisrating)
VALUES ('Test1',
        (SELECT Companyname
         FROM company
         WHERE Companyname ='Audi'));

INSERT INTO analysissteps (AnalysisStepsName, Companyname_AnalysisSteps)
VALUES ('Test2',
        (SELECT Companyname
         FROM company
         WHERE Companyname ='Audi'));


INSERT INTO company (Companyname,datum,eigenkapital,jahresueberschuss,GewinnEBIT,Jahresumsatz,Fremdkapital,AktuellerAktienkurs,Gewinnschaezung,GewinnAVG,Halten,Verkaufen,Kaufen,KursanstiegUnternehmen,KursanstiegIndex,GewinnschaezungVor4Wochen,AktienkursTagVeroeffentlichungQartalszahlen,KursVor6Monaten,KursVor12Monaten,KursVor3Monaten,KursVor2Monaten,KursVor1Monat,DaxVor1Monat,DaxVor2Monaten,DaxVor3Monaten,GewinnschaezungNaechstesJahr,GewinnschaezungDiesesJahr,Finanzsektor,PerfInJedemMonat,KursgewinnVor3Jahren,KursgewinnVor2Jahren,KursgewinnVor1Jahr,AktuellenErwartetenKursgewinn,KursgewinnschaezungNaechstesJahr)
VALUES ('Continental','01.03.2018','300123.0','543210.0','150000.0','75000.0','250000.0','45.2','80000.0','60000.0','20.0','30.0','45.0','5.0','8.0','75000.0','43.1','40.0','38.5','41.0','42.0','44.0','13500.0','13300.0','13100.0','25000.0','30000.0','1.0','1.0','5.0','1.3','0.8','2.7','3.0');

INSERT INTO analysisrating (AnalysisRatingName, Companyname_Analysisrating)
VALUES ('Test3',
        (SELECT Companyname
         FROM company
         WHERE Companyname ='Continental'));

INSERT INTO analysissteps (AnalysisStepsName, Companyname_AnalysisSteps)
VALUES ('Test4',
        (SELECT Companyname
         FROM company
         WHERE Companyname ='Continental'));

INSERT INTO company (Companyname,datum,eigenkapital,jahresueberschuss,GewinnEBIT,Jahresumsatz,Fremdkapital,AktuellerAktienkurs,Gewinnschaezung,GewinnAVG,Halten,Verkaufen,Kaufen,KursanstiegUnternehmen,KursanstiegIndex,GewinnschaezungVor4Wochen,AktienkursTagVeroeffentlichungQartalszahlen,KursVor6Monaten,KursVor12Monaten,KursVor3Monaten,KursVor2Monaten,KursVor1Monat,DaxVor1Monat,DaxVor2Monaten,DaxVor3Monaten,GewinnschaezungNaechstesJahr,GewinnschaezungDiesesJahr,Finanzsektor,PerfInJedemMonat,KursgewinnVor3Jahren,KursgewinnVor2Jahren,KursgewinnVor1Jahr,AktuellenErwartetenKursgewinn,KursgewinnschaezungNaechstesJahr)
VALUES ('Daimler','01.07.2019','250000.0','500000.0','155000.0','70000.0','280000.0','78.3','10000.0','40000.0','50.0','21.0','5.0','7.0','3.0','95750.0','75','70.0','69','70','65','72','13500.0','13300.0','13100.0','55000.0','50000.0','1.0','1.0','5.0','-5.0','-1.0','2.7','3.0');

INSERT INTO analysisrating (AnalysisRatingName, Companyname_Analysisrating)
VALUES ('Test5',
        (SELECT Companyname
         FROM company
         WHERE Companyname ='Daimler'));

INSERT INTO analysissteps (AnalysisStepsName, Companyname_AnalysisSteps)
VALUES ('Test6',
        (SELECT Companyname
         FROM company
         WHERE Companyname ='Daimler'));