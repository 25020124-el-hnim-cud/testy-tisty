package com.dukiapp;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("AgeVerify.fxml"));
            Image icon = new Image(getClass().getResourceAsStream("augh.png"));
            stage.getIcons().add(icon);
            Scene scene = new Scene(root);
            stage.setTitle("Dukiapp");
            stage.setScene(scene);
            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}