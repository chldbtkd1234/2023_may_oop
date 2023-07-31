package arrayBaekJoon3;

public class Book {
    private String bookName;
    private int bookPrice;
    private double bookDiscountRate;

    public Book() {
    }

    public Book(String bookName, int bookPrice, double bookDiscountRate) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookDiscountRate = bookDiscountRate;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public double getDiscountBookPrice() {
        return bookPrice * (1 - bookDiscountRate / 100);
    }

    @Override
    public String toString() {
        return bookName + " " + bookPrice + "원 " + bookDiscountRate + "%";
    }
}