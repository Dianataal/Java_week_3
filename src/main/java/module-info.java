module com.example.java_week_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_week_3 to javafx.fxml;
    exports com.example.java_week_3;
}