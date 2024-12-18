package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class logInPageController
{
    @javafx.fxml.FXML
    private ImageView keyaCosmeticsLogo;
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private PasswordField passwordTextField;
    @javafx.fxml.FXML
    private ComboBox roleComboBox;

    @javafx.fxml.FXML
    public void initialize() {

        roleComboBox.getItems().addAll("Accountant", "Supply Manager");

    }


    @javafx.fxml.FXML
    public void logInOnClick(ActionEvent actionEvent) {
        // Check if a role is selected
        String role = roleComboBox.getValue().toString();
        if (role == null) {
            System.out.println("Please select a role.");
            return;
        }

        try {
            FXMLLoader fxmlLoader;
            Stage stage = new Stage();
            Scene scene;


            if (role.equals("Accountant")) {
                fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant_dashboard.fxml"));
            } else if (role.equals("Supply Manager")) {
                fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupplyManager_dashboard.fxml"));
            } else {
                System.out.println("Invalid role selected.");
                return;
            }


            scene = new Scene(fxmlLoader.load());
            stage.setTitle("Keya Cosmetics - " + role);
            stage.setScene(scene);
            stage.show();


            Stage currentStage = (Stage) roleComboBox.getScene().getWindow();
            currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void goToSignUpPageOnClick(ActionEvent actionEvent) {

    }
}
