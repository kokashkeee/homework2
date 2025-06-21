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
        System.out.println("equalsName: " + grib.equals(dan));
        System.out.println("equalsName: " + grib.equals(grib1));
        System.out.println("equalsPublicationYear: " + ww.equals(fa));
        System.out.println("equalsPublicationYear: " + ww.equals(ww1));
    }
}