import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.Random;

public class ColorChanger extends Application
{

    private Label label;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        VBox root = new VBox();
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setSpacing(10);
        label = new Label("BZ 214 Visual Programming");
        label.setFont(new Font(16));
        Button button = new Button("Click Me");
        
        //ClickHandler handler = new ClickHandler();

        /*button.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                Random rand = new Random();
                int red = rand.nextInt(256);
                int green = rand.nextInt(256);
                int blue = rand.nextInt(256);
                Color color;
                color = Color.rgb(red,green,blue);
                label.setTextFill(color);
            }
        });
        */
        button.setOnAction(e -> {
            Random rand = new Random();
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);
            label.setTextFill(Color.rgb(red, green, blue));
        });
        root.getChildren().addAll(label, button);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Color Changer");
        primaryStage.show();
    }
    /*
    private class ClickHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            Random rand = new Random();
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);
            Color color;
            color = Color.rgb(red,green,blue);
            label.setTextFill(color);
        }
    }*/
}

