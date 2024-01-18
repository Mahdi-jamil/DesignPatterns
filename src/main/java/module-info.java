module com.devesta.i5course {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.devesta.i5course.javaFX.lab.ex1;
    exports com.devesta.i5course.javaFX.lab.ex2;
    opens com.devesta.i5course.javaFX.lab.ex2 to javafx.fxml;
    opens com.devesta.i5course.javaFX.lab.ex1 to javafx.fxml;
}