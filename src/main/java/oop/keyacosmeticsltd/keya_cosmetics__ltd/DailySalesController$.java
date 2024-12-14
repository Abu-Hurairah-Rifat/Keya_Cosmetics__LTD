package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
void backButtonAction(ActionEvent event) {

}

@FXML
void clearButtonAction(ActionEvent event) {

}

@FXML
void enterButtonAction(ActionEvent event) {

}

}
