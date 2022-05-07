package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        List <Integer> list1 = List.of(3,8,13);
        System.out.println(list1);

        List <String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
        //List<String> myList = arrayList1.subList(1,4);
        //System.out.println(myList);
        //ArrayList<String> arrayList2 = new ArrayList<>();
        //arrayList2.add("Zaur");
        //arrayList2.add("Ivan");
        //arrayList2.add("Kolya");

        //arrayList1.retainAll(arrayList2);
        //System.out.println(arrayList1);

        //boolean result = arrayList1.containsAll(arrayList2);
        //System.out.println(result);


    }
}
