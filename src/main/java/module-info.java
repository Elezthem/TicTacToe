module com.example.hemydevjavagame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hemydevjavagame to javafx.fxml;
    exports com.example.hemydevjavagame;
}