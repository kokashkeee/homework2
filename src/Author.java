public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return name + " " + surname;
    }

    public boolean equalsName(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return name.equals(((Author) other).name);
    }

    public boolean equalsSurname(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return surname.equals(((Author) other).surname);
    }

    public boolean equalsAuthor(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.equalsSurname(other) && this.equalsName(other);
    }

    public int hashCode() {
        return java.util.Objects.hash();
    }
}
