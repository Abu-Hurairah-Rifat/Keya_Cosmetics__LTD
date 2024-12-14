package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    void backonactionbutton(ActionEvent event) {

    }

    @FXML
    void removeonactionbutton(ActionEvent event) {

    }

}
