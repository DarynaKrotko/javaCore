package homework3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Black and white");
        Magazine magazine = new Magazine("Cosmo");

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(book);
        printables.add(magazine);
        System.out.println(printables);
    }
}
