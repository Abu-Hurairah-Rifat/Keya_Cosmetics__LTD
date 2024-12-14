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

public class ImprovingExistingProducts {

    @FXML
    private TableColumn<?, ?> customerfeedbackcolumn;

    @FXML
    private TextArea customerfeedbacktextarea;

    @FXML
    private TableView<?> detailstableview;

    @FXML
    private TableColumn<?, ?> improvementcolumn;

    @FXML
    private ComboBox<?> improvementscombobox;

    @FXML
    private TableColumn<?, ?> marketTrendcolumn;

    @FXML
    private TextField marketrendTextfield;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private Label titlelabel;

    @FXML
    void addimprovementactionbutton(ActionEvent event) {

    }

    @FXML
    void backactionbutton(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Product Development Manager/Product Develop Manager Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void removeimprovementactionbutton(ActionEvent event) {

    }

}
