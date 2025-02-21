module edu.farmingdale.week4_fileeditscreen {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.week4_fileeditscreen to javafx.fxml;
    exports edu.farmingdale.week4_fileeditscreen;
}