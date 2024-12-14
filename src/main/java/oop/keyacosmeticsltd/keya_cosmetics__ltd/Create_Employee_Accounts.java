package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class Create_Employee_Accounts {

    @FXML
    private TextField newEmployeeContact;

    @FXML
    private TextField newEmployeeEmail;

    @FXML
    private TextField newEmployeeID;

    @FXML
    private TextField newEmployeeName;

    @FXML
    void addEmployeeButton(ActionEvent event) {

    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HR Manager/HR_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }
}
