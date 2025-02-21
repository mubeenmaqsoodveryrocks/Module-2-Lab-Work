module edu.farmingdale.week4_labwork_loginscreen {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.week4_labwork_loginscreen to javafx.fxml;
    exports edu.farmingdale.week4_labwork_loginscreen;
}