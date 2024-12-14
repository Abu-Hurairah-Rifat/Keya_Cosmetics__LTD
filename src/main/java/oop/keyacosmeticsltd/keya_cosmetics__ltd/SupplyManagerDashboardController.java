package oop.keyacosmeticsltd.keya_cosmetics__ltd;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SupplyManagerDashboardController
{

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goTo_ControlInvetory_onClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupplyManager_Control_Inventory_View.fxml"));
            Scene matscene = new Scene(fxmlLoader.load());
            Stage matstage = new Stage();
            matstage.setTitle("Keya");
            matstage.setScene(matscene);
            matstage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_MaterialInventory_onClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupplyManager_Inventory_View.fxml"));
            Scene matscene = new Scene(fxmlLoader.load());
            Stage matstage = new Stage();
            matstage.setTitle("Keya");
            matstage.setScene(matscene);
            matstage.show();
        }
        catch (Exception e){
            //
        }
    }



    @javafx.fxml.FXML
    public void goTo_Shipments_onClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupplyManager_Shipments.fxml"));
            Scene matscene = new Scene(fxmlLoader.load());
            Stage matstage = new Stage();
            matstage.setTitle("Keya");
            matstage.setScene(matscene);
            matstage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_Suppliers_onClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupplyManager_Suppliers.fxml"));
            Scene matscene = new Scene(fxmlLoader.load());
            Stage matstage = new Stage();
            matstage.setTitle("Keya");
            matstage.setScene(matscene);
            matstage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_Compliance_onClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupplyManager_Compliance.fxml"));
            Scene matscene = new Scene(fxmlLoader.load());
            Stage matstage = new Stage();
            matstage.setTitle("Keya");
            matstage.setScene(matscene);
            matstage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_Forecasting_onClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupplyManager_Forecasting.fxml"));
            Scene matscene = new Scene(fxmlLoader.load());
            Stage matstage = new Stage();
            matstage.setTitle("Keya");
            matstage.setScene(matscene);
            matstage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_Budgeting_onClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupplyManager_Budgeting.fxml"));
            Scene matscene = new Scene(fxmlLoader.load());
            Stage matstage = new Stage();
            matstage.setTitle("Keya");
            matstage.setScene(matscene);
            matstage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void goTo_Logistics_onClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SupplyManager_Logistics.fxml"));
            Scene matscene = new Scene(fxmlLoader.load());
            Stage matstage = new Stage();
            matstage.setTitle("Keya");
            matstage.setScene(matscene);
            matstage.show();
        }
        catch (Exception e){
            //
        }
    }

}