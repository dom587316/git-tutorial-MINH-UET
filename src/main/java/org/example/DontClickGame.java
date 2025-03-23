package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DontClickGame extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("🚫 Đừng bấm vào đây!");

        btn.setOnAction(e -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Bị bắt rồi!");
            alert.setHeaderText(null);
            alert.setContentText("Trò bấm nhầm rồi 😝");
            alert.showAndWait();
        });

        StackPane root = new StackPane(btn);
        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Mini Game JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
