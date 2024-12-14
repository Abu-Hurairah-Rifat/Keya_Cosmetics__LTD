package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CompetitiveAnalysis {

    @FXML
    private TableColumn<?, ?> competitornamecolumn;

    @FXML
    private TextField competitornametextfield;

    @FXML
    private TableColumn<?, ?> marketTrendDetailscolumn;

    @FXML
    private TextArea markettrenddetailsTextarea;

    @FXML
    private ComboBox<?> pricecatagorycombobox;

    @FXML
    private TableColumn<?, ?> productcategorycolumn;

    @FXML
    private TableView<?> tableviewfordetails;

    @FXML
    private Label tilelabel;

    @FXML
    void Backonactionbutton(ActionEvent event) {

    }

    @FXML
    void addcompetitoronactionbutton(ActionEvent event) {

    }

    @FXML
    void clearfieldsonactionbutton(ActionEvent event) {

    }

    @FXML
    void removecompetitoronactionbutton(ActionEvent event) {

    }

}
