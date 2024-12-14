package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
    private TableColumn<?, ?> feedbackTable;

    @FXML
    private TextArea inquiryArea;

    @FXML
    private Label inquiryLabel;

    @FXML
    private TableColumn<?, ?> inquiryTable;

    @FXML
    private TableColumn<?, ?> nameTable;

    @FXML
    private RadioButton noRadioButton;

    @FXML
    private TableColumn<?, ?> resolveTable;

    @FXML
    private Label resolvedLabel;

    @FXML
    private TableView<?> tableField;

    @FXML
    private Label tittleCustomerInquiriesPanel;

    @FXML
    private RadioButton yesRadioButton;

    @FXML
    void backButtonAction(ActionEvent event) {

    }

    @FXML
    void resetButtonAction(ActionEvent event) {

    }

    @FXML
    void resolveButtonAction(ActionEvent event) {

    }

}

