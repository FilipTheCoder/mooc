package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();
        int count = 0;
        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();
        for (int i = 0; i < 4; i++) {
            int yCoordinate = 0;
            int offsetY = 0;
            int offsetX = 0;
            
            if(count > 1) {
                count = 0;
            }
            if(i > 1) {
                offsetY = height/2;
            }
            
            offsetX = count * width/2;
     
            
            
            int newY = 0;
            while (yCoordinate < height) {

                int xCoordinate = 0;

                int newX = 0;

                while (xCoordinate < width) {

                    Color color = imageReader.getColor(xCoordinate, yCoordinate);
                    double red = color.getRed();
                    double green = color.getGreen();
                    double blue = color.getBlue();
                    double opacity = color.getOpacity();

                    Color newColor = new Color(1.0  - red, 1.0  - green, 1.0  - blue, opacity);

                    imageWriter.setColor(newX +offsetX, newY + offsetY, newColor);
                    newX++;
                    xCoordinate = newX * 2;

                }
                newY++;
                yCoordinate = newY * 2;

            }
            count ++;
        }

        ImageView image = new ImageView(targetImage);

        Pane pane = new Pane();
        //pane.getChildren().add(new ImageView(sourceImage));
        pane.getChildren().add(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
