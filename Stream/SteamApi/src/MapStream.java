import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MapStream {
    public static void main(String[]  args)
    {
        List<String> list = new ArrayList();
        list.add("7");
        list.add("8");
        list.add("96");
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.stream().map(no->no.toUpperCase()).forEach(System.out::println);

    }
}
