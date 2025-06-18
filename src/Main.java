import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author grib = new Author("Александр", "Грибоедов");
        Book wp = new Book("Горе от ума", 1822, grib);
        Author dan = new Author("Даниел", "Киз");
        Book fa = new Book("Цветы для Элджернона", 1966, dan);
        System.out.print(wp.getTitle()+" ");
        System.out.print(wp.getPublicationYear()+" ");
        System.out.println(wp.getAuthor().getName() + " " + wp.getAuthor().getSurname());
        System.out.print(fa.getTitle()+" ");
        System.out.print(fa.getPublicationYear()+" ");
        System.out.println(fa.getAuthor().getName() + " " + fa.getAuthor().getSurname());
        wp.setPublicationYear(1824);
        System.out.print(wp.getTitle()+" ");
        System.out.print(wp.getPublicationYear()+" ");
        System.out.println(wp.getAuthor().getName() + " " + wp.getAuthor().getSurname());
    }
}