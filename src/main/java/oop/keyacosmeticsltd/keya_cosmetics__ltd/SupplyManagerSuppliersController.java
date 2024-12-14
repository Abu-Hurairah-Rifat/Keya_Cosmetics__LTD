package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SupplyManagerSuppliersController
{
    @javafx.fxml.FXML
    private TableColumn productNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn unitPriceTableColumn;
    @javafx.fxml.FXML
    private TableView supplierTableView;
    @javafx.fxml.FXML
    private ComboBox suppliereComboBox;
    @javafx.fxml.FXML
    private TableColumn deliveryTimeTableColumn;
    @javafx.fxml.FXML
    private TableColumn categoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn supplierRatingTableColumn;
    @javafx.fxml.FXML
    private TextField catagoryTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sortByDelivaryTimeOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sortByPriceOnClick(ActionEvent actionEvent) {
    }
}