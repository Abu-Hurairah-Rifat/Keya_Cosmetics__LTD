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
import javafx.stage.Stage;

import java.io.IOException;

public class CoordinateWithMarketing {

    @FXML
    private CheckBox TVcheckbox;

    @FXML
    private TableColumn<?, ?> approvalstatuscolumnbox;

    @FXML
    private TableColumn<?, ?> campaignNametablecolumn;

    @FXML
    private TextField campaignNametextfield;

    @FXML
    private TextField datetextfield;

    @FXML
    private Label headlinelabel;

    @FXML
    private TableColumn<?, ?> launchcolumnview;

    @FXML
    private TableColumn<?, ?> productcolumnview;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TextField promotionbudgettextfield;

    @FXML
    private CheckBox socialmediacheckbox;

    @FXML
    private TableView<?> tableview;

    @FXML
    void Addactionbutton(ActionEvent event) {

    }

    @FXML
    void backonactionbutton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sales Manager/Sales_Manager_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();



    }

    @FXML
    void clearfieldsactionbutton(ActionEvent event) {

    }

    @FXML
    void removeactionbutton(ActionEvent event) {

    }

}
