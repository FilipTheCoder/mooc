package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        VBox box = new VBox();
        Button button = new Button("Update");
        TextField input = new TextField();
        Label text = new Label("");
        button.setOnMouseClicked((event) -> text.setText(input.getCharacters().toString()));
        
        
        box.getChildren().add(input);
        box.getChildren().add(button);
        box.getChildren().add(text);
        
        stage.setScene(new Scene(box));
        stage.show();
    }

}
