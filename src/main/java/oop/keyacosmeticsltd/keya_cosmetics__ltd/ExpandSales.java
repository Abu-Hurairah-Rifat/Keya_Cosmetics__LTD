package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ExpandSales {

    @FXML
    private TableColumn<?, ?> budgetcolumn;

    @FXML
    private TextField budgettextfield;

    @FXML
    private TableColumn<?, ?> channelcolumn;

    @FXML
    private TableView<?> detailstableview;

    @FXML
    private TableColumn<?, ?> durationcolumn;

    @FXML
    private DatePicker enddatepicker;

    @FXML
    private Label headlinelabe;

    @FXML
    private TableColumn<?, ?> regioncolumn;

    @FXML
    private TextField regionnametextfield;

    @FXML
    private TableColumn<?, ?> salesgoalcolumn;

    @FXML
    private TextField salesgoaltextfield;

    @FXML
    private DatePicker stratdatepicker;

    @FXML
    private TextField targetchanneltextfield;

    @FXML
    void backonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sales Manager/Sales_Manager_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void generateplanonactionbutton(ActionEvent event) {

    }

    @FXML
    void saveexpansiononactionbutton(ActionEvent event) {

    }

}
