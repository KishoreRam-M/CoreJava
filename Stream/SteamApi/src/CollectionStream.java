import java.util.ArrayList;
import java.util.Collection;

public class CollectionStream {
    public static void main(String[] args) {


        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);

        c.stream()
                .filter(no -> no % 2 == 0)
                .forEach(System.out::println);
    }
}
