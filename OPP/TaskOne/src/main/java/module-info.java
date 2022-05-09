module lt.codeacademy.taskone {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens lt.codeacademy.taskone to javafx.fxml;
    exports lt.codeacademy.taskone;
}