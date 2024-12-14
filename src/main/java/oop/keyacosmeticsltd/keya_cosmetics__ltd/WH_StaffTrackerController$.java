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

public class WH_StaffTrackerController$ {

    @FXML
    private RadioButton completedRadioButton;

    @FXML
    private Label dateLabel;

    @FXML
    private TableColumn<WH_StaffTrackerController$,String> dateTable;

    @FXML
    private TextField hireField;

    @FXML
    private RadioButton inProgressRadioButton;

    @FXML
    private CheckBox loaderCheckbox;

    @FXML
    private Label nameLabel;

    @FXML
    private TableColumn<WH_StaffTrackerController$,String> nameTable;

    @FXML
    private RadioButton notStartedRadioButton;

    @FXML
    private CheckBox pickerChechBox;

    @FXML
    private Label positionLabel;

    @FXML
    private TableColumn<WH_StaffTrackerController$,String> positonTable;

    @FXML
    private TextField staffNameField;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<WH_StaffTrackerController$,String> statusTable;

    @FXML
    private CheckBox superviserCheckbox;

    @FXML
    private TableView<WH_StaffTrackerController$> table;

    @FXML
    private Label tittleWarehouseStaffTracker;

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
    void removeButtonAction(ActionEvent event) {

    }

    @FXML
    void saveButtonAction(ActionEvent event) {

    }

}

