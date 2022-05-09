package lt.codeacademy.randomgamefx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {

    @FXML
    private TextField guessTextField;
    @FXML
    private Label incorrectLabel;
    @FXML
    private Label correctLabel;
    @FXML
    private Button randomButton;


    @FXML
    protected void onClickRandomGame(){
        Random random = new Random();
        int randNumber = random.nextInt(10)+1;

        try{
            int userNumber =Integer.parseInt(guessTextField.getText());
            if(randNumber == userNumber){
                incorrectLabel.setText("");
                correctLabel.setText("" +randNumber);
                randomButton.setDisable(true);
            } else{
                correctLabel.setText("");
                incorrectLabel.setText("" + randNumber);
            }
        } catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Ivestas ne skaicius");
            alert.show();
            guessTextField.setText("");
        }
    }
    @FXML
    protected void initialize(){
        System.out.println("Init");
    }
}