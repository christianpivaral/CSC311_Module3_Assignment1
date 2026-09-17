module com.example.csc311_module3_assignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_module3_assignment1 to javafx.fxml;
    exports com.example.csc311_module3_assignment1;
}