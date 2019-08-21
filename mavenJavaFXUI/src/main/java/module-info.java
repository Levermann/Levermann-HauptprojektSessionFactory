module com.levermann {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.levermann to javafx.fxml;
    exports com.levermann;
}