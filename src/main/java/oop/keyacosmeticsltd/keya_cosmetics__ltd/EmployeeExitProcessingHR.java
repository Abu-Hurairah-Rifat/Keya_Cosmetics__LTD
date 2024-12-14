package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    void backButton(ActionEvent event) {

    }

    @FXML
    public void submitButton(ActionEvent actionEvent) {
    }
}
