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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SalesTeamPerformance {

    @FXML
    private ComboBox<?> combobox;

    @FXML
    private Label headlinelabel;

    @FXML
    private TableColumn<?, ?> performancecolumn;

    @FXML
    private TextField searchtextfield;

    @FXML
    private TableView<?> tableview;

    @FXML
    private TableColumn<?, ?> teammembercolumn;

    @FXML
    void addonactionbutton(ActionEvent event) {

    }

    @FXML
    void analyzeperformanceactionbutton(ActionEvent event) {

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

}
