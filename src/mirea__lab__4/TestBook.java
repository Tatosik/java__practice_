package mirea__lab__4;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "Joanne Rowling", "13.12.1998");
        Book b2 = new Book("Alchemist", "Paulo Coelho", "18.09.1880");
        Book b3 = new Book("Cherry garden", "Anton Chekhov", "10.08.1907");
        b3.setData("09.03.1890");

        b2.setData("26.05.2004");

        System.out.println(b2.getName());
        System.out.println(b2.getAuthor());
        System.out.println(b2.getData());
    }
}
