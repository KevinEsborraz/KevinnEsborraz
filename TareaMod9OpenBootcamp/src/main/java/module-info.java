module com.example.tareamod9openbootcamp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tareamod9openbootcamp to javafx.fxml;
    exports com.example.tareamod9openbootcamp;
}