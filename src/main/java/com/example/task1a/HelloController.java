package com.example.task1a;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;


public class HelloController {
    @FXML
    public Button buttonDraw;
    @FXML
    public Button buttonDraw2;
    @FXML
    public Button buttonDraw3;
    @FXML
    private Label welcomeText;
    @FXML
    private Canvas canvas;


    @FXML
    protected void drawButton() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.beginPath();
        gc.setFill(Color.PURPLE);
        gc.setLineWidth(4.0);
        gc.strokeLine(200, 50, 300, 50);
        gc.fill();
        gc.closePath();



    }
    @FXML
    protected void drawButton2() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.beginPath();
        gc.setFill(Color.RED);
        gc.moveTo(150, 150);
        gc.lineTo(175, 150);
        gc.lineTo(175, 175);
        gc.lineTo(150, 175);
        gc.fill();
        gc.closePath();
    }
    @FXML
    protected void drawButton3() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.beginPath();
        gc.setFill(Color.BLACK);
        gc.moveTo(125, 50);
        gc.lineTo(125, 75);
        gc.lineTo(125, 100);
        gc.lineTo(150, 100);
        gc.fill();
        gc.closePath();
    }


}