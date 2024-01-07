package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application  {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);    
               
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Hello button");
        TextField input = new TextField("This is textfield");
        
        
        FlowPane group = new FlowPane();
        group.getChildren().add(button);
        group.getChildren().add(input);
        
        stage.setScene(new Scene(group));
        stage.show();
       
        
                
                
                
    }

}
