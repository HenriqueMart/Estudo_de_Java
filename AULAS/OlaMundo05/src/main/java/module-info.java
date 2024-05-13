module com.mycompany.olamundo05 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.olamundo05 to javafx.fxml;
    exports com.mycompany.olamundo05;
}
