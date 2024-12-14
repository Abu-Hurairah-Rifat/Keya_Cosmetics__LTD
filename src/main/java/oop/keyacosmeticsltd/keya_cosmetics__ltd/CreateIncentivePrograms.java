package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateIncentivePrograms {

    @FXML
    private TableColumn<?, ?> budgetcolumn;

    @FXML
    private TextField budgettextfield;

    @FXML
    private TableColumn<?, ?> durationcolumn;

    @FXML
    private DatePicker enddatedatepicker;

    @FXML
    private TableView<?> generatetableview;

    @FXML
    private CheckBox monetarycheckbox;

    @FXML
    private CheckBox nonmonetarycheckbox;

    @FXML
    private TableColumn<?, ?> objectivecolumn;

    @FXML
    private TextField programNametextfield;

    @FXML
    private TableColumn<?, ?> programnamecolumn;

    @FXML
    private CheckBox recognitionbasedcheckbox;

    @FXML
    private TableColumn<?, ?> rewardcolumn;

    @FXML
    private TextField rewardvaluetextfield;

    @FXML
    private TextField salesvaluetextfield;

    @FXML
    private DatePicker startdatedatepicker;

    @FXML
    private TableColumn<?, ?> targetsalesvaluecolumn;

    @FXML
    void addonactionbutton(ActionEvent event) {

    }

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
    void removeonactionbutton(ActionEvent event) {

    }

}
