import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя, возраст и рост человека: ");
        Supplier<Human> humanSupplier = () -> {
            System.out.println("");
            return null;
        };

    }
    public static String scanner(){
        return new Scanner(System.in).nextLine();
    }
}