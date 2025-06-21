import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author grib = new Author("Александр", "Грибоедов");
        Author grib1 = new Author("Александр", "Грибоедов");
        Book ww = new Book("Горе от ума", 1822, grib);
        Book ww1 = new Book("Горе от ума", 1822, grib);
        Author dan = new Author("Даниел", "Киз");
        Book fa = new Book("Цветы для Элджернона", 1966, dan);
        System.out.println(ww.toString());
        System.out.println(fa.toString());
        System.out.println("equalsName: " + grib.equalsName(dan));
        System.out.println("equalsName: " + grib.equalsName(grib1));
        System.out.println("equalsSurname: " + grib.equalsSurname(fa));
        System.out.println("equalsSurname: " + grib.equalsSurname(grib1));
        System.out.println("equalsAuthor: " + grib.equalsAuthor(fa));
        System.out.println("equalsAuthor: " + grib.equalsAuthor(grib1));
        System.out.println("equalsPublicationYear: " + ww.equalsPublicationYear(fa));
        System.out.println("equalsPublicationYear: " + ww.equalsPublicationYear(ww1));
        System.out.println("equalsTitle: " + ww.equalsTitle(fa));
        System.out.println("equalsTitle: " + ww.equalsTitle(ww1));
        System.out.println("equalsBooks: " + ww.equalsBooks(fa));
        System.out.println("equalsBooks: " + ww.equalsBooks(ww1));
    }
}