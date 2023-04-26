module com.example.tipcalculatorenhanced {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.tipcalculatorenhanced to javafx.fxml;
    exports com.example.tipcalculatorenhanced;
}