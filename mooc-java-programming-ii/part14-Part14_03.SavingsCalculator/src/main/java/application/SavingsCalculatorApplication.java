package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);

    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane mainGroup = new BorderPane();
        VBox inputGroup = new VBox();
        NumberAxis x = new NumberAxis(0, 30, 1);
        NumberAxis y = new NumberAxis();
        LineChart<Number, Number> chart = new LineChart<>(x, y);

        mainGroup.setCenter(chart);
        mainGroup.setTop(inputGroup);

        InputView monthlyView = new InputView("Monthly savings", 25, 250, 25);
        InputView yearlyView = new InputView("Yearly interest rate", 0, 10, 0);

        monthlyView.getSlider().valueProperty().addListener((o, oldV, newV) -> {

            chart.getData().clear();

            chart.getData().add(calculateLinear(newV.doubleValue()));
            chart.getData().add(calculateExponational(newV.doubleValue(), yearlyView.getSlider().getValue()));

        });
        yearlyView.getSlider().valueProperty().addListener((o, old, newValue) -> {

            chart.getData().clear();
            chart.getData().add(calculateLinear(monthlyView.getSlider().getValue()));
            chart.getData().add(calculateExponational(monthlyView.getSlider().getValue(), newValue.doubleValue()));

        });

        chart.getData().add(calculateLinear(monthlyView.getSlider().getValue()));
        chart.getData().add(calculateExponational(monthlyView.getSlider().getValue(), yearlyView.getSlider().getValue()));

        inputGroup.getChildren().add(monthlyView.getView());
        inputGroup.getChildren().add(yearlyView.getView());

        stage.setScene(new Scene(mainGroup));
        stage.show();

    }

    private XYChart.Series calculateExponational(double monthlySavings, double interestRate) {
        XYChart.Series exponational = new XYChart.Series<>();

        double savings = 0;
        for (int i = 0; i < 31; i++) {

            XYChart.Data date = new XYChart.Data<>(i, savings);
            exponational.getData().add(date);

            savings += monthlySavings * 12;
            savings *= (1 + (interestRate / 100));

        }
        return exponational;
    }

    private XYChart.Series calculateLinear(double monthlySavings) {
        XYChart.Series monthlyLinear = new XYChart.Series<>();

        double savings = 0;
        for (int i = 0; i < 31; i++) {

            XYChart.Data date = new XYChart.Data<>(i, savings);
            monthlyLinear.getData().add(date);
            savings += monthlySavings * 12;

        }
        return monthlyLinear;
    }

}
