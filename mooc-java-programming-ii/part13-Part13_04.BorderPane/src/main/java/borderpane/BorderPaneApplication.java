package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label north = new Label("NORTH");
        Label south = new Label("SOUTH");
        Label east = new Label("EAST");
        //Label west = new Label("WEST");
        
        BorderPane group = new BorderPane();
        group.setTop(north);
        group.setRight(east);
        group.setBottom(south);
        
        stage.setScene(new Scene(group));
        stage.show();
        
                
               
    }

}
