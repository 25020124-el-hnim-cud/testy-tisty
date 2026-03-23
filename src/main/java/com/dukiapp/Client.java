package com.dukiapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Client {
    @FXML
    Label textLabel;

    public void displayName(String username) {
        textLabel.setText("Hello " + username);
    }
}
