public class HardCopyBook extends Book {
    private Integer pageNo;

    public HardCopyBook(String title, String author, Integer pageNo) {
        super(title, author);
        // super();
        this.pageNo = pageNo;

    }

    public HardCopyBook() {}

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public void settTileInChild(String x) {
        super.setTitle(x);
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public String toString() {
        return "Title: " + this.getTitle() + ", Author: " + this.getAuthor() + "PageNo: " + this.getPageNo();
    }
}
