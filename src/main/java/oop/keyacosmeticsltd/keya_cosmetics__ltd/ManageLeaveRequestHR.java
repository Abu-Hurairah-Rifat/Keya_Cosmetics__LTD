package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageLeaveRequestHR {

    @FXML
    private TextField employeeID;

    @FXML
    private TextField reason;

    @FXML
    private ChoiceBox<String> status;

    @FXML
    public void initialize() {
        // Initialize the status ChoiceBox with predefined leave statuses
        status.getItems().addAll("Approved", "Pending", "Rejected");
    }

    @FXML
    void backButton(ActionEvent event) throws IOException {
        // Navigate back to the HR dashboard
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HR Manager/HR_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    void submitButton(ActionEvent event) {
        // Retrieve input values
        String enteredEmployeeID = employeeID.getText();
        String enteredReason = reason.getText();
        String selectedStatus = status.getValue();

        // Validate input
        if (enteredEmployeeID.isEmpty() || enteredReason.isEmpty() || selectedStatus == null) {
            showAlert("Error", "All fields must be filled!", Alert.AlertType.ERROR);
            return;
        }

        // Simulate saving the leave request
        boolean isSaved = saveLeaveRequest(enteredEmployeeID, enteredReason, selectedStatus);

        if (isSaved) {
            showAlert("Success", "Leave request has been processed successfully.", Alert.AlertType.INFORMATION);
            // Optionally, clear the form
            clearForm();
        } else {
            showAlert("Error", "Failed to process the leave request. Please try again.", Alert.AlertType.ERROR);
        }
    }

    /**
     * Simulates saving the leave request to the database or a system.
     *
     * @param employeeID   The ID of the employee.
     * @param reason       The reason for the leave.
     * @param selectedStatus The status of the leave request.
     * @return true if the save operation is successful, otherwise false.
     */
    private boolean saveLeaveRequest(String employeeID, String reason, String selectedStatus) {
        // Simulate saving the data to a database or system
        // For now, we assume the operation is always successful
        System.out.println("Leave Request Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Reason: " + reason);
        System.out.println("Status: " + selectedStatus);
        return true; // Simulate successful save
    }

    /**
     * Displays an alert dialog with the given title, message, and type.
     *
     * @param title   The title of the alert dialog.
     * @param message The content of the alert dialog.
     * @param alertType The type of alert to display.
     */
    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Clears the input fields and resets the ChoiceBox.
     */
    private void clearForm() {
        employeeID.clear();
        reason.clear();
        status.setValue(null);
    }
}
