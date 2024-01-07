package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AsteroidsApplication extends Application {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;

    public static void main(String[] args) {
        launch(AsteroidsApplication.class);
    }

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane);
        Text text = new Text(10, 20, "Points: 0");
        pane.getChildren().add(text);
        pane.setPrefSize(600, 400);
        AtomicInteger points = new AtomicInteger();
        Ship ship = new Ship(150, 100);

        pane.getChildren().add(ship.getCharacter());
        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();

        List<Asteroid> asteroids = new ArrayList<>();
        List<Projectile> projectiles = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rnd = new Random();
            Asteroid asteroid = new Asteroid(rnd.nextInt(100), rnd.nextInt(100));
            asteroids.add(asteroid);
            pane.getChildren().add(asteroid.getCharacter());
        }

        scene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });

        scene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });
        new AnimationTimer() {

            @Override
            public void handle(long now) {
                if (Math.random() < 0.005) {
                    Asteroid asteroid = new Asteroid(WIDTH, HEIGHT);
                    if (!asteroid.collide(ship)) {
                        asteroids.add(asteroid);
                        pane.getChildren().add(asteroid.getCharacter());
                    }
                }
                if (pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    ship.turnLeft();
                }

                if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    ship.turnRight();
                }
                if (pressedKeys.getOrDefault(KeyCode.UP, false)) {
                    ship.accelerate();
                }
                if (pressedKeys.getOrDefault(KeyCode.SPACE, false) && projectiles.size() < 3) {

                    Projectile projectile = new Projectile((int) ship.getCharacter().getTranslateX(), (int) ship.getCharacter().getTranslateY());
                    projectile.getCharacter().setRotate(ship.getCharacter().getRotate());
                    projectiles.add(projectile);

                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));

                    pane.getChildren().add(projectile.getCharacter());
                }
                List<Character> characters = new ArrayList<Character>();
                projectiles.forEach(projectile -> {
                    characters.add(projectile);

                    asteroids.forEach(asteroid -> {
                        if (projectile.collide(asteroid)) {
                            projectile.setAlive(false);
                            asteroid.setAlive(false);

                        }
                        characters.add(asteroid);
                    });

                    if (!projectile.isAlive()) {
                        text.setText("Points: " + points.addAndGet(1000));
                    }
                });

                characters.stream()
                        .filter(charachter -> !charachter.isAlive())
                        .forEach(charachter -> pane.getChildren().remove(charachter.getCharacter()));
                projectiles.removeAll(characters.stream()
                        .filter(charachter -> !charachter.isAlive())
                        .collect(Collectors.toList()));
                asteroids.removeAll(characters.stream()
                        .filter(charachter -> !charachter.isAlive())
                        .collect(Collectors.toList()));

                ship.move();

                asteroids.forEach(asteroid
                        -> asteroid.move());

                ship.move();
                projectiles.forEach(projectile -> projectile.move());

                asteroids.forEach(asteroid
                        -> {
                    if (ship.collide(asteroid)) {
                        stop();
                    }
                }
                );
            }
        }.start();

        stage.setTitle(
                "Asteroids!");
        stage.setScene(scene);

        stage.show();
    }

}
