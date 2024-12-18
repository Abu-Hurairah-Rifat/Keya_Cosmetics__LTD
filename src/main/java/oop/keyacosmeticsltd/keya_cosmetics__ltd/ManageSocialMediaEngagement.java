package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageSocialMediaEngagement {

    @FXML
    private TextField clickThroughRate;

    @FXML
    private TextField content;

    @FXML
    private TextField likes;

    @FXML
    private TextField platform;

    @FXML
    private TextField scheduledTime;

    @FXML
    private TextField shares;

    @FXML
    private TableView<?> table;

    @FXML
    void backButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Marketing Manager/marketing_Manager_Dashboard.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    void submitButton(ActionEvent event) {

    }

}
