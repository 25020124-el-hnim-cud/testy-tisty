package com.dukiapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AgeVerify {
    @FXML
    private Button ageButton;
    @FXML
    private Label ageLabel;
    @FXML
    private TextField ageTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;
    int age;

    public void verify(ActionEvent event) {

        try {
            age = Integer.parseInt(ageTextField.getText());
            if (age >= 18) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
                root = loader.load();
                stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else if (age <= 18) {
                ageLabel.setText("Kids like you shouldn't messin' around here");
            }
        } catch (NumberFormatException e) {
            ageLabel.setText("Only numbers allowed!");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}