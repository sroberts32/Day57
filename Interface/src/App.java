package day57.Interface.src;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // TacoBoxes
        TripleTacoBox tacobox = new TripleTacoBox();
        tacobox.eat();

        // List as a method parameter
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");


        System.out.println(returnSize(names));
        

    }

    public static int returnSize(List list) {
        return list.size();
    }

}
