package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DistributorManagementController$ {

    @FXML
    private TextField amountField;

    @FXML
    private Label amountLabel;

    @FXML
    private TableColumn<DistributorManagementController$, String> amountTable;

    @FXML
    private RadioButton completedRadioButton;

    @FXML
    private TextField dateField;

    @FXML
    private Label dateLabel;

    @FXML
    private TableColumn<DistributorManagementController$, String> dateTable;

    @FXML
    private TextField distributorNameField;

    @FXML
    private Label distributorNameLabel;

    @FXML
    private TableColumn<DistributorManagementController$, String> distributorNameTable;

    @FXML
    private RadioButton pendingRadioButton;

    @FXML
    private TextField phoneNoField;

    @FXML
    private Label phoneNoLabel;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<DistributorManagementController$, String> statusTable;

    @FXML
    private TableView<DistributorManagementController$> table;

    @FXML
    private Label tittleDistributorManagementPanel;

    @FXML
    private AnchorPane view;

    @FXML
    void backButtonAction(ActionEvent event) {

    }

    @FXML
    void saveButtonAction(ActionEvent event) {

    }

    @FXML
    void updateButtonAction(ActionEvent event) {

    }

}

