package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox question = createView("What do you call a bear with no teeth?");
        VBox answer = createView("A gummy bear.");
        VBox explanation  = createView("Beacuse gummy bear is a bear with now teeth, haha!");
        
        BorderPane pane = new BorderPane();
        Button qButton = new Button("Joke");
        Button aButton = new Button("Answer");
        Button eButton = new Button("Explanation");
        HBox box = new HBox();
        box.setSpacing(10);
        
        qButton.setOnAction((event) -> pane.setCenter(question));
        aButton.setOnAction((event) -> pane.setCenter(answer));
        eButton.setOnAction((event) -> pane.setCenter(explanation));
        
        
        box.getChildren().add(qButton);
        box.getChildren().add(aButton);
        box.getChildren().add(eButton);
        pane.setTop(box);
        pane.setCenter(question);
        
        stage.setScene(new Scene(pane));
        stage.show();
        
        
        
        
        
        
       
        
        
    }
    
    public static VBox createView(String text) {
        VBox box = new VBox();
        box.getChildren().add(new Label(text));
        return box;
    }
}
