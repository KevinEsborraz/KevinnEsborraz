module com.example.tareamod4openbootcamp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tareamod4openbootcamp to javafx.fxml;
    exports com.example.tareamod4openbootcamp;
}