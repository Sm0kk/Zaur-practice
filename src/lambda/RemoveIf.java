package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Bue");
        arrayList.add("Ok");
        arrayList.add("To study Java");
        arrayList.add("Lambdas");
        arrayList.removeIf( element -> element.length() < 5);
       /* Predicate<String> pr = element -> element.length() < 5;
        arrayList.removeIf(pr);*/ //одинаково
        System.out.println(arrayList);
    }
}
