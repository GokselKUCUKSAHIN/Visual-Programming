package Circle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleDrag extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        BorderPane root = new BorderPane();
        Pane pane = new Pane();
        Circle circle = new Circle(100, 100, 50);
        circle.setFill(Color.rgb(64, 128, 128));
        circle.setStrokeWidth(2.6);
        circle.setStroke(Color.LIME);
        //circle.setStroke(Color.hsb(150,100,100));
        circle.setOnMouseDragged(e -> {
            circle.setCenterX(e.getX());
            circle.setCenterY(e.getY());

        });
        circle.setOnKeyPressed(e -> {
            switch (e.getCode())
            {
                case UP:
                {
                    circle.setCenterY(circle.getCenterY() - 10);
                    break;
                }
                case DOWN:
                {
                    circle.setCenterY(circle.getCenterY() + 10);
                    break;
                }
                case LEFT:
                {
                    circle.setCenterX(circle.getCenterX() - 10);
                    break;
                }
                case RIGHT:
                {
                    circle.setCenterX(circle.getCenterX() + 10);
                    break;
                }
            }
        });

        Button shrink = new Button("-");
        Button enlarge = new Button("+");
        shrink.setFocusTraversable(false);
        enlarge.setFocusTraversable(false);
        shrink.setOnAction(e -> {
            circle.setRadius(circle.getRadius() - 5);
        });
        enlarge.setOnAction(e -> {
            circle.setRadius(circle.getRadius() + 5);
        });
        HBox box = new HBox();

        box.getChildren().addAll(shrink,enlarge);

        pane.getChildren().addAll(circle);
        root.setCenter(pane);
        root.setBottom(box);

        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.setTitle("Circle Control");
        primaryStage.show();
        circle.requestFocus();
    }
}