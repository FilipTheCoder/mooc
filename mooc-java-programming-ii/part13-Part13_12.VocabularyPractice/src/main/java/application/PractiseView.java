/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author filip
 */
public class PractiseView implements Viewable {

    private final Dictionary dict;
    private String word;

    public PractiseView(Dictionary dict) {
        this.dict = dict;
        this.word = dict.randomWord();
        

    }

    @Override
    public Pane getView() {
        GridPane layout = new GridPane();

        Label wordInstruction = new Label("Translate the word '" + this.word + "'");
        TextField translationField = new TextField();

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Button addButton = new Button("Check");

        Label feedback = new Label("");

        layout.add(wordInstruction, 0, 0);
        layout.add(translationField, 0, 1);
        layout.add(addButton, 0, 2);
        layout.add(feedback, 0, 3);

        addButton.setOnMouseClicked((event) -> {
            String translation = translationField.getText();
            if (dict.get(word).equals(translation)) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! The translation fo the word '" + word + "' is '" + dict.get(word) + "'.");
                return;
            }

            this.word = this.dict.randomWord();
            wordInstruction.setText("Translate the word '" + this.word + "'");
            translationField.clear();
        });

        return layout;
    }


}
