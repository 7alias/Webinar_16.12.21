import java.util.ArrayList;

public class Zoo {

    ArrayList<Animal> animals;
    protected static final String[] DEFAULT_NAME = {"Dog", "Cat"};

    public Zoo() {
        animals=new ArrayList<>();
    }

    public static void listAnimal(Zoo zoo){
        System.out.println(zoo.animals);
    }

    public void addAnimal(){
        String name = DEFAULT_NAME[1];
        animals.add(new Animal());

    }
}
