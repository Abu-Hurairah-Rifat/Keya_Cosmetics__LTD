package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class WH_ShipmentManage$ {

    @FXML
    private TextField customerNameField;

    @FXML
    private Label customerNameLabel;

    @FXML
    private TableColumn<WH_ShipmentManage$,String> customerNameTable;

    @FXML
    private TextField dateField;

    @FXML
    private Label dateLabel;

    @FXML
    private TableColumn<WH_ShipmentManage$,String> dateTable;

    @FXML
    private CheckBox deliveredCheckBox;

    @FXML
    private CheckBox packedCheckBox;

    @FXML
    private CheckBox pendingCheckBox;

    @FXML
    private CheckBox shippedCheckBox;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<WH_ShipmentManage$,String> statusTable;

    @FXML
    private TableView<WH_ShipmentManage$> table;

    @FXML
    private Label tittleShipmentManagementPanel;

    @FXML
    private AnchorPane view;

    @FXML
    void backButtonAction(ActionEvent event) {

    }

    @FXML
    void clearButtonAction(ActionEvent event) {

    }

    @FXML
    void saveButtonAction(ActionEvent event) {

    }

}
