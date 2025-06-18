public class Book {
    private String title;
    private int publicationYear;
    private Author author;
    public Book(String title, int publicationYear, Author author){
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
}
