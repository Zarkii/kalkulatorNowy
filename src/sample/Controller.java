package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.awt.*;

public class Controller {

    @FXML
    Button button1 = new Button();
    @FXML
    Button button2 = new Button();
    @FXML
    TextField pole = new TextField();





    public void Przycisk1(){
        pole.setText(pole.getText()+1);

    }
    public void Przycisk2(){
        pole.setText(pole.getText()+2);

    }
}

