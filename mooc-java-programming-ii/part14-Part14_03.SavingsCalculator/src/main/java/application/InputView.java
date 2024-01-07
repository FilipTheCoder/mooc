/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author filip
 */
public class InputView {

    private String message;

    private int min;
    private int max;
    private double curr;
    private Slider slider;

    public InputView(String message, int min, int max, double curr) {
        this.message = message;
        this.min = min;
        this.max = max;
        this.curr = curr;
        this.slider = new Slider(min, max, curr);
    }

    public Slider getSlider() {
        return slider;
    }

    public Pane getView() {
        BorderPane inputGroup = new BorderPane();
        Label messageLabel = new Label(message);
        Label currentlySelected = new Label(Double.toString(curr));
        
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        if(min != 0) {
            slider.setMajorTickUnit(min);
            
        }
        
        slider.setBlockIncrement(0.1f);
        inputGroup.setLeft(messageLabel);
        inputGroup.setCenter(slider);
        inputGroup.setRight(currentlySelected);
        
        slider.valueProperty().addListener((obs, oldVal, newVal) -> {
            curr = newVal.intValue();
            currentlySelected.setText(Double.toString(curr));
            
        });
        
        
        
        return inputGroup;
    }
}
