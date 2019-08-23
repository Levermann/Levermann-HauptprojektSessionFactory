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
                   Gewinnwachstum) AS "gesamtpunkte"
FROM analysisrating, company
WHERE company.id = analysisrating.id