module com.example.tareamod8openbootcamp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tareamod8openbootcamp to javafx.fxml;
    exports com.example.tareamod8openbootcamp;
}