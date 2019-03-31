package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HoldMyObsList {
    private  ObservableList<FilmObject> holdMyFilm = FXCollections.observableArrayList();

    public ObservableList<FilmObject> getHoldMyFilm() {
        return holdMyFilm;
    }
}
