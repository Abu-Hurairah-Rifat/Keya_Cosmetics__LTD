package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CleanAndSafetyPanel$ {

    @FXML
    private Label InspectionNotesLabel;

    @FXML
    private CheckBox averageCheckBox;

    @FXML
    private TextField dateField;

    @FXML
    private TableColumn<CleanAndSafetyPanel$,String> dateTable;

    @FXML
    private CheckBox goodCheckBox;

    @FXML
    private Label inspectionDateLabel;

    @FXML
    private TextField inspectorNameField;

    @FXML
    private Label inspectorNameLabel;

    @FXML
    private TableColumn<CleanAndSafetyPanel$,String> inspectorNameTable;

    @FXML
    private TextArea noteField;

    @FXML
    private CheckBox poorCheckBox;

    @FXML
    private TableColumn<CleanAndSafetyPanel$,String> rateTable;

    @FXML
    private Label ratingLabel;

    @FXML
    private AnchorPane storeCleanPanelView;

    @FXML
    private TableView<CleanAndSafetyPanel$> table;

    @FXML
    private Label tittleStoreCleanAndSafetyPanel;

    @FXML
    void BackbuttonAction(ActionEvent event) {

    }

    @FXML
    void resetButtonAction(ActionEvent event) {

    }

    @FXML
    void saveButtonAction(ActionEvent event) {

    }

}

