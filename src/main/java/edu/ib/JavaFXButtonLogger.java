package edu.ib;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFXButtonLogger extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("/fxml/logger.fxml"));
        Scene scene= new Scene(root,800,600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Super logger");
        primaryStage.show();

    }
}
