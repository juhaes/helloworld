/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author juhaes
 */
public class Helloworld extends Application {

    @Override
    public void start(Stage primaryStage) {
    
        // Root is the main layout
        HBox root = new HBox();
        
        root.getChildren().add(new InputPartial());      // Create new class and add it to layout
        root.getChildren().add(new ListNamesPartial());  // Create new class and add it to layout
        Scene scene = new Scene(root, 400, 300);
        
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
