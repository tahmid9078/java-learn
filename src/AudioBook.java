public class AudioBook extends Book {
    private Integer runTime;

    public AudioBook(String title, String author, Integer runTime) {
        super(title, author);
        // super();
        this.runTime = runTime;

    }

    public AudioBook() {}

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public void setTitle(String x) {
        super.setTitle(x);
    }

    public Integer getRunTime() {
        return runTime;
    }

    public String toString() {
        return "Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", AudioBook: " + this.getRunTime();
    }
}
