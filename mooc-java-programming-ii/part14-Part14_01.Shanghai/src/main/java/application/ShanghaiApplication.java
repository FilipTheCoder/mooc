package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis x = new NumberAxis(2001, 2020, 0);
        NumberAxis y = new NumberAxis();

        
       x.setLabel("Year");
       y.setLabel("Ranking");
       
       
       LineChart<Number, Number> chart = new LineChart<>(x,y);
       System.out.println(((NumberAxis)chart.getXAxis()).getLowerBound());
       chart.setTitle("University of Helsinki, Shangai rating");
       
       XYChart.Series helData = new XYChart.Series();
       helData.setName("rank");
       helData.getData().add(new XYChart.Data(2007, 73));
       helData.getData().add(new XYChart.Data(2008, 68));
       helData.getData().add(new XYChart.Data(2009, 72));
       helData.getData().add(new XYChart.Data(2010, 72));
       helData.getData().add(new XYChart.Data(2011, 74));
       helData.getData().add(new XYChart.Data(2012, 73));
       helData.getData().add(new XYChart.Data(2013, 76));
       helData.getData().add(new XYChart.Data(2014, 73));
       helData.getData().add(new XYChart.Data(2015, 67));
       helData.getData().add(new XYChart.Data(2016, 56));
       helData.getData().add(new XYChart.Data(2017, 56));
       
       chart.getData().add(helData);
       
       stage.setScene(new Scene(chart, 640, 480));
       stage.show();
        
    }

}
