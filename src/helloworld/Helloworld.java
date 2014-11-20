/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Opiframe
 */
public class Helloworld extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Root is the main layout
        VBox root = new VBox();

        // Text fields
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Label addressLabel = new Label("Address:");
        TextField addressField = new TextField();
        Label phoneLabel = new Label("Phone number:");
        TextField phoneField = new TextField();
        
        // Text field component layout
        VBox textFieldLayout = new VBox();
        textFieldLayout.setStyle("-fx-padding:10px; -fx-spacing:7px");
        textFieldLayout.getChildren().add(nameLabel);
        textFieldLayout.getChildren().add(nameField);
        textFieldLayout.getChildren().add(addressLabel);
        textFieldLayout.getChildren().add(addressField);
        textFieldLayout.getChildren().add(phoneLabel);
        textFieldLayout.getChildren().add(phoneField);

        // Buttons
        Button saveButton = new Button("Save");
        Button closeButton = new Button("Cancel");
        HBox buttonLayout = new HBox();
        buttonLayout.setStyle("-fx-padding:10px; -fx-spacing:10px;");
        buttonLayout.getChildren().add(saveButton);
        buttonLayout.getChildren().add(closeButton);
        
        root.getChildren().add(textFieldLayout);
        root.getChildren().add(buttonLayout);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Idea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
