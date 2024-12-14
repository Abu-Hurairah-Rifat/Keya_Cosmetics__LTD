package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BudgetManagement {

    @FXML
    private DatePicker allocationdatePicker;

    @FXML
    private TableColumn<?, ?> allocationdatecolumn;

    @FXML
    private TableColumn<?, ?> budegetcolumn;

    @FXML
    private TextField budgettextfeild;

    @FXML
    private ComboBox<?> deptCombobox;

    @FXML
    private TableColumn<?, ?> deptcolumn;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TableView<?> tableviewfordetails;

    @FXML
    private Label titlelabel;

    @FXML
    void addbudgrtonactionbutton(ActionEvent event) {

    }

    @FXML
    void backonactionbutton(ActionEvent event) {

    }

    @FXML
    void clearbuttononactionbutton(ActionEvent event) {

    }

    @FXML
    void removebudgetonactionbutton(ActionEvent event) {

    }

}
