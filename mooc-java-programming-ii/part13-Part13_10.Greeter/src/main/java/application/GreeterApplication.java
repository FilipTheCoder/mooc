package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox box = new VBox();
        Label text = new Label("Enter your name and start.");
        TextField input = new TextField();
        Button button = new Button("Start");
        box.getChildren().add(text);
        box.getChildren().add(input);
        box.getChildren().add(button);


        BorderPane group = new BorderPane();
        group.setCenter(box);

        button.setOnMouseClicked((event) -> {
            BorderPane group1 = new BorderPane();

            group1.setCenter(new Label("Welcome " + input.getText() + "!"));
            stage.setScene(new Scene(group1));
        });

        stage.setScene(new Scene(group));
        stage.show();

    }
}
