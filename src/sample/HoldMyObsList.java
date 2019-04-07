package sample;
import Store.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HoldMyObsList {
    private  ObservableList<FilmObject> holdMyFilm = FXCollections.observableArrayList();
    private ObservableList<ActorObject> holdMyActor = FXCollections.observableArrayList();
    private ObservableList<Staff> Employee = FXCollections.observableArrayList();
    private ObservableList<Store> storeList = FXCollections.observableArrayList();
    private ObservableList<Payment> paymentList = FXCollections.observableArrayList();
    private ObservableList<String> activeCustomer = FXCollections.observableArrayList();

    public ObservableList<String> getActiveCustomer() {
        return activeCustomer;
    }

    public ObservableList<Payment> getPaymentList() {
        return paymentList;
    }

    //    public ObservableList<String> getEmployee() {
//        return Employee;
//    }


    public ObservableList<Store> getStoreList() {
        return storeList;
    }

    public ObservableList<Staff> getEmployee() {
        return Employee;
    }

    public ObservableList<ActorObject> getHoldMyActor() {
        return holdMyActor;
    }

    public void setHoldMyActor(ObservableList<ActorObject> holdMyActor) {
        this.holdMyActor = holdMyActor;
    }

    public ObservableList<FilmObject> getHoldMyFilm() {
        return holdMyFilm;
    }
}
