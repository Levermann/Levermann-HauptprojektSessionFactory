alter table levermanschritte
    add constraint levermanschritte_unternehmen_name_fk
        foreign key (Name2) references unternehmen (name);

alter table punkteliste
    add constraint punkteliste_unternehmen_name_fk
        foreign key (Name2) references unternehmen (name);