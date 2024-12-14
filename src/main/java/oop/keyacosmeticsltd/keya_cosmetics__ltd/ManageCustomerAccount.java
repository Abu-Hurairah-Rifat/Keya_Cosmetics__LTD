package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ManageCustomerAccount {

    @FXML
    private TableColumn<?, ?> customeridtablecolumn;

    @FXML
    private TextField customeridtextfield;

    @FXML
    private TableColumn<?, ?> customernamecolumn;

    @FXML
    private TextField customernametextfield;

    @FXML
    private TableView<?> customertableview;

    @FXML
    private ComboBox<?> statuscombobox;

    @FXML
    private TableColumn<?, ?> statustablecolumn;

    @FXML
    private Label titlelabel;

    @FXML
    void backonactionbutton(ActionEvent event) {

    }

    @FXML
    void customersearchonactionbutton(ActionEvent event) {

    }

    @FXML
    void savechangesonactionbutton(ActionEvent event) {

    }

}
