package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.omg.CORBA.CODESET_INCOMPATIBLE;


public class JavaFXControls extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {
        Text text = new Text(50, 50, "BZ214 Visual Programming");
        text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR,20));
        Pane paneText = new Pane();
        paneText.getChildren().addAll(text);
        //
        HBox paneButtons = new HBox();
        Button btnLeft = new Button("Left", new ImageView("file:figures/left.png"));
        Button btnRight = new Button("Right", new ImageView("file:figures/right.png"));
        paneButtons.setAlignment(Pos.CENTER);
        paneButtons.setSpacing(10);
        paneButtons.getChildren().addAll(btnLeft, btnRight);
        //

        btnLeft.setOnMouseClicked(e -> {
            text.setX(text.getX() - 10);
        });
        btnRight.setOnMouseClicked(e -> {
            text.setX(text.getX() + 10);
        });
        //
        VBox paneCheck = new VBox();
        paneCheck.setSpacing(10);
        CheckBox chkBold = new CheckBox("Bold");
        CheckBox chkItalic = new CheckBox("Italic");
        paneCheck.getChildren().addAll(chkBold,chkItalic);
        //
        EventHandler<ActionEvent> handler = e->{
            if(chkBold.isSelected() && chkItalic.isSelected())
            {
                text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
            }
            else if(chkBold.isSelected())
            {
                text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR,20));
            }
            else if(chkItalic.isSelected())
            {
                text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC,20));
            }
            else
            {
                text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR,20));
            }
        };
        //
        chkBold.setOnAction(handler);
        chkItalic.setOnAction(handler);
        //
        VBox paneRadio = new VBox();
        paneRadio.setSpacing(10);
        paneButtons.setPadding(new Insets(10,10,10,10));
        RadioButton rbRed = new RadioButton("RED");
        RadioButton rbBlue = new RadioButton("BLUE");
        RadioButton rbGreen = new RadioButton("GREEN");
        ToggleGroup group = new ToggleGroup();
        rbBlue.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbRed.setToggleGroup(group);
        paneRadio.getChildren().addAll(rbRed,rbGreen,rbBlue);
        //
        rbRed.setOnAction(e->{
            text.setFill(Color.RED);
        });
        rbGreen.setOnAction(e->{
            text.setFill(Color.GREEN);
        });
        rbBlue.setOnAction(e->{
            text.setFill(Color.BLUE);
        });
        //
        HBox paneField = new HBox();
        paneField.setAlignment(Pos.CENTER);
        paneField.setSpacing(10);
        Label label = new Label("Enter a new text");
        TextField textField = new TextField();
        paneField.getChildren().addAll(label,textField);
        //
        textField.setOnAction(e->{
            text.setText(textField.getText());
        });
        //
        BorderPane root = new BorderPane();
        root.setCenter(paneText);
        root.setBottom(paneButtons);
        root.setRight(paneCheck);
        root.setLeft(paneRadio);
        root.setTop(paneField);
        stage.setTitle("JavaFX Controls");
        stage.setScene(new Scene(root, 500, 200));
        stage.show();
    }
}
