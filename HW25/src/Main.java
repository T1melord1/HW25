import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Human> firstHuman = () -> {
            System.out.println("Введите имя, возраст и рост человека через Enter: ");
            Human human = new Human(scanner(),scanner(),scanner());
            return human;
        };Supplier<Human> secondHuman = () -> {
            System.out.println("Введите имя, возраст и рост человека через Enter: ");
            Human human = new Human(scanner(),scanner(),scanner());
            return human;
        };
        Human humanFirst = firstHuman.get();
        Human humanSecond = secondHuman.get();
        Predicate<Integer> isAgeFirst = (human) -> human >= 18;
        Predicate<Integer> isAgeSecond = (human) -> human >= 18;
        int ageFirst = Integer.parseInt((humanFirst.getAge()));
        int ageSecond = Integer.parseInt((humanSecond.getAge()));

        System.out.println(isAgeFirst.test(ageFirst));
        System.out.println(isAgeSecond.test(ageSecond));
    }
    public static String scanner(){
        return new Scanner(System.in).nextLine();
    }
}