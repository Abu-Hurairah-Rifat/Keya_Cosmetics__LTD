package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AccountantDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void goTo_wageStatus_OnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant_Wages.fxml"));
            Scene wagescene = new Scene(fxmlLoader.load());
            Stage wagestage = new Stage();
            wagestage.setTitle("Keya");
            wagestage.setScene(wagescene);
            wagestage.show();
        }
        catch (Exception e){
            //
        }
    }


    @javafx.fxml.FXML
    public void goTo_financial_statement_OnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant_financial_Statement.fxml"));
            Scene finscene = new Scene(fxmlLoader.load());
            Stage finstage = new Stage();
            finstage.setTitle("Keya");
            finstage.setScene(finscene);
            finstage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_RecentTransactions_OnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant_recent_transaction.fxml"));
            Scene recscene = new Scene(fxmlLoader.load());
            Stage recstage = new Stage();
            recstage.setTitle("Keya");
            recstage.setScene(recscene);
            recstage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_Reports_OnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant_Reports.fxml"));
            Scene reposcene = new Scene(fxmlLoader.load());
            Stage repostage = new Stage();
            repostage.setTitle("Keya");
            repostage.setScene(reposcene);
            repostage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_AddJournal_OnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant_add_New_journal.fxml"));
            Scene adjscene = new Scene(fxmlLoader.load());
            Stage adjstage = new Stage();
            adjstage.setTitle("Keya");
            adjstage.setScene(adjscene);
            adjstage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_Inventory_OnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant_Inventory_View.fxml"));
            Scene inscene = new Scene(fxmlLoader.load());
            Stage instage = new Stage();
            instage.setTitle("Keya");
            instage.setScene(inscene);
            instage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_DepreciationCalculator_OnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant_depreciation_calculator.fxml"));
            Scene depscene = new Scene(fxmlLoader.load());
            Stage depstage = new Stage();
            depstage.setTitle("Keya");
            depstage.setScene(depscene);
            depstage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_Edit_Journal_OnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant_edit_existing_journal.fxml"));
            Scene ediscene = new Scene(fxmlLoader.load());
            Stage edistage = new Stage();
            edistage.setTitle("Keya");
            edistage.setScene(ediscene);
            edistage.show();
        }
        catch (Exception e){
            //
        }
    }
}