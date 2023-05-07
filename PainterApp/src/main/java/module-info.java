module com.example.painterapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.painterapp to javafx.fxml;
    exports com.example.painterapp;
}