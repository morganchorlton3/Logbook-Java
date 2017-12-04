package Mywork.Auth.GUI;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;

import java.awt.*;

public class Register extends Application {
    @Override
    public void start(Stage myStage) {

        myStage.setTitle("Register");

        GridPane rootNode = new GridPane();
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 500, 300);
        rootNode.add(new Text ("Register"),0,0);
        rootNode.add(new Label("Username:"), 0, 1);
        TextField firstValue = new TextField();
        rootNode.add(firstValue, 1, 1);
        rootNode.add(new Label("First Name:"), 0, 2);
        TextField secondValue = new TextField();
        rootNode.add(secondValue, 1, 2);
        rootNode.add(new Label("Last Name:"), 0, 3);
        TextField thirdValue = new TextField();
        rootNode.add(thirdValue, 1, 3);
        rootNode.add(new Label("Password:"), 0, 4);
        PasswordField fouthValue = new PasswordField();
        rootNode.add(fouthValue, 1, 4);
        Button aButton = new Button("Register");
        rootNode.add(aButton, 1, 6);
        GridPane.setHalignment(aButton, HPos.RIGHT);

        aButton.setOnAction(e -> {
            String username = String.valueOf(firstValue.getText());
            String password = String.valueOf(secondValue.getText());
            String firstName = String.valueOf(thirdValue.getText());
            String lastName = String.valueOf(fouthValue.getText());


        });

        myStage.setScene(myScene);
        myScene.getStylesheets().add
                (Register.class.getResource("Register.css").toExternalForm());
        myStage.show();
    }
    public static void main(String[] args) {
        launch(args);

    }
}