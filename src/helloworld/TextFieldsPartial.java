/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Opiframe
 */
public class TextFieldsPartial extends VBox {
    
    // Text fields
    private final Label nameLabel = new Label("Name:");
    private final TextField nameField = new TextField();
    private final Label addressLabel = new Label("Address:");
    private final TextField addressField = new TextField();
    private final Label phoneLabel = new Label("Phone number:");
    private final TextField phoneField = new TextField();

    public TextFieldsPartial() {
        VBox.setMargin(this, new Insets(5,5,5,5));           // Margins affecting this layout inside the root
        this.setStyle("-fx-padding:10px; -fx-spacing:7px");  // Margins between the fields
        this.getChildren().add(nameLabel);
        this.getChildren().add(nameField);
        this.getChildren().add(addressLabel);
        this.getChildren().add(addressField);
        this.getChildren().add(phoneLabel);
        this.getChildren().add(phoneField);        
    }
    
}
