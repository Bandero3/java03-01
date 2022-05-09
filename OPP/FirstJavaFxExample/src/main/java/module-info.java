module lt.codeacademy.firstjavafxexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens lt.codeacademy.firstjavafxexample to javafx.fxml;
    exports lt.codeacademy.firstjavafxexample;
}