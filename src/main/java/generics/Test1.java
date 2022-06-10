package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");
        list.add("ok");
        list.add("asdfg");
        //list.add(new Car());

        for(Object o : list) {
            System.out.println(o + " length = " + ((String)o).length());
        }
    }
}

class Car{}
