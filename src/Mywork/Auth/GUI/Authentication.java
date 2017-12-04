package Mywork.Auth.GUI;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Authentication extends Application {
    public static boolean isValid(String password) {
        if (password.length() < 8) {
            return false;
        }
        return true;
    }
    @Override
    public void start(Stage myStage) {

        myStage.setTitle("Login");

        GridPane rootNode = new GridPane();
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 500, 300);

        rootNode.add(new Label("Username:"), 0, 0);
        TextField firstValue = new TextField();
        rootNode.add(firstValue, 1, 0);
        rootNode.add(new Label("Password:"), 0, 1);
        PasswordField secondValue = new PasswordField();
        rootNode.add(secondValue, 1, 1);
        Button aButton = new Button("Login");
        rootNode.add(aButton, 1, 3);
        GridPane.setHalignment(aButton, HPos.RIGHT);

        aButton.setOnAction(e -> {
            String username = String.valueOf(firstValue.getText());
            String password = String.valueOf(secondValue.getText());
            System.out.println(username);
            System.out.println(password);
        });

        myStage.setScene(myScene);

        myStage.show();
    }
    public static void main(String[] args) {
        launch(args);

    }
}