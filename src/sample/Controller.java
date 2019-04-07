package sample;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.image.ImageView;
import Store.*;
import Connector.JDBCConnector;

import java.sql.SQLException;

public class Controller {
    HoldMyObsList listna = new HoldMyObsList();
    Film test = new Film();
    @FXML
    TableView<FilmObject> filmTable;
    @FXML
    TableColumn<FilmObject, Integer> filmIdCol , filmLengthCol;
    @FXML
    TableColumn<FilmObject , String> filmTitleCol , filmDescCol , filmYearCol , languageCol , specialFeaturesCol, categoryNameCol, ratingCol;
//    @FXML
//    TableColumn<FilmObject , Double> rentalDurCol , rentalRateCol , replaceCostCol;
    @FXML
    ListView<ActorObject> actorList;
    @FXML
    ImageView kungView , kungView2 , kungView3;
    @FXML
     ChoiceBox<String> ChooseStore;
    @FXML
    ListView<Staff> employeeListView;
    @FXML
    ListView<Store> storeListView;
    @FXML
    TableView<Payment> paymentTable;
    @FXML
    TableColumn<Payment,String> paymentIDCol, payFnameCol,payLnameCol,payTitlecol,payAmountCol,payDateCol,payRetrunCol;
    @FXML
    ListView<String> ActiveList;




    public void initialize(){
        //Film.ConnectToDB();
        JDBCConnector.getInstance().connect();
        filmTable.setItems(listna.getHoldMyFilm());
        actorList.setItems(listna.getHoldMyActor());
        employeeListView.setItems(listna.getEmployee());
        storeListView.setItems(listna.getStoreList());
        paymentTable.setItems(listna.getPaymentList());
        ActiveList.setItems(listna.getActiveCustomer());

        //------------------------------------------------------------------//
        filmIdCol.setCellValueFactory(new PropertyValueFactory<>("filmID"));
        filmLengthCol.setCellValueFactory(new PropertyValueFactory<>("length"));
        filmTitleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        filmDescCol.setCellValueFactory(new PropertyValueFactory<>("Description"));
        filmYearCol.setCellValueFactory(new PropertyValueFactory<>("releaseYear"));
        languageCol.setCellValueFactory(new PropertyValueFactory<>("language"));
        specialFeaturesCol.setCellValueFactory(new PropertyValueFactory<>("specialFeatures"));
//        rentalDurCol.setCellValueFactory(new PropertyValueFactory<>("rentalDuration"));
//        rentalRateCol.setCellValueFactory(new PropertyValueFactory<>("rentalRate"));
//        replaceCostCol.setCellValueFactory(new PropertyValueFactory<>("replacementCost"));
        categoryNameCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));

        listna.getHoldMyFilm().setAll(test.filmObjects());
        filmTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        //------------------------------------------------------------------//
        paymentIDCol.setCellValueFactory(new PropertyValueFactory<>("payment_id"));
        payFnameCol.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        payLnameCol.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        payTitlecol.setCellValueFactory(new PropertyValueFactory<>("title"));
        payAmountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        payDateCol.setCellValueFactory(new PropertyValueFactory<>("payment_date"));
        payRetrunCol.setCellValueFactory(new PropertyValueFactory<>("return_date"));

        kungView.setImage(ImageHolder.getKnugen());
        //kungView2.setImage(ImageHolder.getKnugen2());
        kungView3.setImage(ImageHolder.getKnugen3());


    }


public void mouseEventActorList(){
    actorList.getItems().setAll(test.getActors(filmTable.focusModelProperty().get().getFocusedItem().getFilmID()));
}



public void onActionChooise() throws SQLException{


    if (ChooseStore.getSelectionModel().getSelectedItem().equals(new String("Store 1"))){
        listna.getEmployee().setAll(Business.getStaff("1"));
        listna.getStoreList().setAll(Business.getStoreInfo("1"));
        listna.getPaymentList().setAll(Business.getStorePayments("1"));
        listna.getActiveCustomer().setAll(Business.getActiveCustomer("1"));

    } else if (ChooseStore.getSelectionModel().getSelectedItem().equals(new String("Store 2"))){

        listna.getEmployee().setAll(Business.getStaff("2"));
        listna.getStoreList().setAll(Business.getStoreInfo("2"));
        listna.getPaymentList().setAll(Business.getStorePayments("2"));
        listna.getActiveCustomer().setAll(Business.getActiveCustomer("2"));
    }
}

}

