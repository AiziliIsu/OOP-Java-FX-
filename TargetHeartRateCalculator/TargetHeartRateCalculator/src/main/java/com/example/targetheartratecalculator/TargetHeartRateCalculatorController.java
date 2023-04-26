package com.example.targetheartratecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TargetHeartRateCalculatorController {

    @FXML
    private TextField ageTextField;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField maxHeartRateTextField;

    @FXML
    private TextField targetHearRateTextField;

    @FXML
    void calculate(ActionEvent event) {
        try{
            int ageP=Integer.parseInt(ageTextField.getText());
            float averageB= (float) ((220-ageP)*0.5);
            float averageU= (float) ((220-ageP)*0.85);
            double hearBeat=  (207-(ageP*0.7));
            targetHearRateTextField.setText("Between "+averageB+" and "+averageU);
            maxHeartRateTextField.setText(String.valueOf(hearBeat));}
        catch (NumberFormatException e){
            ageTextField.setText("Input Number");
        }


    }

}