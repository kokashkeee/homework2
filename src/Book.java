public class Book {
    private String title;
    private int publicationYear;
    Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
    public String toString() {
        return author.toString() + " " + title + " " + publicationYear;
    }

    public boolean equalsPublicationYear(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.publicationYear == ((Book) other).publicationYear;
    }

    public boolean equalsTitle(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return title.equals(((Book) other).title);
    }

    public boolean equalsBooks(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.equalsTitle(other) && this.equalsPublicationYear(other) && this.author.equalsAuthor(((Book) other).author);
    }
}
