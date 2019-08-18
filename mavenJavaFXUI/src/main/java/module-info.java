module com.levermann {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.levermann to javafx.fxml;
    exports com.levermann;
}