/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author filip
 */
public class PractiseApplication extends Application {
    private Dictionary dict;
    
    @Override
    public void init() {
        this.dict = new Dictionary();
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Viewable inputView = new InputView(dict);
        Viewable practiceView = new PractiseView(dict);
        

        BorderPane layout = new BorderPane();


        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");


        menu.getChildren().addAll(enterButton, practiceButton);
        layout.setTop(menu);


        enterButton.setOnAction((event) -> layout.setCenter(inputView.getView()));
        practiceButton.setOnAction((event) -> {
                layout.setCenter(practiceView.getView());
            });

        layout.setCenter(inputView.getView());


        Scene view = new Scene(layout, 400, 300);

  
        stage.setScene(view);
        stage.show();
        
    }
    
}
