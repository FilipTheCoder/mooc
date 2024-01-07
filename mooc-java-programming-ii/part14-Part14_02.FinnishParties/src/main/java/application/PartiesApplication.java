package application;

import java.nio.file.Paths;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {

        
        LineChart<Number, Number> chart = loadData();
        chart.setTitle("Relative support of the parties");
        
        stage.setScene(new Scene(chart));
        stage.show();

        
        
        
        
    }
    
    public static LineChart<Number, Number> loadData() {
        
        NumberAxis x = new NumberAxis(1968, 2008, 1);
        NumberAxis y = new NumberAxis();
        LineChart<Number, Number> chart = new LineChart<>(x,y);
        try (Scanner sc = new Scanner(Paths.get("partiesdata.tsv"))) {
            // parse year
            String[] yearData = sc.nextLine().split("\t");
            
            while(sc.hasNextLine()) {
                String[] partyData = sc.nextLine().split("\t");
                XYChart.Series party = new XYChart.Series<>();
                party.setName(partyData[0]);
                for (int i = 1; i < partyData.length; i++) {
                    if(partyData[i].equals("-")) {
                        continue;
                    }
                    party.getData().add(new XYChart.Data<>(Integer.valueOf(yearData[i]), Double.valueOf(partyData[i])));
                }
                chart.getData().add(party);
                
                
            }
            
        } catch(Exception e) {
            System.out.println("Error opening file: " + e.getMessage());
            return new LineChart<>(x,y);
        }
        return chart;
        
        
    }

}
