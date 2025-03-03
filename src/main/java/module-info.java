module com.example.complexnooperation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.complexnooperation to javafx.fxml;
    exports com.example.complexnooperation;
}