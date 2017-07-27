package io.celox;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Controller {
    @FXML
    private VBox root;

    public void addMessage(String message) {
        root.getChildren().add(new Label(message));
    }

}