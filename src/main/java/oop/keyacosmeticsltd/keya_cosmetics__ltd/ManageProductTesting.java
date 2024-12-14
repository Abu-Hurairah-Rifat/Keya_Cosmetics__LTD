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

public class ManageProductTesting {

    @FXML
    private Label Title;

    @FXML
    private CheckBox finalcheckbox;

    @FXML
    private CheckBox initialcheckbox;

    @FXML
    private CheckBox midcheckbox;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TableView<?> recordsdeatilstableview;

    @FXML
    private TableColumn<?, ?> testIDcolumn;

    @FXML
    private TextField testIDtextfield;

    @FXML
    private TableColumn<?, ?> testernamecolumn;

    @FXML
    private TextField testernametextfield;

    @FXML
    private TableColumn<?, ?> testingphasecolumn;

    @FXML
    void addtestrecordsonactionbutton(ActionEvent event) {

    }

    @FXML
    void backonactionbutton(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Product Development Manager/Product Develop Manager Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void clearfieldsonactionbutton(ActionEvent event) {

    }

    @FXML
    void removetestrecordsonactionbutton(ActionEvent event) {

    }

}
