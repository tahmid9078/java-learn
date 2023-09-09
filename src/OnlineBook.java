public class OnlineBook extends Book {
    private String fileFormate;

    public OnlineBook(String title, String author, String fileFormate) {
        super(title, author);
        // super();
        this.fileFormate = fileFormate;

    }
     public OnlineBook( ) {
    }

   

    public void setFileFormate(String fileFormate) {
        this.fileFormate = fileFormate ;
    }

    public void setTitle(String x) {
        super.setTitle(x);
    }

    public String getFileFormate() {
        return fileFormate;
    }

    public String toString() {
        return "Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", AudioBook: " + this.getFileFormate();
    }
}
