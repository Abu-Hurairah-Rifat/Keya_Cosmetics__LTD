package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.DatePicker;

public class AccountantReportsController
{
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private LineChart lineChart;
    @javafx.fxml.FXML
    private PieChart pieChart;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void showExpensesOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showRevenueOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showProfitOnClick(ActionEvent actionEvent) {
    }
}