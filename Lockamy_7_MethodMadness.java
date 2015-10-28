/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockamy_7_methodmadness;

import java.awt.Canvas;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import static org.robovm.apple.scenekit.SCNPhysicsBodyType.Static;
import static org.robovm.apple.scenekit.SCNPhysicsCollisionCategory.Static;

/**
 *
 * @author glockamy
 */
public class Lockamy_7_MethodMadness extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello'");
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Hello !");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 500, 700);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static class Training {

        public Training() {
        }
    }

public class Davis_3_javfaxintro extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        /**
         *
         * @param args
         */
    public  void main(String[] args) {
        launch(args);
    }
        private Object color;
        private Object Arctype;

        
    public Static void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas;
            canvas = new Canvas(300, 350);
            gc = canvas.getGraphicsContext2D(
                    
                    ;
                
   private void drawSomeGreenCircle(GraphicsContext gc, 12 , 34, 76 ) {
        gc.setFill(Color.BLUE);
        gc.fillOval(12, 34, 76, 76);
    }

    private void drawSomeRedCircle(GraphicsContext gc, int x, int y, int d) {
        gc.setFill(Color.AQUA);
        gc.fillOval(x, y, d, d);
    }

    private void drawSomeBlueCircle(GraphicsContext gc, int x, int y, int d) {
        gc.setFill(Color.CORAL);
        gc.fillOval(x, y, d, d);
    }

    private void drawSomeGreenCircle(GraphicsContext gc, int x, int y, int d) {
        gc.setFill(Color.GREEN);
        gc.fillOval(x, y, d, d);
    }
    
    private void drawLotsOfCircles(GraphicsContext gc, int num) {
        for (int i = 0; i < num; i++) {
           
        }
    }

    private void mathyCircle(GraphicsContext gc, double width, double height) {
        double x0 = 0.5 * (width - 1);
        double y0 = 0.5 * (height - 1);
        for (int sx = 0; sx < width; sx++) {
            for (int sy = 0; sy < height; sy++) {
                double dx = sx - x0;
                double dy = sy - y0;
                double r = Math.sqrt(dx * dx + dy * dy);
                double angle = Math.PI / 256 * r;
                int tx = (int) (+dx * Math.cos(angle) - dy * Math.sin(angle) + x0);
                int ty = (int) (+dx * Math.sin(angle) + dy * Math.cos(angle) + y0);
                if ((tx + ty) % 3 == 0) {
                    drawSomeGreenCircle(gc, tx, ty, 25);
                   // System.out.println(tx + ty);
                }  else  if ((tx + ty) % 2 == 0) {
                    drawSomeRedCircle(gc, tx, ty, 25);
                    //System.out.println(tx + ty);
                } 
                else {
                    drawSomeBlueCircle(gc, tx, ty, 25);
                }
            }
        }
    }

    private void drawShapes(GraphicsContext gc) {
     
        gc.setFill(color.rgb (150,100, 200));
        gc.setStroke(color.rgb (150,100,200));
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 160, 30, 30, 45, 240, Arctype.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40, 50},
                new double[]{210, 210, 240, 240, 50}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                new double[]{210, 210, 240, 240}, 4);
    }
    }




   package com.lockamy_7_methodsmadness2;
   public class Lockamy_7_MethodMadness extends Application {
    
    
}