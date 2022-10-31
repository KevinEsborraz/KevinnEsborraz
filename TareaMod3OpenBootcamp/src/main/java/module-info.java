module com.company.tarea {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.tarea to javafx.fxml;
    exports com.company.tarea;
}