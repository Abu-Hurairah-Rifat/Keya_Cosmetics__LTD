package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WH_CleanlinessController$ {

    @FXML
    private CheckBox ClearFloorsChecklist;

    @FXML
    private RadioButton averageRadioButton;

    @FXML
    private Label checkLabel;

    @FXML
    private TableColumn<WH_CleanlinessController$,String> dateTable;

    @FXML
    private CheckBox fireSafetyChecklist;

    @FXML
    private RadioButton goodRadioButton;

    @FXML
    private TextField inspectionDateField;

    @FXML
    private Label inspectionDateLabel;

    @FXML
    private TextField inspectorNameField;

    @FXML
    private Label inspectorNameLabel;

    @FXML
    private TableColumn<WH_CleanlinessController$,String> inspectorNameTable;

    @FXML
    private RadioButton poorRadioButton;

    @FXML
    private TableColumn<WH_CleanlinessController$,String> rateTable;

    @FXML
    private Label ratingLabel;

    @FXML
    private CheckBox storedEquipmentChecklist;

    @FXML
    private TableView<WH_CleanlinessController$> table;

    @FXML
    private Label tittleWarehouseSafetyAndCleanlinessPanel;

    @FXML
    private AnchorPane view;

    @FXML
    void backbuttonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Warehouse Manager Dashboard $.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void resetButtonAction(ActionEvent event) {

    }

    @FXML
    void saveButtonAction(ActionEvent event) {

    }

}
