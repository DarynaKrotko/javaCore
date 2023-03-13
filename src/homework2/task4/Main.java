package homework2.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Skills skill1 = new Skills("java", 10);
        Skills skill2 = new Skills("js", 10);
        Skills skill3 = new Skills("c++", 10);

        User user = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, new ArrayList<>(),"Skoda", 2015, 1000);

        ArrayList<Skills> skills = user.getSkills();
        skills.add(skill1);
        skills.add(skill2);
        skills.add(skill3);

        System.out.println(user);
    }

}
