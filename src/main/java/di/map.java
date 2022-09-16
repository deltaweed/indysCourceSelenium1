package di;

import com.google.common.collect.Streams;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class map {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("tyty");
        names.add("chika");
        names.add("bOOm");
        names.add("hey");
        names.add("piy");
        names.add("pow");
        Stream.of("Max","Vasaj","Dima","Vera","Serj","Misha").filter(s ->s.endsWith("j")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
        List<String>names1= Arrays.asList("Max","Vasaj","Dima","Vera","Serj","Misha");
        names1.stream().filter(s -> s.startsWith("M")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        Stream<String>concStream = Stream.concat(names.stream(), names1.stream());
//        concStream.sorted().forEach(s -> System.out.println(s));
        boolean flag = concStream.anyMatch(s -> s.equalsIgnoreCase("boom"));
        Assert.assertTrue(flag);
    }
}
