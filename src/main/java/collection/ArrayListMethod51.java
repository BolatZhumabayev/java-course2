package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod51 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Olzhas");
        arrayList1.add("Marat");
        arrayList1.add("Sergey");
        arrayList1.add("Berik");
        arrayList1.add("Elena");
        System.out.println("arrayList = " + arrayList1);
        List<String> myList = arrayList1.subList(1, 4);
        System.out.println("subList = " + myList);

        myList.add("Kamilla");
        System.out.println("subList = " + myList);
        System.out.println("arrayList = " + arrayList1);

        arrayList1.add("Sveta");
        System.out.println("arrayList = " + arrayList1);
        System.out.println("subList = " + myList);
    }
}
