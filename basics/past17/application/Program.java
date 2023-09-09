package past17.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();

        copy(list2, list3);
        printList(list3);
        copy(list1, list3);
        printList(list3);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }
}
