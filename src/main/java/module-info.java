module com.dukiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dukiapp to javafx.fxml;
    exports com.dukiapp;
}
