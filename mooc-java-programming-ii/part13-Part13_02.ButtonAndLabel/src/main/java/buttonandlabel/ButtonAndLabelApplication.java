package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("This is a button");
        Label text = new Label("Text element");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(text);
        
        stage.setScene(new Scene(componentGroup));
        stage.setTitle("Hello World");
        stage.show();
                
    }

}
