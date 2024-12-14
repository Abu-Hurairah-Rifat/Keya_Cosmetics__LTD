package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerInquiriesController$ {

    @FXML
    private AnchorPane complainView;

    @FXML
    private TextField customerNameField;

    @FXML
    private Label customerNameLabel;

    @FXML
    private TextArea feedBackArea;

    @FXML
    private Label feedbackLabel;

    @FXML
    private TableColumn<CustomerInquiriesController$,String> feedbackTable;

    @FXML
    private TextArea inquiryArea;

    @FXML
    private Label inquiryLabel;

    @FXML
    private TableColumn<CustomerInquiriesController$,String> inquiryTable;

    @FXML
    private TableColumn<CustomerInquiriesController$,String> nameTable;

    @FXML
    private RadioButton noRadioButton;

    @FXML
    private TableColumn<CustomerInquiriesController$,String> resolveTable;

    @FXML
    private Label resolvedLabel;

    @FXML
    private TableView<CustomerInquiriesController$> tableField;

    @FXML
    private Label tittleCustomerInquiriesPanel;

    @FXML
    private RadioButton yesRadioButton;

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
    void resetButtonAction(ActionEvent event) {

    }

    @FXML
    void resolveButtonAction(ActionEvent event) {

    }

}

