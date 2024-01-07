package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextArea text = new TextArea();
        HBox bottomTexts = new HBox();
        bottomTexts.setSpacing(10);
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is:");
        
        
        bottomTexts.getChildren().add(letters);
        bottomTexts.getChildren().add(words);
        bottomTexts.getChildren().add(longest);
        BorderPane mainPane = new BorderPane();
        
        
        mainPane.setBottom(bottomTexts);
        mainPane.setCenter(text);
        
        
        stage.setScene(new Scene(mainPane));
        stage.show();
                
        
        
        
        
                
    }

}
