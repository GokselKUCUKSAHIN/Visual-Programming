package sample;

import com.sun.org.apache.xpath.internal.operations.Or;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXListViewExample extends Application
{

    private String[] departments = {"Bilgisayar", "Elektronik", "Mekatronik", "Makina"};   // String array that stores department titles
    private ImageView[] logos = {       //ImageView array that stores URLs of department's logos
            new ImageView("https://bm.erciyes.edu.tr/upload/ZTCPD1Beru_bilgisayar_muhendisligi_logo.png"),
            new ImageView("https://em.erciyes.edu.tr/upload/ADLWG6Meru_eletrik_elektronik_muhendisligi.png"),
            new ImageView("https://mekatronik.erciyes.edu.tr/upload/P1WVPK0umfs33geru_mekatronik_muhendisligi.fw.png"),
            new ImageView("https://me.erciyes.edu.tr/upload/2CYIM6327sidi6eru_makina_muhendisligi.png")
    };

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FlowPane imagePane = new FlowPane(10,10);

        ListView<String> lv = new ListView<>();
        lv.getItems().addAll(FXCollections.observableArrayList(departments));
        lv.setPrefSize(100, 400);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        lv.getSelectionModel().selectedItemProperty().addListener(
                ov -> { //Add the logos of the selected departments to the imagePane
                    imagePane.getChildren().clear();
                    for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
                        logos[i].setPreserveRatio(true);
                        logos[i].setFitHeight(75);
                        imagePane.getChildren().add(logos[i]);
                    }
                });

        //

        //
        BorderPane root = new BorderPane();
        root.setLeft(lv);
        root.setCenter(imagePane);
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();

    }
}
