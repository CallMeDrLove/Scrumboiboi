package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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

    public void initialize(){
        JdbcTest.ConnectToDB();
        filmTable.setItems(listna.getHoldMyFilm());
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

    }




}
