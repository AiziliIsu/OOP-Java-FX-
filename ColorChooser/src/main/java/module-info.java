module com.example.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.colorchooser to javafx.fxml;
    exports com.example.colorchooser;
}