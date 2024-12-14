package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeExitProcessingHR {

    @FXML
    private TextField employeeID;

    @FXML
    private ChoiceBox<?> reasonForExit;

    @FXML
    private TableColumn<?, ?> tableOfEmployeeExit;
    @FXML
    private TableView table;

    @FXML
    void backButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HR Manager/HR_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    public void submitButton(ActionEvent actionEvent) {
    }
}
