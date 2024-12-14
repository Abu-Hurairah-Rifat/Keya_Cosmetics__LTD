package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

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
    void backButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Retail Manager DashBoard $.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void clearButtonAction(ActionEvent event) {

    }

    @FXML
    void submitButtonAction(ActionEvent event) {

    }

}

