package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CompetitiveAnalysis {

    @FXML
    private TableColumn<?, ?> competitornamecolumn;

    @FXML
    private TextField competitornametextfield;

    @FXML
    private TableColumn<?, ?> marketTrendDetailscolumn;

    @FXML
    private TextArea markettrenddetailsTextarea;

    @FXML
    private ComboBox<?> pricecatagorycombobox;

    @FXML
    private TableColumn<?, ?> productcategorycolumn;

    @FXML
    private TableView<?> tableviewfordetails;

    @FXML
    private Label tilelabel;

    @FXML
    void Backonactionbutton(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Product Development Manager/Product Develop Manager Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void addcompetitoronactionbutton(ActionEvent event) {

    }

    @FXML
    void clearfieldsonactionbutton(ActionEvent event) {

    }

    @FXML
    void removecompetitoronactionbutton(ActionEvent event) {

    }

}
