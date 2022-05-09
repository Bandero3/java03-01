package lt.codeacademy.firstjavafxexample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.controlsfx.control.textfield.TextFields;

public class HelloController {

    @FXML
    private TextField dayTextField;

    @FXML
    private Label dayLabel;

    @FXML
    protected void onDayClick(){
        String text = dayTextField.getText();
        if(text == null || text.equals("")){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Laukelis negali buti tuscias");
            alert.show();
        }

        dayTextField.setText("");
        dayLabel.setText(text);
    }
}