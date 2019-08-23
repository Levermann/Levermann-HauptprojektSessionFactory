alter table AnalysisRating
    add constraint AnalysisRating_unternehmen_name_fk
        foreign key (Companyname_AnalysisRating) references company (Companyname);

alter table AnalysisSteps
    add constraint punkteliste_unternehmen_name_fk
        foreign key (Companyname_AnalysisSteps) references company (Companyname);

ALTER TABLE `analysisrating` CHANGE `id` `id` FLOAT NULL DEFAULT NULL AUTO_INCREMENT;

ALTER TABLE `analysissteps` CHANGE `id` `id` FLOAT NULL DEFAULT NULL AUTO_INCREMENT;

ALTER TABLE `company` CHANGE `id` `id` FLOAT NULL DEFAULT NULL AUTO_INCREMENT;