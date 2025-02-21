package edu.farmingdale.week4_labwork;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

import javax.swing.text.html.ImageView;
import java.io.IOException;

public class SplashController {

    @FXML
    void moveToNewScreen(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("splash_screen.fxml"));
        Scene scene = new Scene(root, 850, 560);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("landing_screen.fxml"));

        scene.setRoot(fxmlLoader.load());
    }

    public void onHelloButtonClick(ActionEvent actionEvent) {

    }
}