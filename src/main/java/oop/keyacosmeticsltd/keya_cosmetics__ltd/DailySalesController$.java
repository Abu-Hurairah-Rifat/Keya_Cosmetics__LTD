package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DailySalesController$ {

@FXML
private TextField nameField;

@FXML
private Label nameLabel;

@FXML
private TableColumn<DailySalesController$,String> nameTable;

@FXML
private TableView<DailySalesController$> table;

@FXML
private Label tittleDailySalesView;

@FXML
private TextField totalSaleField;

@FXML
private Label totalSaleLabel;

@FXML
private TextField unitSoldField;

@FXML
private Label unitSoldLabel;

@FXML
private TableColumn<DailySalesController$,String> unitSoldTable;

@FXML
private TextField valueField;

@FXML
private Label valueLabel;

@FXML
private TableColumn<DailySalesController$,String> valueTable;

@FXML
private AnchorPane view;

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

@FXML
void enterButtonAction(ActionEvent event) {

}

}
