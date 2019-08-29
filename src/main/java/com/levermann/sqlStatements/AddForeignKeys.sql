alter table AnalysisRating
    add constraint AnalysisRating_company_name_fk
        foreign key (Companyname_AnalysisRating) references company (Companyname);

alter table analysissteps
    add constraint AnalysisSteps_company_name_fk
        foreign key (Companyname_AnalysisSteps) references company (Companyname);

ALTER TABLE `analysisrating` CHANGE `id` `id` FLOAT NULL DEFAULT NULL AUTO_INCREMENT;

ALTER TABLE `analysissteps` CHANGE `id` `id` FLOAT NULL DEFAULT NULL AUTO_INCREMENT;

ALTER TABLE `company` CHANGE `id` `id` FLOAT NULL DEFAULT NULL AUTO_INCREMENT;