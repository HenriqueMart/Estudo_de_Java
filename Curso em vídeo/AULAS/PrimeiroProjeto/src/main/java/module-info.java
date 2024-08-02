module com.mycompany.primeiroprojeto {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.primeiroprojeto to javafx.fxml;
    exports com.mycompany.primeiroprojeto;
}
