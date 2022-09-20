package di;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Vasa");
        names.add("Dima");
        names.add("Vera");
        names.add("Serj");
        names.add("Misha");
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            String actualNames = names.get(i);
            if (actualNames.startsWith("M")){
                count++;
            }
        }
        System.out.println(count);
    }
}
