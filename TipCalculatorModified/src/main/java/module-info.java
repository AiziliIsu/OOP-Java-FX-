module com.example.tipcalculatormodified {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.tipcalculatormodified to javafx.fxml;
    exports com.example.tipcalculatormodified;
}