import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Human> vasyaInput = () -> {
            String age = scanner();
            System.out.println("Введите имя, возраст и рост человека через Enter: ");
            Human vasya = new Human(scanner(),age,scanner());
            return vasya ;
        };Supplier<Human> viktorInput = () -> {
            System.out.println("Введите имя, возраст и рост человека через Enter: ");
            Human viktor = new Human(scanner(),scanner(),scanner());
            return viktor;
        };

        System.out.println(viktorInput.get());
        System.out.println(vasyaInput.get());
        Predicate<Integer> isAge = (age) -> age > 18;
        System.out.println(isAge);
    }
    public static String scanner(){
        return new Scanner(System.in).nextLine();
    }
}