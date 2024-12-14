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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CollaboratingWithMarketing {

    @FXML
    private TableView<?> detailstableview;

    @FXML
    private TextArea positioningstrategytextarea;

    @FXML
    private TableColumn<?, ?> productfeaturescolumn;

    @FXML
    private TextArea productfeaturestextarea;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private TextField productnametetxtfield;

    @FXML
    private TableColumn<?, ?> productstrategycolumn;

    @FXML
    private TableColumn<?, ?> targetmarketcolumn;

    @FXML
    private TextField targetmarkettextfield;

    @FXML
    private Label titlelabel;

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
    void removeonactionbutton(ActionEvent event) {

    }

}
