package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Olzhas");
        arrayList1.add("Marat");
        arrayList1.add("Sergey");
        arrayList1.add("Berik");
        arrayList1.add("Elena");
        Iterator<String> iterator = arrayList1.iterator();
        String name = null;
        while(iterator.hasNext()){
            name = iterator.next();
            System.out.println(name);
            if (name.contains("Berik")) {
                iterator.remove();
            }
        }
        System.out.println("--");
        System.out.println(arrayList1);

    }
}
