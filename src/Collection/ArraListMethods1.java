package Collection;

import java.util.ArrayList;

public class ArraListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add(1,"Vasilisa");
        System.out.println(arrayList1);

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println();
        arrayList1.set(1, "Nikolas");
        System.out.println(arrayList1);

        arrayList1.remove(0);
        System.out.println(arrayList1);
    }
}
