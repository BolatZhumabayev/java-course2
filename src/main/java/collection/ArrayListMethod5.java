package collection;

import java.util.ArrayList;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Olzhas");
        arrayList1.add("Marat");
        arrayList1.add("Sergey");
        arrayList1.add("Berik");
        System.out.println(arrayList1);


        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Marat");
        arrayList2.add("Sergey");
        arrayList2.add("Dima ");

        //arrayList1.removeAll(arrayList2);
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);

        boolean res = arrayList1.containsAll(arrayList2);
        System.out.println(res);






    }
}
