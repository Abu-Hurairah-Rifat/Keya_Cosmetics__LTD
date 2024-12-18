package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MonitorStockAbilityController$ {

    @FXML
    private TextField ProductNameField;

    @FXML
    private TextField dateField;

    @FXML
    private Label dateLabel;

    @FXML
    private TableColumn<MonitorStockAbilityController$,String> dateTable;

    @FXML
    private RadioButton inStockRadioButton;

    @FXML
    private RadioButton lowStockRadioButton;

    @FXML
    private RadioButton outOfStockRadioButton;

    @FXML
    private Label pNameLabel;

    @FXML
    private TableColumn<MonitorStockAbilityController$,String> pNameTable;

    @FXML
    private TextField priceField;

    @FXML
    private Label priceLabel;

    @FXML
    private TableColumn<MonitorStockAbilityController$,String> priceTable;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<MonitorStockAbilityController$,String> statusTable;

    @FXML
    private TableView<MonitorStockAbilityController$> table;

    @FXML
    private Label tittleInventoryManagement;

    @FXML
    private AnchorPane view;

    @FXML
    void addButtonAction(ActionEvent event) {

    }

    @FXML
    void backButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Retail Manager DashBoard $.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void clearButtonAction(ActionEvent event) {

    }

}

