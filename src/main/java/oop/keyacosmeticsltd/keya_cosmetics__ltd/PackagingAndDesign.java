package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PackagingAndDesign {

    @FXML
    private TableColumn<?, ?> designcolumn;

    @FXML
    private TextField designtextfield;

    @FXML
    private CheckBox glasscheckbox;

    @FXML
    private TableColumn<?, ?> materialcolumn;

    @FXML
    private CheckBox metalcheckbox;

    @FXML
    private TableColumn<?, ?> packagingtypecolumn;

    @FXML
    private ComboBox<?> packagingtypecombobox;

    @FXML
    private CheckBox plasticcheckbox;

    @FXML
    private TableView<?> productdetailstable;

    @FXML
    private TextField productnameTextfield;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

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
    void resetonactionbutton(ActionEvent event) {

    }

    @FXML
    void saveonactionbutton(ActionEvent event) {

    }

}
