package edu.farmingdale.week4_fileeditscreen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class File_EditScreen {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}