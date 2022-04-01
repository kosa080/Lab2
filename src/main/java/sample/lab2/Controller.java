package sample.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button btnMain;
    int clickCounter = 0;

    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Klikniecie nr " + ++clickCounter);
        if (clickCounter == 1)
            btnMain.setText("I jeszcze raz");
    }
}