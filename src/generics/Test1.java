package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList <> ();
       // list.add("OK");
       // list.add(5);
      //  list.add(new StringBuilder("Edwadawd"));
      //  list.add(new Car());
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("dwadwada");

        for (Object it : list) {
            System.out.println(it + " length " + ((String)it).length());
        }
    }
}

class Car {}
