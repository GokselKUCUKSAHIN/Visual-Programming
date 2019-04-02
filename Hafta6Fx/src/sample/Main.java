package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Pane root = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));

        Polygon polygon = new Polygon(hexagon(300, 300, 0, 100));
        //Polygon polygon = new Polygon(yuzgen(300,300,0.0,200));
        polygon.setFill(Color.WHITE);
        polygon.setStrokeWidth(3);
        polygon.setStroke(Color.RED);
        root.getChildren().addAll(polygon);

        primaryStage.show();
    }

    private static double[] hexagon(int x, int y, int angle, int length)
    {
        double[] Hexagon = new double[12];
        int a = angle;
        for (int i = 0; i < 12; i += 2)
        {
            Point p = EndPoint(new Point(x, y), a, length);
            Hexagon[i] = p.X;
            Hexagon[i + 1] = p.Y;
            a += 60;
        }
        return Hexagon;
    }

    private static Point EndPoint(Point o, double angle, int length)
    {
        double X = o.X;
        double Y = o.Y;
        X += length * Math.cos(radian(angle));
        Y -= length * Math.sin(radian(angle));
        return new Point(X, Y);
    }

    private static double radian(double angle)
    {
        return (Math.PI / 180.0) * angle;
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
