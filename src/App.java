import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Zoo zoo2 = new Zoo();
        zoo.addAnimal();
        zoo.addAnimal();
        zoo2.addAnimal();
        zoo2.addAnimal();
        zoo2.addAnimal();
        System.out.println(Zoo.DEFAULT_NAME[0]);
        System.out.println(zoo.DEFAULT_NAME[0]);
        System.out.println(zoo2.DEFAULT_NAME[1]);

        char c;
        for (int i = 65; i < 123; i++) {
            c = (char) i;
            System.out.print(c);
        }

new Random().ints().limit(5).sorted().forEach(System.out::println);
    }
}
