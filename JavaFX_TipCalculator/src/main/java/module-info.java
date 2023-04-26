module com.example.javafx_tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_tipcalculator to javafx.fxml;
    exports com.example.javafx_tipcalculator;
}