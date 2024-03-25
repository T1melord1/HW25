import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Human> firstHuman = () -> {
            System.out.println("Введите имя, возраст и рост человека через Enter: ");
            return new Human(scanner(),scanner(),scanner());
        };Supplier<Human> secondHuman = () -> {
            System.out.println("Введите имя, возраст и рост человека через Enter: ");
            return new Human(scanner(),scanner(),scanner());
        };
        Human humanFirst = firstHuman.get();
        Human humanSecond = secondHuman.get();
        Predicate<Integer> isAgeFirst = (human) -> human >= 18;
        Predicate<Integer> isAgeSecond = (human) -> human >= 18;
        int ageFirst = Integer.parseInt((humanFirst.getAge()));
        int ageSecond = Integer.parseInt((humanSecond.getAge()));

        System.out.println(humanFirst.getName() + " - " + (isAgeFirst.test(ageFirst) ? "совершеннолетний" : "несовершеннолетний"));
        System.out.println(humanSecond.getName() + " - " + (isAgeSecond.test(ageSecond) ? "совершеннолетний" : "несовершеннолетний"));
    }
    public static String scanner(){
        return new Scanner(System.in).nextLine();
    }
}