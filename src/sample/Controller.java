package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    HoldMyObsList listna = new HoldMyObsList();
    JdbcTest test = new JdbcTest();
    @FXML
    TableView<FilmObject> filmTable;
    @FXML
    TableColumn<FilmObject, Integer> filmIdCol , filmLengthCol;
    @FXML
    TableColumn<FilmObject , String> filmTitleCol , filmDescCol , filmYearCol , languageCol , specialFeaturesCol, categoryNameCol, ratingCol;
    @FXML
    TableColumn<FilmObject , Double> rentalDurCol , rentalRateCol , replaceCostCol;
    @FXML
    ListView<ActorObject> actorList;
    @FXML
    ImageView kungView , kungView2 , kungView3;
//    File file = new File("G:\\DesignPatterns\\Scrumboi\\9knug.jpg");
//    Image knugen = new Image(file.toURI().toString());



    public void initialize(){
        JdbcTest.ConnectToDB();
        filmTable.setItems(listna.getHoldMyFilm());
        actorList.setItems(listna.getHoldMyActor());

        filmIdCol.setCellValueFactory(new PropertyValueFactory<>("filmID"));
        filmLengthCol.setCellValueFactory(new PropertyValueFactory<>("length"));
        filmTitleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        filmDescCol.setCellValueFactory(new PropertyValueFactory<>("Description"));
        filmYearCol.setCellValueFactory(new PropertyValueFactory<>("releaseYear"));
        languageCol.setCellValueFactory(new PropertyValueFactory<>("language"));
        specialFeaturesCol.setCellValueFactory(new PropertyValueFactory<>("specialFeatures"));
        rentalDurCol.setCellValueFactory(new PropertyValueFactory<>("rentalDuration"));
        rentalRateCol.setCellValueFactory(new PropertyValueFactory<>("rentalRate"));
        replaceCostCol.setCellValueFactory(new PropertyValueFactory<>("replacementCost"));
        categoryNameCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));

        listna.getHoldMyFilm().setAll(test.filmObjects());
        filmTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        
        kungView.setImage(ImageHolder.getKnugen());
        kungView2.setImage(ImageHolder.getKnugen2());
        kungView3.setImage(ImageHolder.getKnugen3());

    }


public void mouseEventActorList(){
    actorList.getItems().setAll(test.getActors(filmTable.focusModelProperty().get().getFocusedItem().getFilmID()));
}

}
