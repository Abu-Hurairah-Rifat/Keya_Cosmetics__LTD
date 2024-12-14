package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class logInPage {

    @FXML
    private PasswordField password;

    @FXML
    private TextField userName;

    // Store user credentials and their corresponding FXML files
    private final Map<String, String> userCredentials = new HashMap<>();

    // Store user roles and their corresponding FXML pages
    private final Map<String, String> userPages = new HashMap<>();

    // Initialize user credentials and pages
    public logInPage() {
        // Add 8 users with their passwords
        userCredentials.put("HR Manager", "HR_Manager");
        userCredentials.put("Marketing Manager", "Marketing_Manager");
        userCredentials.put("Sales Manager", "Sales_Manager");
        userCredentials.put("Product Development", "Product_Development");
        userCredentials.put("Accountant", "Accountant");
        userCredentials.put("Supply and Logistic", "Supply_and_Logistic");
        userCredentials.put("Retail Store", "Retail_Store");
        userCredentials.put("Warehouse", "Warehouse");

        // Map users to their corresponding dashboard FXML files
        userPages.put("HR Manager", "HR Manager/HR_Dashboard.fxml");
        userPages.put("Marketing Manager", "Marketing Manager/marketing_Manager_Dashboard.fxml");
        userPages.put("Sales Manager", "Sales Manager/Sales_Manager_Dashboard.fxml");
        userPages.put("Product Development", "Product Development Manager/Product Develop Manager Dashboard.fxml");
        userPages.put("Accountant", "Accountant_dashboard.fxml");
        userPages.put("Supply and Logistic", "Staff Management Dashboard View.fxml");
        userPages.put("Retail Store", "Retail Manager DashBoard $.fxml");
        userPages.put("Warehouse", "Warehouse Manager Dashboard $.fxml");
    }

    @FXML
    void logIn(ActionEvent event) {
        // Get the username and password entered by the user
        String enteredUsername = userName.getText();
        String enteredPassword = password.getText();

        // Check if the username exists and the password matches
        if (userCredentials.containsKey(enteredUsername) && userCredentials.get(enteredUsername).equals(enteredPassword)) {
            try {
                // Load the corresponding page for the user
                String dashboardPath = userPages.get(enteredUsername);
                FXMLLoader loader = new FXMLLoader(getClass().getResource(dashboardPath));
                Parent parent = loader.load();

                // Get the current stage and set the new scene
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene newScene = new Scene(parent);
                currentStage.setScene(newScene);
                currentStage.show();
            } catch (IOException e) {
                showErrorAlert("Error", "Failed to load the dashboard for " + enteredUsername + ". Please check the FXML file.");
                e.printStackTrace();
            }
        } else {
            // Show an error message if the credentials are incorrect
            showErrorAlert("Login Failed", "Invalid username or password. Please try again.");
        }
    }

    /**
     * Displays an error alert dialog with a given title and message.
     *
     * @param title   The title of the alert dialog.
     * @param message The content of the alert dialog.
     */
    public void showErrorAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
