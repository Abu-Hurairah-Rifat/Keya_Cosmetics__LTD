package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class StoreDisplayController$ {

    @FXML
    private TextField datefield;

    @FXML
    private TableColumn<StoreDisplayController$,String> datetable;

    @FXML
    private TextField displayname;

    @FXML
    private TableColumn<StoreDisplayController$,String> displaynametable;

    @FXML
    private TableView<StoreDisplayController$> tablefield;

    @FXML
    private TextField targetsection;

    @FXML
    private TableColumn<StoreDisplayController$,String> targetsectiontable;

    @FXML
    private TextField theme;

    @FXML
    private TableColumn<StoreDisplayController$,String> themetable;

    @FXML
    private Label tittleStoreDisplayCreationPanel;

    @FXML
    private AnchorPane view;

    @FXML
    void backbuttononaction(ActionEvent event) {

    }

    @FXML
    void clearbuttononaction(ActionEvent event) {

    }

    @FXML
    void savebuttononaction(ActionEvent event) {

    }

}

