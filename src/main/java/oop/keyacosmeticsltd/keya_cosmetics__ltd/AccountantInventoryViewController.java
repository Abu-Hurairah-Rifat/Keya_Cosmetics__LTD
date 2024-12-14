package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class AccountantInventoryViewController
{
    @javafx.fxml.FXML
    private TextField itemNameTextField;
    @javafx.fxml.FXML
    private TableColumn<AccountantJournal, LocalDate> ppDateTableColumn;
    @javafx.fxml.FXML
    private RadioButton productRadioButton;
    @javafx.fxml.FXML
    private RadioButton materialRadioButton;
    @javafx.fxml.FXML
    private TextField itemQuantityTextField;
    @javafx.fxml.FXML
    private TableColumn<AccountantJournal, String> productNameTableColumn;
    @javafx.fxml.FXML
    private DatePicker storedDateDatePicker;
    @javafx.fxml.FXML
    private TextField itemCategoryTextField;
    @javafx.fxml.FXML
    private TableColumn<AccountantJournal, String> quantityTableColumn;
    @javafx.fxml.FXML
    private TableView<AccountantInventory> inventoryStatusTableView;
    @javafx.fxml.FXML
    private TableColumn<AccountantJournal, String> ppuTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AccountantJournal, String> categoryTableColumn;
    @javafx.fxml.FXML
    private TextField itemppuTextField;

    ArrayList<AccountantInventory> materialList = new ArrayList<AccountantInventory>();
    ArrayList<AccountantInventory> productList = new ArrayList<AccountantInventory>();
    ToggleGroup tgg;

    @javafx.fxml.FXML
    public void initialize() {
        tgg = new ToggleGroup();
        materialRadioButton.setToggleGroup(tgg);
        productRadioButton.setToggleGroup(tgg);

        storedDateDatePicker.setValue(LocalDate.now());

        ppDateTableColumn.setCellValueFactory(new PropertyValueFactory<AccountantJournal, LocalDate>("storedDate"));
        productNameTableColumn.setCellValueFactory(new PropertyValueFactory<AccountantJournal, String>("itemName"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<AccountantJournal, String>("quantity"));
        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<AccountantJournal, String>("category"));
        ppuTableColumn.setCellValueFactory(new PropertyValueFactory<AccountantJournal, String>("ppu"));
    }

    @javafx.fxml.FXML
    public void fifoOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void lifoOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showMaterialsInStorageOnClick(ActionEvent actionEvent) {
        inventoryStatusTableView.getItems().clear();
        inventoryStatusTableView.getItems().setAll(materialList);
    }

    @javafx.fxml.FXML
    public void showProductToSellOnClick(ActionEvent actionEvent) {
        inventoryStatusTableView.getItems().clear();
        inventoryStatusTableView.getItems().setAll(productList);
    }

    private void saveMaterialListToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("materialList.bin"))) {
            oos.writeObject(materialList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void saveProductListToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productList.bin"))) {
            oos.writeObject(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void addToInventoryOnClick(ActionEvent actionEvent) {
        AccountantInventory newEntry = new AccountantInventory(
                itemNameTextField.getText(),
                itemCategoryTextField.getText(),
                storedDateDatePicker.getValue(),
                Integer.parseInt(itemQuantityTextField.getText()),
                Integer.parseInt(itemppuTextField.getText())
        );

        if (materialRadioButton.isSelected()) {
            materialList.add(newEntry);
            saveMaterialListToFile();
        }
        else {
            productList.add(newEntry);
            saveProductListToFile();
        }






    }
}