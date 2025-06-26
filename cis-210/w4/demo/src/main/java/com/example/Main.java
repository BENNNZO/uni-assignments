package com.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage stage) {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        Group root = new Group(canvas);
        Scene scene = new Scene(root);

        stage.setTitle("Texting Graphics");
        stage.setScene(scene);
        stage.show();

        drawHouse(gc);
    }

    static void drawHouse(GraphicsContext gc) {
        // Sky
        gc.setFill(Color.SKYBLUE);
        gc.fillRect(0, 0, 500, 500);

        // Sun
        gc.setFill(Color.rgb(255, 169, 20));
        gc.fillOval(25, 25, 120, 120);
        gc.setFill(Color.rgb(255, 185, 20));
        gc.fillOval(35, 35, 100, 100);
        // Grass
        gc.setFill(Color.rgb(92, 183, 51));
        gc.fillRect(0, 450, 500, 50);

        // House Square
        gc.setFill(Color.rgb(100, 56, 0));
        gc.fillRect(150, 325, 200, 125);

        // House Triangle (Roof)
        gc.setFill(Color.GREY);
        gc.beginPath();
        gc.moveTo(125, 325);
        gc.lineTo(250, 225);
        gc.lineTo(375, 325);
        gc.closePath();
        gc.fill();

        // House Door
        gc.setFill(Color.rgb(64, 31, 0));
        gc.fillRect(225, 385, 50, 65);

        // House Windows
        gc.setFill(Color.rgb(122, 190, 255));
        gc.fillRect(167.5, 360, 45, 45);
        gc.fillRect(287.5, 360, 45, 45);

    }

    public static void main(String[] args) {
        launch();
    }
}
