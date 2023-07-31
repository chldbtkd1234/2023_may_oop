package arrayBaekJoon3;

public class BookTest {
    public static void main(String[] args) {
        Book[] bookArray = new Book[3];

        // Book 객체를 3개 생성하여 배열에 넣기
        bookArray[0] = new Book("SQL Plus", 50000, 5);
        bookArray[1] = new Book("Java 2.0", 40000, 3);
        bookArray[2] = new Book("JSP Servlet", 60000, 6);

        // 배열에 있는 객체 정보 출력
        for (Book book : bookArray) {
            System.out.println(book);
        }

        // 책 가격의 합 출력
        int totalBookPrice = 0;
        for (Book book : bookArray) {
            totalBookPrice += book.getBookPrice();
        }
        System.out.println("책 가격의 합: " + totalBookPrice + "원");

        // 할인 된 책 가격의 합 출력
        double totalDiscountedPrice = 0;
        for (Book book : bookArray) {
            totalDiscountedPrice += book.getDiscountBookPrice();
        }
        System.out.println("할인 된 책 가격의 합: " + totalDiscountedPrice + "원");
    }
}