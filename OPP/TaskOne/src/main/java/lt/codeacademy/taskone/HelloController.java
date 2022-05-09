package lt.codeacademy.taskone;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField surnameTextField;
    @FXML
    private Label helloLabel;

    @FXML
    protected void clickSayHello(){
        String name = nameTextField.getText();
        String surname = surnameTextField.getText();

        if(name == null || name.equals("") || surname == null || surname.equals("")){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Abu laukeliai turi buti uzpildyti");
            alert.show();
            return;
        }
        nameTextField.setText("");
        surnameTextField.setText("");
        helloLabel.setText("Sveiki " + name + " " + surname);
    }
}