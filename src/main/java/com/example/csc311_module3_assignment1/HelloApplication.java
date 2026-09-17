package com.example.csc311_module3_assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Create the scene
        Scene scene = new Scene(fxmlLoader.load());

        // Set up and show the window
        stage.setTitle("LoanCalculator");
        stage.setScene(scene);
        stage.show();
    }
}