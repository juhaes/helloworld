/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 *
 * @author juhaes
 */
public class ListNamesPartial extends VBox implements EventHandler<ActionEvent> {

    public static ArrayList<UserInfo> userInfo = new ArrayList();  // Problem: Where to define this and how to use in different classes
    private final TextArea nameList = new TextArea();
    private final Button listButton = new Button("List");

    public ListNamesPartial() {
        
        VBox.setMargin(this, new Insets(5,5,5,5));          // Margins affecting this layout inside the root
        this.setStyle("-fx-max-width:200px;"
                    + "-fx-max-height:300px;"
                    + "-fx-padding:20px;"
                    + "-fx-spacing:20px");                  // Margins between the fields
        this.getChildren().add(nameList);
        this.getChildren().add(listButton);
        listButton.setOnAction(this);
    }

    @Override
    public void handle(ActionEvent t) {
        if (t.getSource().equals(listButton)) {
            nameList.clear();
            for (UserInfo temp : userInfo) {
                nameList.setText(nameList.getText() +
                              "Name:" + temp.getName() + "\n" +
                              "Address:" + temp.getAddress() + "\n" +
                              "Phone:" + temp.getPhone() + "\n\n");
            }
        }
    }

}
