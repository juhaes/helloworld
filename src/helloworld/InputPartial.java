/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.scene.layout.VBox;

/**
 *
 * @author juhaes
 */
public class InputPartial extends VBox {

    private final TextFieldsPartial partial = new TextFieldsPartial();
    private final ButtonsPartial buttons = new ButtonsPartial(partial);

    public InputPartial() {
        
        this.getChildren().add(partial);
        this.getChildren().add(buttons);
    }
    
}
