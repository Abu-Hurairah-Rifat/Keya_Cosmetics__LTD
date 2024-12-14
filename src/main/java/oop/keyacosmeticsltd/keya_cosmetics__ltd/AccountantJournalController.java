package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class AccountantJournalController {
    @javafx.fxml.FXML
    private TableColumn<AccountantJournal, String> debitTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AccountantJournal, String> accountTableColumn;
    @javafx.fxml.FXML
    private TextField entryNoTextField;
    @javafx.fxml.FXML
    private TextField accountTextField;
    @javafx.fxml.FXML
    private RadioButton creditRadioButton;
    @javafx.fxml.FXML
    private TextField journalNumberTextField;
    @javafx.fxml.FXML
    private TableColumn<AccountantJournal, LocalDate> entryDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AccountantJournal, String> creditTableColumn;
    @javafx.fxml.FXML
    private TextField dr_cr_AmountTextField;
    @javafx.fxml.FXML
    private RadioButton debitRadioButton;
    @javafx.fxml.FXML
    private TableColumn<AccountantJournal, String> entryNoTableColumn;
    @javafx.fxml.FXML
    private DatePicker transaction_dateDatepicker;
    @javafx.fxml.FXML
    private TableView<AccountantJournal> journalTableView;

    ArrayList<AccountantJournal> entryList = new ArrayList<AccountantJournal>();
    ToggleGroup tg;

    @javafx.fxml.FXML
    public void initialize() {
        tg = new ToggleGroup();
        debitRadioButton.setToggleGroup(tg);
        creditRadioButton.setToggleGroup(tg);

        transaction_dateDatepicker.setValue(LocalDate.now());

        entryNoTableColumn.setCellValueFactory(new PropertyValueFactory<AccountantJournal, String>("entry_no"));
        entryDateTableColumn.setCellValueFactory(new PropertyValueFactory<AccountantJournal, LocalDate>("date"));
        accountTableColumn.setCellValueFactory(new PropertyValueFactory<AccountantJournal, String>("account"));
        debitTableColumn.setCellValueFactory(new PropertyValueFactory<AccountantJournal, String>("debit"));
        creditTableColumn.setCellValueFactory(new PropertyValueFactory<AccountantJournal, String>("credit"));

    }

    @javafx.fxml.FXML
    public void addEntryOnClick(ActionEvent actionEvent) {
        int amount = Integer.parseInt(dr_cr_AmountTextField.getText());
        int debit, credit;

        if (debitRadioButton.isSelected()) {
            debit = amount;
            credit = 0;
        } else {
            credit = amount;
            debit = 0;
        }
        AccountantJournal newEntry = new AccountantJournal(
                Integer.parseInt(journalNumberTextField.getText()),
                Integer.parseInt(entryNoTextField.getText()),
                debit, credit, accountTextField.getText(),
                transaction_dateDatepicker.getValue());
        // Add the new student to the entryList
        entryList.add(newEntry);
        // Set the TableView's items to reflect the updated student list
        journalTableView.getItems().setAll(entryList);
    }

}