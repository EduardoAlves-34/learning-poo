package model;

public class Book implements Publication {
    private String title;
    private String author;
    private int pages;
    private int currentPage;
    private Person reader;
    private Boolean open;
    private Boolean close;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Boolean getClose() {
        return close;
    }

    public void setClose(Boolean close) {
        this.close = close;
    }

    public Book(String title, String author, int pages, Person reader) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.currentPage = 0;
        this.open = false;
        this.reader = reader;
    }

    public String details() {
        return "Book{" +
                " title=' " + title + '\'' +
                "\n, author=' " + author + '\'' +
                "\n, pages= " + pages +
                "\n, currentPage= " + currentPage +
                "\n, reader=' " + reader.getName() + '\'' +
                "\n, reader=' " + reader.getSex() +
                "\n, reader=' " + reader.getAge() +
                "\n, open= " + open +
                "\n, close= " + close +
                '}';
    }

    @Override
    public void open() {
        this.open = true;
        System.out.println("ABRINDO LIVRO");
    }

    @Override
    public void close() {
        this.close = false;
    }

    @Override
    public void nextPage() {
        this.currentPage++;
    }

    @Override
    public void backPage() {
        this.currentPage--;
    }
}
