module edu.farmingdale.week4_labwork {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens edu.farmingdale.week4_labwork to javafx.fxml;
    exports edu.farmingdale.week4_labwork;
}