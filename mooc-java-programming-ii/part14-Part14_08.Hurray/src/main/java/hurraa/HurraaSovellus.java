package hurraa;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
//import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Button button = new Button("Hurraa!");
        //AudioClip clip = new AudioClip("file:Applause-Yannick_Lemieux.wav");
               
        pane.setCenter(button);
        //button.setOnAction((event) -> clip.play());

        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
