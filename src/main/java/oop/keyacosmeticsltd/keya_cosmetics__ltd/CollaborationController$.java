package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CollaborationController$ {

    @FXML
    private CheckBox approveMarketMaterialCheckbox;

    @FXML
    private TextField campaignNameField;

    @FXML
    private Label campaignNameLabel;

    @FXML
    private TableColumn<CollaborationController$,String> campaignNameTable;

    @FXML
    private Label dateLabel;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<CollaborationController$,String> dateTable;

    @FXML
    private TextArea goalsArea;

    @FXML
    private Label goalsLabel;

    @FXML
    private TableColumn<CollaborationController$,String> goalsTable;

    @FXML
    private CheckBox organizeInStoreEventsCheckBox;

    @FXML
    private CheckBox promotionCheckBox;

    @FXML
    private CheckBox reviewCampaignPerformanceCheckBox;

    @FXML
    private TableView<CollaborationController$> tableView;

    @FXML
    private Label teamCollaborationLabel;

    @FXML
    private Label tittleMarketingCollaborationPanel;

    @FXML
    private AnchorPane view;

    @FXML
    void backButtonAction(ActionEvent event) {

    }

    @FXML
    void clearButtonAction(ActionEvent event) {

    }

    @FXML
    void submitButtonAction(ActionEvent event) {

    }

}

