package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Olzhas");
        arrayList1.add("Marat");
        arrayList1.add("Sergey");
        arrayList1.add("Dmitriy");
        System.out.println(arrayList1);

        List<String> arrayList2 = new ArrayList<String>(200);
        arrayList2.add("Marat");
        arrayList2.add("Olya");

        List<String> arrayList3 = new ArrayList<String>(arrayList1);
        System.out.println(arrayList3);

        System.out.println(arrayList1 == arrayList3);


    }
}
