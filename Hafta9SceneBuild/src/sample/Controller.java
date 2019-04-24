package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller
{

    @FXML
    protected Label lblResult;
    @FXML
    protected Button btnSave;
    @FXML
    protected TextField txtName;
    @FXML
    protected void save()
    {
        lblResult.setText("Welcome "+ txtName.getText());

    }

}
