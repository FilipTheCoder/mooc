package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        int width = 640;
        int heigth = 640;
        double numberOfSquares = 8.0;
        double rectWidth = width/numberOfSquares;
        double rectHeigth = heigth/numberOfSquares;
        
        BorderPane mainGroup = new BorderPane();
        Canvas canvas = new Canvas(width, heigth);
        GraphicsContext painter = canvas.getGraphicsContext2D();
        painter.setFill(Color.WHITE);
        painter.fillRect(0, 0, width, heigth);
        painter.setFill(Color.BLACK);
        
        //eyes
        painter.fillRect(rectWidth*2, rectHeigth, rectWidth, rectHeigth);
        painter.fillRect(rectWidth*5, rectHeigth, rectWidth, rectHeigth);
        //mouth
        painter.fillRect(rectWidth, rectHeigth*4, rectWidth, rectHeigth);
        painter.fillRect(rectWidth*2, rectHeigth*5, rectWidth, rectHeigth);
        painter.fillRect(rectWidth*3, rectHeigth*5, rectWidth, rectHeigth);
        painter.fillRect(rectWidth*4, rectHeigth*5, rectWidth, rectHeigth);
        painter.fillRect(rectWidth*5, rectHeigth*5, rectWidth, rectHeigth);
        painter.fillRect(rectWidth*6, rectHeigth*4, rectWidth, rectHeigth);
        
        
        
        
        
        
        mainGroup.setCenter(canvas);
        
        
        
        
        stage.setScene(new Scene(mainGroup));
        stage.show();
        
    }

}
