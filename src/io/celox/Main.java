package io.celox;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        final Parent root = loader.load();
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent t) {
                if (t.getCode() == KeyCode.ESCAPE) {
                    System.out.println("click on escape");
                    Stage sb = (Stage) root.getScene().getWindow();
                    sb.close();
                }
            }
        });

        Controller controller = loader.getController();
        controller.addMessage("Hello World");
        controller.addMessage("42");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
