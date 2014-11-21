/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author juhaes
 */
public class ButtonsPartial extends HBox implements EventHandler<ActionEvent> {

        // Buttons
        private final Button saveButton = new Button("Save");
        private final Button closeButton = new Button("Cancel");
        private TextFieldsPartial partial;
        
    public ButtonsPartial(TextFieldsPartial partial) {
        
        this.partial = partial;
        
        VBox.setMargin(this, new Insets(5,5,5,5));           // Margins affecting this layout inside the root
        this.setStyle("-fx-padding:10px; -fx-spacing:7px");  // Margins between the fields
        this.getChildren().add(saveButton);
        this.getChildren().add(closeButton);
        saveButton.setOnAction(this);
        closeButton.setOnAction(this);
        /* Another solution: Inline (right here) implementation for EventHandler interface
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                Platform.exit();
            }
        });*/
    }

    @Override
    public void handle(ActionEvent t) {
        if (t.getSource().equals(saveButton)) {
            UserInfo temp = partial.getUserInfo();
            ListNamesPartial.userInfo.add(temp);
            partial.clearFields();
        }
        if (t.getSource().equals(closeButton)) {
            Platform.exit();
        }
    }

}
