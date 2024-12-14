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

public class WH_SustainController$ {

    @FXML
    private TextField amountField;

    @FXML
    private Label amountLabel;

    @FXML
    private TableColumn<WH_SustainController$,String> amountTable;

    @FXML
    private TextField dateField;

    @FXML
    private Label dateLabel;

    @FXML
    private TableColumn<WH_SustainController$,String> dateTable;

    @FXML
    private Label listLabel;

    @FXML
    private CheckBox recyclingCheckBox;

    @FXML
    private CheckBox reusablePackagingCheckBox;

    @FXML
    private TableView<WH_SustainController$> table;

    @FXML
    private Label tittleWarehouseSustainabilityPanel;

    @FXML
    private TableColumn<WH_SustainController$,String> typeTable;

    @FXML
    private AnchorPane view;

    @FXML
    private CheckBox wasteReductionCheckBox;

    @FXML
    private TextField wasteTypeField;

    @FXML
    private Label wasteTypeLabel;

    @FXML
    void backButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Warehouse Manager Dashboard $.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void resetButtonAction(ActionEvent event) {

    }

    @FXML
    void saveButtonAction(ActionEvent event) {

    }

}
