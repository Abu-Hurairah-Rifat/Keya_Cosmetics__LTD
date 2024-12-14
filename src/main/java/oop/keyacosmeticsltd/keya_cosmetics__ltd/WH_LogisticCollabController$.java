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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WH_LogisticCollabController$ {

    @FXML
    private TextField dateField;

    @FXML
    private TableColumn<WH_LogisticCollabController$,String> dateTable;

    @FXML
    private TextField itemField;

    @FXML
    private Label itemLabel;

    @FXML
    private TableColumn<WH_LogisticCollabController$,String> itemTable;

    @FXML
    private Label meetingDateLabel;

    @FXML
    private TextArea noteArea;

    @FXML
    private Label noteLabel;

    @FXML
    private TableColumn<WH_LogisticCollabController$,String> noteTable;

    @FXML
    private TableView<WH_LogisticCollabController$> table;

    @FXML
    private Label tittleSupplyChainAndLogisticsCollaborationBoard;

    @FXML
    private AnchorPane view;

    @FXML
    void backButtonAction(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Warehouse Manager Dashboard $.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void clearButtonAction(ActionEvent event) {

    }

    @FXML
    void saveButtonAction(ActionEvent event) {

    }

}
