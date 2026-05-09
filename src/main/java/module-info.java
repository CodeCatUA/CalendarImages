module com.example.calendarimages {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calendarimages to javafx.fxml;
    exports com.example.calendarimages;
}