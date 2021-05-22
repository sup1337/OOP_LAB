package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {
    private int counter=0;
    @FXML
    private Button firstButton;
    public void buttonPressed(ActionEvent actionEvent){
        counter++;
        //System.out.println("Button pressed: "+counter+" times");
        firstButton.setText("Button pressed: "+counter+" times");
    }
}
