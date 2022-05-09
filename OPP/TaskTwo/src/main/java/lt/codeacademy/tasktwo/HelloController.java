package lt.codeacademy.tasktwo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {
    @FXML
    private Label guessedResultLabel;

    @FXML
    private TextField guessTextField;

    @FXML
    protected void clickGuess(){
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;

        int guessAnswer = Integer.parseInt(guessTextField.getText());

        if(randomNumber == guessAnswer){
            guessedResultLabel.setText("Atspiejote");
        } else{
            guessedResultLabel.setText("Neatspejote skaicius buvo: " + randomNumber + ", naujas skaicius sugeneruotas, bandykite vel");
        }
    }

    @FXML
    protected void clickButton(){
        System.out.println("ass");
        System.exit(0);
    }

}