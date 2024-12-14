package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class WH_StockCenter$ {

    @FXML
    private TextField customerNameField;

    @FXML
    private TextField dateField;

    @FXML
    private TableColumn<WH_StockCenter$,String> dateTable;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<WH_StockCenter$,String> nameTable;

    @FXML
    private TableColumn<WH_StockCenter$,String> pNameTable;

    @FXML
    private TableColumn<WH_StockCenter$,String> pQuantityRTable;

    @FXML
    private TextField quantityField;

    @FXML
    private TableColumn<WH_StockCenter$,String> quantityTable;

    @FXML
    private TextField recordLabel;

    @FXML
    private TableColumn<WH_StockCenter$,String> recordTable;

    @FXML
    private TextField stockQuantityField;

    @FXML
    private TableView<WH_StockCenter$> table1;

    @FXML
    private TableView<WH_StockCenter$> table2;

    @FXML
    private Label tittleWarehouseStockAndOrderManagement;

    @FXML
    private AnchorPane view;

    @FXML
    void addButtonAction(ActionEvent event) {

    }

    @FXML
    void backButtonAction(ActionEvent event) {

    }

    @FXML
    void resetButtonAction(ActionEvent event) {

    }

}

