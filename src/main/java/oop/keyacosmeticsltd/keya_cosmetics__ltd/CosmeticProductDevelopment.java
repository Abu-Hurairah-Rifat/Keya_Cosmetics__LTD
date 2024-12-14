package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CosmeticProductDevelopment {

    @FXML
    private TableColumn<?, ?> budgetcolumn;

    @FXML
    private TableColumn<?, ?> categorycolumn;

    @FXML
    private TextField estimatedbudgetTextfield;

    @FXML
    private CheckBox haircarecheckbox;

    @FXML
    private CheckBox makeupcheckbox;

    @FXML
    private CheckBox menoptioncheckbox;

    @FXML
    private TextField productnameTextfield;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private CheckBox skincarecheckbox;

    @FXML
    private TableView<?> tableviewfordetails;

    @FXML
    private TableColumn<?, ?> targetaudiencecolumn;

    @FXML
    private CheckBox teenagercheckbox;

    @FXML
    private CheckBox womencheckbox;

    @FXML
    void backonactionbutton(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Product Development Manager/Product Develop Manager Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void clearonactionbutton(ActionEvent event) {

    }

    @FXML
    void submitonactionbutton(ActionEvent event) {

    }

}
