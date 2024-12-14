package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StaffManagementController$ {

    @FXML
    private CheckBox badCheckBox;

    @FXML
    private CheckBox goodCheckBox;

    @FXML
    private TextField moduleField;

    @FXML
    private Label moduleLabel;

    @FXML
    private TableColumn<StaffManagementController$,String> moduleTable;

    @FXML
    private Label sessionLabel;

    @FXML
    private TableColumn<StaffManagementController$,String> sessionTable;

    @FXML
    private TextField sessionsField;

    @FXML
    private TextField staffNameField;

    @FXML
    private Label staffNameLabel;

    @FXML
    private TableColumn<StaffManagementController$,String> staffNameTable;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<StaffManagementController$,String> statusTable;

    @FXML
    private TableView<StaffManagementController$> table;

    @FXML
    private Label tittleStaffTrainingandManagementoverView;

    @FXML
    private AnchorPane view;

    @FXML
    void addButtonAction(ActionEvent event) {

    }

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
    void clearFieldButtonAction(ActionEvent event) {

    }

}
