package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane group = new BorderPane();
        Label topText = new Label("First view!");
        Button centerButton = new Button("To the second view!");
        
        
        
        group.setTop(topText);
        group.setCenter(centerButton);
        
        Button topButton = new Button("To the third view!");
        Label text = new Label("Second view!");
        VBox group2 = new VBox();
        

        
        
        group2.getChildren().add(topButton);
        group2.getChildren().add(text);
        
        GridPane group3 = new GridPane();
        Label text3 = new Label("Third view!");
        Button toTheFirst = new Button("To the first view!");
        group3.add(text3, 0, 0);
        group3.add(toTheFirst, 1, 1);
        
        
        Scene s1 = new Scene(group);
        Scene s2 = new Scene(group2);
        Scene s3 = new Scene(group3);
        
        centerButton.setOnMouseClicked((event) -> stage.setScene(s2));
        topButton.setOnMouseClicked((event) -> stage.setScene(s3));
        toTheFirst.setOnMouseClicked((event) -> stage.setScene(s1));
        

        stage.setScene(s1);
        stage.show();
    }

}
