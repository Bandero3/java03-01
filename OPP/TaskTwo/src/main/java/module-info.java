module lt.codeacademy.tasktwo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens lt.codeacademy.tasktwo to javafx.fxml;
    exports lt.codeacademy.tasktwo;
}