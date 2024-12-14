package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageRetailPartnerAndDistributors {

    @FXML
    private TableColumn<?, ?> contactcolumn;

    @FXML
    private TextField contacttextfield;

    @FXML
    private TextField distributornametextfield;

    @FXML
    private Label headline;

    @FXML
    private TableColumn<?, ?> namecolumn;

    @FXML
    private TableColumn<?, ?> regioncolumn;

    @FXML
    private TextField regiontextfield;

    @FXML
    private TableView<?> tableview;

    @FXML
    private TableColumn<?, ?> typecolumn;

    @FXML
    private TextField typetextfield;

    @FXML
    void addDistributoractionbutton(ActionEvent event) {

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
    void removeonactionbutton(ActionEvent event) {

    }

}
