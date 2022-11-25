package JSON;

public class Records {
    private String isbn;
    private String category;
    private String lastname;
    private String firstname;
    private Author author;
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAuthorDetail() {
        return "Author First Name : "+ author.getAuthorFname() + ", Author Last Name : "+ " " + author.getAuthorLname() + ", Author Title : "+" " + author.getTitle() ;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}