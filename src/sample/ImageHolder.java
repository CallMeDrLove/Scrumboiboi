package sample;

import javafx.scene.image.Image;

import java.io.File;

public class ImageHolder {
   private static File file = new File("G:\\DesignPatterns\\Scrumboi\\9knug.jpg");
   private static File file2 = new File("G:\\DesignPatterns\\Scrumboi\\Carl_XVI_Gustaf_09_600x425.jpg");
   private static File file3 = new File("G:\\DesignPatterns\\Scrumboi\\Carl_XVI_Gustaf_24_700x448.jpg");
    private static Image knugen = new Image(file.toURI().toString());
    private static Image knugen2 = new Image(file2.toURI().toString());
    private static Image knugen3 = new Image(file3.toURI().toString());

    public static Image getKnugen3() {
        return knugen3;
    }

    public static Image getKnugen() {
        return knugen;
    }

    public static Image getKnugen2() {
        return knugen2;
    }
}
