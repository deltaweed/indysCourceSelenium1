package di;

import java.util.ArrayList;
import java.util.stream.Stream;

public class streams1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Vasa");
        names.add("Dima");
        names.add("Vera");
        names.add("Serj");
        names.add("Misha");
        long c = names.stream().filter(s -> s.startsWith("M")).count();
        System.out.println(c);
        Long d = Stream.of("Max","Vasa","Dima","Vera","Serj","Misha").filter(s ->s.startsWith("M")).count();
        System.out.println(d);
        names.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s));
    }
}
