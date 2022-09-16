package di;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static void main(String[] args) {
        List<String>names = Stream.of("Max","Vasaj","Dima","Vera","Serj","Misha").filter(s ->s.endsWith("j")).map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names.get(0));
        List<Integer> values= Arrays.asList(3,2,2,7,5,1,9,7);
        values.stream().sorted().distinct().forEach(s-> System.out.println(s));
        List<Integer>newValues = values.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(newValues.get(2));
    }
}
