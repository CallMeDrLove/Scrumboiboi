package sample;

public class FilmObject {

private int filmID;
private String title;
private String Description;
private String releaseYear;
private String language;
private double rentalDuration;
private double rentalRate;
private int length;
private double replacementCost;
private String specialFeatures;
private String rating;
private String category;


    public FilmObject(int filmID, String title, String description, String releaseYear, String language, double rentalDuration, double rentalRate, int length, double replacementCost, String specialFeatures, String rating, String category) {
        this.filmID = filmID;
        this.title = title;
        Description = description;
        this.releaseYear = releaseYear;
        this.language = language;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.specialFeatures = specialFeatures;
        this.rating = rating;
        this.category = category;
    }

    public FilmObject(int filmID, String title, String description, String releaseYear, String language, double rentalDuration, double rentalRate, int length, double replacementCost, String specialFeatures) {
        this.filmID = filmID;
        this.title = title;
        Description = description;
        this.releaseYear = releaseYear;
        this.language = language;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.specialFeatures = specialFeatures;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(double rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
