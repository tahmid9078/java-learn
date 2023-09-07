public class Book {
    private String title;
    private String author;
    // private Integer pageNumber;

    // public Book(String title, String author, Integer pageNumber) {
    //     this.title = title; 
    //     this.author = author;
    //     this.pageNumber = pageNumber;
    // }

    public Book(String title, String author) {
        this.title = title; 
        this.author = author;
    }

    public Book() {}

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }

    // public void setPageNumber(int pageNumber) {
    //     this.pageNumber = pageNumber;
    // }

    // public Integer getPageNumber() {
    //     return pageNumber;
    // }
}
