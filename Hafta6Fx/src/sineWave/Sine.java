package sineWave;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Sine extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Pane root = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));
        Text ctext = new Text();
        Text stext = new Text();

        ctext.setText("Cos Wave");
        stext.setText("Sin Wave");
        ctext.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        stext.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        ctext.setX(5);
        ctext.setY(255);
        stext.setX(5);
        stext.setY(55);
        double[] sinWav = new double[20000];
        double[] cosWav = new double[20000];
        double velocity = 0.7;
        double spx = 0;
        int SinRefY = 100;
        int CosRefY = 300;
        Line sline = new Line(0, SinRefY, 6000, SinRefY);
        Line cline = new Line(0, CosRefY, 6000, CosRefY);
        /*sline.setStroke(Color.RED);
        sline.setStrokeWidth(2.5);
        sline.setOpacity(0.5);
        cline.setStroke(Color.BLUE);
        cline.setStrokeWidth(2.5);
        cline.setOpacity(0.5);*/
        int angle = 0;
        for (int i = 0; i < 20000; i += 2)
        {
            //sin
            double sy = SinRefY + (-30 * Math.sin(Radian(angle)));
            sinWav[i] = spx;
            sinWav[i + 1] = sy;
            //cos
            double cy = CosRefY + (-30 * Math.cos(Radian(angle)));
            cosWav[i] = spx;
            cosWav[i + 1] = cy;
            //common
            spx += velocity;
            angle += 3;
        }

        Polyline sin = new Polyline(sinWav);
        Polyline cos = new Polyline(cosWav);
        sin.setStrokeWidth(2.0);
        sin.setStroke(Color.LIME);
        cos.setStrokeWidth(2.0);
        cos.setStroke(Color.CORAL);
        root.getChildren().addAll(sline,cline, sin,cos,ctext,stext);


        primaryStage.show();
    }

    private static double Radian(double angle)
    {
        return (Math.PI / 180.0) * angle;
    }
}
