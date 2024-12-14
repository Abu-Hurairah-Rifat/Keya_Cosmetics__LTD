package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class WH_TaskController$ {

    @FXML
    private TextField assignedEmployeeField;

    @FXML
    private Label assignedEmployeeLabel;

    @FXML
    private TableColumn<WH_TaskController$,String> assignedEmployeeTable;

    @FXML
    private CheckBox damagedItemsReportedCheckBox;

    @FXML
    private TextField dateField;

    @FXML
    private Label dateLabel;

    @FXML
    private TableColumn<WH_TaskController$,String> dateTable;

    @FXML
    private CheckBox expiredStockCheckBox;

    @FXML
    private CheckBox goodConditionCheckBox;

    @FXML
    private Label inventoryStatusLabel;

    @FXML
    private TableColumn<WH_TaskController$,String> inventoryStatusTable;

    @FXML
    private TextField nameField;

    @FXML
    private Label nameLabel;

    @FXML
    private TableView<WH_TaskController$> table;

    @FXML
    private TableColumn<WH_TaskController$,String> taskNameTable;

    @FXML
    private Label tittleWarehouseManagementPanel;

    @FXML
    private AnchorPane view;

    @FXML
    void backButtonAction(ActionEvent event) {

    }

    @FXML
    void rasetButtonAction(ActionEvent event) {

    }

    @FXML
    void saveButtonAction(ActionEvent event) {

    }

}

