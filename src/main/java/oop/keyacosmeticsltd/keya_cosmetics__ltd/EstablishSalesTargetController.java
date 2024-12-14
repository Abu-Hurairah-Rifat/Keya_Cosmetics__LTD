package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EstablishSalesTargetController  {

    @FXML
    private DatePicker deadlinedatepicker;

    @FXML
    private TableColumn<?, ?> descriptiontableview;

    @FXML
    private TableColumn<?, ?> impacttableview;

    @FXML
    private TableColumn<?, ?> prioritytableview;

    @FXML
    private TableView<?> tableview;

    @FXML
    private TextField targetnametextfield;

    @FXML
    private TextField targetvaluetextfield;

    @FXML
    void addactionbutton(ActionEvent event) {

    }

    @FXML
    void backonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sales Manager/Establish Sales Target.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void removeactionbutton(ActionEvent event) {

    }

}
