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

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.publicationYear == ((Book) other).publicationYear;
    }

    public int hashCode() {
        return java.util.Objects.hash();
    }
}
