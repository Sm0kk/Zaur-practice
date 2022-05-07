package stream;

import java.util.*;
import java.util.stream.Collectors;

public class map_Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("How are you?");
        list.add("Ok");
        list.add("Bue");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        List<Integer> list2 = list.stream().map(element -> element.length())
                        .collect(Collectors.toList());
        System.out.println(list2) ;

        int[] array = {5,9,3,8,1};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element/=3;
            }
            return element;
        }).toArray();
//        System.out.println(Arrays.toString(array));
        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("How are you?");
        set.add("Ok");
        set.add("Bue");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(element -> element.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}
