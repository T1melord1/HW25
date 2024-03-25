import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> firstHuman = () -> {
            System.out.println("Введите имя, возраст и рост человека через Enter: ");
            Human human = new Human(scanner(),scanner(),scanner());
            return human.getAge();
        };Supplier<String> secondHuman = () -> {
            System.out.println("Введите имя, возраст и рост человека через Enter: ");
            Human human = new Human(scanner(),scanner(),scanner());
            return human.getAge();
        };
        Predicate<Integer> isAgeFirst = (human) -> human > 18;
        Predicate<Integer> isAgeSecond = (human) -> human > 18;
        System.out.println((isAgeFirst.test(Integer.parseInt(firstHuman.get()))));
        System.out.println((isAgeSecond.test(Integer.parseInt(secondHuman.get()))));

    }
    public static String scanner(){
        return new Scanner(System.in).nextLine();
    }
}