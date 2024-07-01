package de.lubowiecki.petregister;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    private StringBuilder sb = new StringBuilder();

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        sb.append("Click! ");
        welcomeText.setText("cap: " + sb.capacity() + ", Anzahl Zeichen: " + sb.length());
    }
}