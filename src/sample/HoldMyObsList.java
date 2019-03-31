package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HoldMyObsList {
    private  ObservableList<FilmObject> holdMyFilm = FXCollections.observableArrayList();
    private ObservableList<ActorObject> holdMyActor = FXCollections.observableArrayList();

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
