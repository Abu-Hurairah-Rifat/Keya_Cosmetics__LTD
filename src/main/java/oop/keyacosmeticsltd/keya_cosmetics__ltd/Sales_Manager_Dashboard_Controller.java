package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Sales_Manager_Dashboard_Controller {

    @FXML
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
    public void coordinationgtoMarketingactionbutton(ActionEvent event) {
        switchScene(event, "Coordinating To Marketing.fxml", "Sales Manager");
    }

    @FXML
    void createintensiveprogramactionbutton(ActionEvent event) {
        switchScene(event, "Create incentive Programs.fxml", "Sales Manager");
    }

    @FXML
    void establishsalestargetactionbutton(ActionEvent event) {
        switchScene(event, "Sales Target.fxml", "Sales Manager");
    }

    @FXML
    void expandsalesactionbutton(ActionEvent event) {
        switchScene(event, "Expand Sales.fxml", "Sales Manager");
    }

    @FXML
    void logoutonactionbutton(ActionEvent event) {
        // Add your logout functionality here
    }

    @FXML
    void managecustomeraccount(ActionEvent event) {
        switchScene(event, "Manage Customer Account.fxml", "Sales Manager");
    }

    @FXML
    void monitorsalesteamactionbutton(ActionEvent event) {
        switchScene(event, "Sales Team Performance.fxml", "Sales Manager");
    }

    @FXML
    void pricingstrategyactionbutton(ActionEvent event) {
        switchScene(event, "Pricing Strategy.fxml", "Sales Manager");
    }

    @FXML
    void retailpartnersanddistributorsactionbutton(ActionEvent event) {
        switchScene(event, "Manage Retail Partner and Distributor.fxml", "Sales Manager");
    }
}
