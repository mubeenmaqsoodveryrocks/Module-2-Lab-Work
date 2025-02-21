module edu.farmingdale.week4_log_launchscreen {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.week4_log_launchscreen to javafx.fxml;
    exports edu.farmingdale.week4_log_launchscreen;
}