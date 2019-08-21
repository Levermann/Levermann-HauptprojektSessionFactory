SELECT sum(
       Eigenkapitalrendite+
       EBITMarge+
       Eigenkapitalquote+
       KursGewinnVerhaeltnis+
       KursGewinnVerhaeltnisAktuell+
       Analystenmeinungen+
       ReaktionaufQuartalszahlen+
       Gewinnrevision+
       Kursverlauf6Monate+
       Kursverlauf12Monate+
       Kursmomentum+
       Dreimonatsreversal+
       Gewinnwachstum)
FROM analysisrating
GROUP BY ID;