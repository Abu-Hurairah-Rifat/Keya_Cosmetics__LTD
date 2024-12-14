package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WH_StoragePlannerController$ {

    @FXML
    private TextField availableSpaceField;

    @FXML
    private TextField itemsToStoreField;

    @FXML
    private Label itemsToStoreLabel;

    @FXML
    private Label spaceLabel;

    @FXML
    private TextField spacePerItemField;

    @FXML
    private Label spacePerItemLabel;

    @FXML
    private Label tittleWarehouseSpaceOptimization;

    @FXML
    private TextArea totalUseArea;

    @FXML
    private AnchorPane view;

    @FXML
    void backButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Warehouse Manager Dashboard $.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void calculateButtonAction(ActionEvent event) {

    }

    @FXML
    void saveButtonAction(ActionEvent event) {

    }

}
