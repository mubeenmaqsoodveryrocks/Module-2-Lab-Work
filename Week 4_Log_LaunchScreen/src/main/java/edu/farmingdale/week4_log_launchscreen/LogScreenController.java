package edu.farmingdale.week4_log_launchscreen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LogScreenController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}