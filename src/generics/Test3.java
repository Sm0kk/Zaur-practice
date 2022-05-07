package generics;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        //List<Number> list = new ArrayList<Integer>();
       // List<?> list = new ArrayList<String>();
       // list.add("dawd");

        List<? extends Number> list30 = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Ok");
        list2.add("By");
        list2.add("Hello");
        showListInfo(list2);


        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));


    }
    static void showListInfo(List<?> list){
        System.out.println("List have this elements: " + list);
    }

    public static double summ(ArrayList<? extends Number> number){
        double summ = 0;
        for (Number n : number) {
            summ+=n.doubleValue();
        }
        return summ;
    }
}
