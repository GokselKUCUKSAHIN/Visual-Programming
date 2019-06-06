package edu.erciyes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class FindGrade extends Application
{
    private TextField tfId = new TextField();
    private TextField tfCourseId = new TextField();
    private Button btnFind = new Button("Find");
    private Label label = new Label();


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        GridPane root = new GridPane();
        root.add(new Label ("Student Id: "),0,0);
        root.add(tfId,1,0);
        root.add(new Label("Couse ID: "),0,1);
        root.add(tfCourseId,1,1);
        root.add(btnFind,1,2);
        root.add(label,1,3);
        primaryStage.setScene(new Scene(root,400,400));
        primaryStage.setTitle("Find Grade");
        primaryStage.show();
    }
    private void initializeDB()
    {
        String connString = "";
    }
}
