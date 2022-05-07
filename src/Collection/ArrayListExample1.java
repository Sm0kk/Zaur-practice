package Collection;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Maria");
        arrayList1.add("Maria");
        arrayList1.add("Maria");
        arrayList1.add("Maria");
        arrayList1.add("Maria");
        arrayList1.add("Maria");
        System.out.println(arrayList1.add("Maria"));

        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>(200);
        ArrayList<String > arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);
    }
}
