create schema levermann;
create table company(
                            Companyname varchar (11) not null ,
                             id float (20)  unique ,
                             datum float(11),
                             eigenkapital float(11),
                             jahresueberschuss float(11),
                             GewinnEBIT float (11),
                             Jahresumsatz float (11),
                             Fremdkapital float (11),
                             AktuellerAktienkurs float (11),
                             Gewinnschaezung float (11),
                             GewinnAVG float (11),
                             Halten float (11),
                             Verkaufen float (11),
                             Kaufen float (11),
                             KursanstiegUnternehmen float (11),
                             KursanstiegIndex float (11),
                             GewinnschaezungVor4Wochen float (11),
                             AktienkursTagVeroeffentlichungQartalszahlen float (11),
                             KursVor6Monaten float (11),
                             KursVor12Monaten float (11),
                             KursVor3Monaten float (11),
                             KursVor2Monaten float (11),
                             KursVor1Monat float (11),
                             DaxVor1Monat float (11),
                             DaxVor2Monaten float (11),
                             DaxVor3Monaten float (11),
                             GewinnschaezungNaechstesJahr float (11),
                             GewinnschaezungDiesesJahr float (11),
                             Finanzsektor float (11),
                             PerfInJedemMonat float (11),
                             KursgewinnVor3Jahren float (11),
                             KursgewinnVor2Jahren float (11),
                             KursgewinnVor1Jahr float (11),
                             AktuellenErwartetenKursgewinn float (11),
                             KursgewinnschaezungNaechstesJahr float (11),
                              PRIMARY KEY (Companyname)

);

create table AnalysisSteps(

                              AnalysisStepsName	varchar(20) not null unique,
                            id float (20)  unique ,
                              Companyname_AnalysisSteps varchar (20) not null ,
                             Eigenkapitalrendite float(11),
                             EBITMarge float(11),
                             Eigenkapitalquote float(11),
                             KursGewinnVerhaeltnis float(11),
                             KursGewinnVerhaeltnisAktuell float(11),
                             Analystenmeinungen float(11),
                             ReaktionaufQuartalszahlen float(11),
                             Gewinnrevision float(11),
                             Kursverlauf6Monate float(11),
                             Kursverlauf12Monate float(11),
                             Kursmomentum float(11),
                             Dreimonatsreversal float(11),
                             Gewinnwachstum float(11),
                             PRIMARY KEY (AnalysisStepsName)

);

create table AnalysisRating(

                               AnalysisRatingName	varchar(20) not null unique,
                                 id float (20)  unique ,
                               Companyname_AnalysisRating varchar (20) not null ,
                                  Eigenkapitalrendite float(11),
                                  EBITMarge float(11),
                                  Eigenkapitalquote float(11),
                                  KursGewinnVerhaeltnis float(11),
                                  KursGewinnVerhaeltnisAktuell float(11),
                                  Analystenmeinungen float(11),
                                  ReaktionaufQuartalszahlen float(11),
                                  Gewinnrevision float(11),
                                  Kursverlauf6Monate float(11),
                                  Kursverlauf12Monate float(11),
                                  Kursmomentum float(11),
                                  Dreimonatsreversal float(11),
                                  Gewinnwachstum float(11),
                                  PRIMARY KEY (AnalysisRatingName)

);

