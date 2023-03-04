package homework1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dogInstance = new Dog("Rex",4, "German Shepherd");
        System.out.println(dogInstance);

        Car carInstance = new Car("Skoda superb ", 160, 1.6, false);
        System.out.println(carInstance);

        ArrayList <String> authors = new <String> ArrayList();
        authors.add("Sally Green");
        Book bookInstance = new Book("Half Bad", 384, authors, "fantasy");
        System.out.println(bookInstance);

        Post postInstance = new Post(1,1, "sunt aut facere", "uia et suscipit nsuscipit");
        System.out.println(postInstance);

        Comment commentInstance = new Comment(1, 1, "id labore ex et quam laborum", "liseo@gardner.biz", "audantium enim quasi est quidem");
        System.out.println(commentInstance);
    }
}
