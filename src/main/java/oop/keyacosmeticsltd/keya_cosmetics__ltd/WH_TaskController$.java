package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

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
    void backButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Warehouse Manager Dashboard $.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void rasetButtonAction(ActionEvent event) {

    }

    @FXML
    void saveButtonAction(ActionEvent event) {

    }

}

