package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class InnovationPipeline {

    @FXML
    private TableColumn<?, ?> budgetcolumn;

    @FXML
    private TextField budgettextfield;

    @FXML
    private TableColumn<?, ?> launchdatecolumn;

    @FXML
    private DatePicker launchdatepicker;

    @FXML
    private TableColumn<?, ?> marketresearchcolumn;

    @FXML
    private TextArea marketresearchsummarytextarea;

    @FXML
    private TextField productnameTextfield;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private TableView<?> tableview;

    @FXML
    private TextField targetmarketTextfield;

    @FXML
    private TableColumn<?, ?> targetmarketcolumn;

    @FXML
    void addproductactionbutton(ActionEvent event) {

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
    void clearformactionbutton(ActionEvent event) {

    }

    @FXML
    void removeactionbutton(ActionEvent event) {

    }

}
