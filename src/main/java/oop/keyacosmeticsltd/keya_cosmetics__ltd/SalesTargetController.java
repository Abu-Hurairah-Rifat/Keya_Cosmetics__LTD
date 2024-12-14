package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SalesTargetController  {

    @FXML
    private DatePicker deadlinedatepicker;

    @FXML
    private TableColumn<?, ?> descriptiontableview;

    @FXML
    private TableColumn<?, ?> impacttableview;

    @FXML
    private TableColumn<?, ?> prioritytableview;

    @FXML
    private TableView<?> tableview;

    @FXML
    private TextField targetnametextfield;

    @FXML
    private TextField targetvaluetextfield;

    @FXML
    void addactionbutton(ActionEvent event) {

    }

    @FXML
    void backonactionbutton(ActionEvent event) {

    }

    @FXML
    void removeactionbutton(ActionEvent event) {

    }

}
