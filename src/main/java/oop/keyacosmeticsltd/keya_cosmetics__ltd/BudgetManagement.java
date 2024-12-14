package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class BudgetManagement {

    @FXML
    private DatePicker allocationdatePicker;

    @FXML
    private TableColumn<BudgetDetailsM, String> allocationdatecolumn;

    @FXML
    private TableColumn<BudgetDetailsM, String> budegetcolumn;

    @FXML
    private TextField budgettextfeild;

    @FXML
    private ComboBox<String> deptCombobox;

    @FXML
    private TableColumn<BudgetDetailsM, String> deptcolumn;

    @FXML
    private TableColumn<BudgetDetailsM, String> productnamecolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TableView<BudgetDetailsM> tableviewfordetails;

    @FXML
    private Label titlelabel;


    private final ObservableList<BudgetDetailsM> budgetDetailsList = FXCollections.observableArrayList();



    @FXML
    void addbudgrtonactionbutton(ActionEvent event) {
        String productName = productnametextfield.getText().trim();
        String budgetText = budgettextfeild.getText().trim();
        String department = deptCombobox.getValue();
        String allocationDate = (allocationdatePicker.getValue() != null) ? allocationdatePicker.getValue().toString() : null;

        if (productName.isEmpty() || budgetText.isEmpty() || department == null || allocationDate == null) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled!");
            return;
        }

        try {
            double budget = Double.parseDouble(budgetText);
            BudgetDetailsM newBudget = new BudgetDetailsM(productName, budget, department, allocationDate);
            budgetDetailsList.add(newBudget);
            clearFields();
            showAlert(Alert.AlertType.INFORMATION, "Success", "Budget added successfully!");

        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Budget must be a valid number!");
        }
    }

    private void clearFields() {
    }

    private void showAlert(Alert.AlertType alertType, String inputError, String s) {
    }


    @FXML
    void backonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Product Development Manager/Product Develop Manager Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void clearbuttononactionbutton(ActionEvent event) {
        productnametextfield.clear();
        budgettextfeild.clear();
        deptCombobox.setValue(null);
        allocationdatePicker.setValue(null);

    }

    @FXML
    void removebudgetonactionbutton(ActionEvent event) {
        BudgetDetailsM selectedBudget = tableviewfordetails.getSelectionModel().getSelectedItem();

        if (selectedBudget != null) {
            budgetDetailsList.remove(selectedBudget);
            showAlert(Alert.AlertType.INFORMATION, "Success", "Budget entry removed successfully!");
        } else {
            showAlert(Alert.AlertType.WARNING, "Selection Error", "Please select a budget entry to remove.");
        }


    }
    @FXML
    public void initialize() {
        deptCombobox.getItems().addAll("Marketing", "R&D", "Production", "Sales", "Logistics");
        productnamecolumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        budegetcolumn.setCellValueFactory(new PropertyValueFactory<>("budget"));
        deptcolumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        allocationdatecolumn.setCellValueFactory(new PropertyValueFactory<>("allocationDate"));
        tableviewfordetails.setItems(budgetDetailsList);
    }
}




