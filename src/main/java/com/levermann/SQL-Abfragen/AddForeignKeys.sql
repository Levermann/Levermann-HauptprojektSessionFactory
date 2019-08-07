alter table levermannschritte
    add constraint levermannschritte_unternehmen_name_fk
        foreign key (Unternehmenname_Levermannschritte) references unternehmen (UnternehmennameId);

alter table punkteliste
    add constraint punkteliste_unternehmen_name_fk
        foreign key (Unternehmenname_Punkteliste) references unternehmen (UnternehmennameId);