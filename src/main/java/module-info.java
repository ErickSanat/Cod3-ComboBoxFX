module com.example.cod3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.cod3 to javafx.fxml;
    exports com.example.cod3;
}