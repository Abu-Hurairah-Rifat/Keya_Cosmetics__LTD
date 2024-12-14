package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PackagingAndDesign {

    @FXML
    private TableColumn<?, ?> designcolumn;

    @FXML
    private TextField designtextfield;

    @FXML
    private CheckBox glasscheckbox;

    @FXML
    private TableColumn<?, ?> materialcolumn;

    @FXML
    private CheckBox metalcheckbox;

    @FXML
    private TableColumn<?, ?> packagingtypecolumn;

    @FXML
    private ComboBox<?> packagingtypecombobox;

    @FXML
    private CheckBox plasticcheckbox;

    @FXML
    private TableView<?> productdetailstable;

    @FXML
    private TextField productnameTextfield;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    void backonactionbutton(ActionEvent event) {

    }

    @FXML
    void resetonactionbutton(ActionEvent event) {

    }

    @FXML
    void saveonactionbutton(ActionEvent event) {

    }

}
