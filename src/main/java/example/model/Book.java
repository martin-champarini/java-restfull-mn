package example.model;


import java.util.StringJoiner;

public class Book {

    private long idBook;
    private String title;
    private double price;

    public Book(long idBook, String title, double price) {
        this.idBook = idBook;
        this.title = title;
        this.price = price;
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("idBook=" + idBook)
                .add("title='" + title + "'")
                .add("price=" + price)
                .toString();
    }
}
