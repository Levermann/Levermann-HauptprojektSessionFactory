
create table Punkteliste(

                             PunktelisteName	varchar(20) not null unique,
                             Name2 varchar (20) not null ,
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
                             PRIMARY KEY (Pid)

);
