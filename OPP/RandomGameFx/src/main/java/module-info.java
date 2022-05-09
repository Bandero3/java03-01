module lt.codeacademy.randomgamefx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens lt.codeacademy.randomgamefx to javafx.fxml;
    exports lt.codeacademy.randomgamefx;
}