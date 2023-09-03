package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int element : list) {
            System.out.println(element);
        }
        list.remove(0);
        list.removeIf(element -> element == 2);

        List<Integer> result = list.stream().filter(x -> x < 5).collect(Collectors.toList());
        for (int r : result) {
            System.out.println(r);
        }

        Integer name = list.stream().filter(x -> x < 4).findFirst().orElse(null);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.indexOf(2));
    }
}
