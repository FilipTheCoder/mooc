package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application{
    
    
   

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
   

    

    @Override
    public void start(Stage stage) throws Exception {
        final Game game = new Game();
        BorderPane group = new BorderPane();
        Label text = new Label("Turn: " + game.turn);
        GridPane board = new GridPane();
        Button[][] buttons = new Button[3][3];
        BoardAnalyzer boardAnalyzer = new BoardAnalyzer(buttons);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button(" ");
                button.setFont(Font.font("Monospaced", 40));
                button.setOnAction((event) -> {

                    if(game.end) {
                        return;
                    }
                    button.setText(game.turn);
                    button.setDisable(true);
                    if(boardAnalyzer.check(game.turn)) {
                        text.setText("The end!");
                        game.end = true;
                        return;
                    }
                    game.turn = game.turn.equals( "X") ? "O" : "X";
                    
                    text.setText("Turn: " + game.turn);
                    
                });
                board.add(button, i, j);
                buttons[i][j] = button;
            }
        }
        
        group.setTop(text);
        group.setCenter(board);
        
        stage.setScene(new Scene(group));
        stage.show();
        
        
        
    }

}
