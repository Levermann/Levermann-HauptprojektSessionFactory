alter table levermannschritte1
    add constraint levermannschritte1_unternehmen1_name_fk
        foreign key (Name2) references unternehmen1 (name);

alter table punkteliste1
    add constraint punkteliste1_unternehmen1_name_fk
        foreign key (Name2) references unternehmen1 (name);