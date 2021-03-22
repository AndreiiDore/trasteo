module com.mycompany.trasteo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.trasteo to javafx.fxml;
    exports com.mycompany.trasteo;
}
