module com.mycompany.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.calculator to javafx.fxml;
    exports com.mycompany.calculator;
}
