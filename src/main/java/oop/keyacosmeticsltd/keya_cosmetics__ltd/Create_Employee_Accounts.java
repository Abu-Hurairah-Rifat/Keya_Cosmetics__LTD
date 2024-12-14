package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class Create_Employee_Accounts {

    @FXML
    private TableColumn<Employee, String> columnContact;

    @FXML
    private TableColumn<Employee, String> columnEmail;

    @FXML
    private TableColumn<Employee, String> columnID;

    @FXML
    private TableColumn<Employee, String> columnName;

    @FXML
    private TableView<Employee> employeeTable;

    @FXML
    private TextField newEmployeeContact;

    @FXML
    private TextField newEmployeeEmail;

    @FXML
    private TextField newEmployeeID;

    @FXML
    private TextField newEmployeeName;

    private ObservableList<Employee> employeeList;

    private static final String FILE_PATH = "employees.bin";

    @FXML
    public void initialize() {
        // Set up columns in the TableView
        columnID.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        columnName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        columnEmail.setCellValueFactory(cellData -> cellData.getValue().emailProperty());
        columnContact.setCellValueFactory(cellData -> cellData.getValue().contactProperty());

        employeeList = FXCollections.observableArrayList();
        employeeTable.setItems(employeeList);
    }

    @FXML
    void addEmployeeButton(ActionEvent event) {
        String employeeID = newEmployeeID.getText().trim();
        String employeeName = newEmployeeName.getText().trim();
        String employeeEmail = newEmployeeEmail.getText().trim();
        String employeeContact = newEmployeeContact.getText().trim();

        if (employeeID.isEmpty() || employeeName.isEmpty() || employeeEmail.isEmpty() || employeeContact.isEmpty()) {
            showAlert("Error", "All fields are required. Please fill in all the details.", Alert.AlertType.ERROR);
            return;
        }

        if (!isValidEmail(employeeEmail)) {
            showAlert("Error", "Invalid email format. Please enter a valid email.", Alert.AlertType.ERROR);
            return;
        }

        if (!isValidContact(employeeContact)) {
            showAlert("Error", "Invalid contact number. Please enter a valid 10-digit contact number.", Alert.AlertType.ERROR);
            return;
        }

        Employee newEmployee = new Employee(employeeID, employeeName, employeeEmail, employeeContact);
        employeeList.add(newEmployee);

        showAlert("Success", "Employee account has been created successfully.", Alert.AlertType.INFORMATION);
        clearForm();
    }

    @FXML
    void backButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HR Manager/HR_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    void loadFromFile(ActionEvent event) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            @SuppressWarnings("unchecked")
            ArrayList<Employee> loadedList = (ArrayList<Employee>) ois.readObject();
            employeeList.clear();
            employeeList.addAll(loadedList);
            showAlert("Success", "Employee data loaded successfully.", Alert.AlertType.INFORMATION);
        } catch (FileNotFoundException e) {
            showAlert("Error", "No saved data found to load.", Alert.AlertType.ERROR);
        } catch (IOException | ClassNotFoundException e) {
            showAlert("Error", "Failed to load employee data: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    void saveToFile(ActionEvent event) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(new ArrayList<>(employeeList));
            showAlert("Success", "Employee data saved successfully.", Alert.AlertType.INFORMATION);
        } catch (IOException e) {
            showAlert("Error", "Failed to save employee data: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    private boolean isValidContact(String contact) {
        return contact.matches("\\d{10}");
    }

    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearForm() {
        newEmployeeID.clear();
        newEmployeeName.clear();
        newEmployeeEmail.clear();
        newEmployeeContact.clear();
    }

    public static class Employee implements Serializable {
        private static final long serialVersionUID = 1L;

        private final String id;
        private final String name;
        private final String email;
        private final String contact;

        public Employee(String id, String name, String email, String contact) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.contact = contact;
        }

        // Getters
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getContact() {
            return contact;
        }

        // Property methods for JavaFX TableView binding
        public javafx.beans.property.StringProperty idProperty() {
            return new javafx.beans.property.SimpleStringProperty(id);
        }

        public javafx.beans.property.StringProperty nameProperty() {
            return new javafx.beans.property.SimpleStringProperty(name);
        }

        public javafx.beans.property.StringProperty emailProperty() {
            return new javafx.beans.property.SimpleStringProperty(email);
        }

        public javafx.beans.property.StringProperty contactProperty() {
            return new javafx.beans.property.SimpleStringProperty(contact);
        }

    }
}
