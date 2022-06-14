package collection;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Olzhas");
        arrayList1.add("Marat");
        arrayList1.add("Sergey");
        arrayList1.add("Marat");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);
//        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println(arrayList1.indexOf("Marat"));
        System.out.println(arrayList1.lastIndexOf("Marat"));
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("Sergey"));
        System.out.println(arrayList1.size());
    }
}
