module com.example.targetheartratecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.targetheartratecalculator to javafx.fxml;
    exports com.example.targetheartratecalculator;
}