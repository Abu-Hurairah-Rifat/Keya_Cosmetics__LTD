package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Product_Development_Controller {

    @FXML
    private Label titlelabel;

    private void switchScene(ActionEvent event, String fxmlFile, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle(title);

            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Collaborateonactionbutton(ActionEvent event) {
        switchScene(event, "Collaborate.fxml", "Product Development - Collaborate");
    }

    @FXML
    void CompetitiveAnalysisonactionbutton(ActionEvent event) {
        switchScene(event, "Competitive_Analysis.fxml", "Product Development - Competitive Analysis");
    }

    @FXML
    void Improvingonactionbutton(ActionEvent event) {
        switchScene(event, "Improving.fxml", "Product Development - Improving");
    }

    @FXML
    void Manageproducttestingonactionbutton(ActionEvent event) {
        switchScene(event, "Manage_Product_Testing.fxml", "Product Development - Manage Product Testing");
    }

    @FXML
    void budgetsforproductdevelopmentonactionbutton(ActionEvent event) {
        switchScene(event, "Budgets for Product Development.fxml", "Product Development - Budgets");
    }

    @FXML
    void develpnewcosmeticonactionbutton(ActionEvent event) {
        switchScene(event, "Develop New Cosmetic.fxml", "Product Development - Develop New Cosmetic");
    }

    @FXML
    void innovationpipelineManagementonactionbutton(ActionEvent event) {
        switchScene(event, "Innovation Pipeline Management.fxml", "Product Development - Innovation Pipeline Management");
    }

    @FXML
    void logoutonactionbutton(ActionEvent event) {
        // Implement your logout functionality here, such as returning to a login screen
        switchScene(event, "Login.fxml", "Login");
    }

    @FXML
    void packagingonactionbutton(ActionEvent event) {
        switchScene(event, "Packaging.fxml", "Product Development - Packaging");
    }
}
