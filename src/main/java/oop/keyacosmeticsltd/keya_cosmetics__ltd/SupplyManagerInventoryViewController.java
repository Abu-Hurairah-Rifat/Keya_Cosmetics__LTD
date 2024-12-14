package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class SupplyManagerInventoryViewController
{
    @javafx.fxml.FXML
    private TableColumn<SupplyManagerInventoryView, String> productNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<SupplyManagerInventoryView, String> catagortTableColumn;
    @javafx.fxml.FXML
    private TableColumn<SupplyManagerInventoryView, String> quantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<SupplyManagerInventoryView, String> ItemIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<SupplyManagerInventoryView, LocalDate> purchaseDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<SupplyManagerInventoryView, String> ppuTableColumn;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TableView<SupplyManagerInventoryView> materialsTableView;

    private ArrayList<AccountantInventory> materialList = new ArrayList<>();

    private void loadMaterialListFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("materialList.bin"))) {
            materialList = (ArrayList<AccountantInventory>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void initialize() {
        loadMaterialListFromFile();
       // materialsTableView.getItems().setAll(materialList);


        purchaseDateTableColumn.setCellValueFactory(new PropertyValueFactory<SupplyManagerInventoryView, LocalDate>("storedDate"));
        productNameTableColumn.setCellValueFactory(new PropertyValueFactory<SupplyManagerInventoryView, String>("itemName"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<SupplyManagerInventoryView, String>("quantity"));
        catagortTableColumn.setCellValueFactory(new PropertyValueFactory<SupplyManagerInventoryView, String>("category"));
        ppuTableColumn.setCellValueFactory(new PropertyValueFactory<SupplyManagerInventoryView, String>("ppu"));
        productNameTableColumn.setCellValueFactory(new PropertyValueFactory<SupplyManagerInventoryView, String>("productID"));



    }

    @javafx.fxml.FXML
    public void searchOnClick(ActionEvent actionEvent) {
        int s = Integer.parseInt(searchTextField.getText());
        //for(m:materialList){}
    }

    @javafx.fxml.FXML
    public void showMaterialsInStorageOnClick(ActionEvent actionEvent) {
    }
}