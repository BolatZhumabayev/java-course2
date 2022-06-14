package collection;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Olzhas");
        arrayList1.add("Marat");
        arrayList1.add("Sergey");
        arrayList1.add("Dmitriy");
        arrayList1.add(1, "Michail");

        for(String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();

//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(42);

//        for(int i = 0; i < arrayList1.size(); i++) {
//            System.out.println(arrayList1.get(i));
//        }

        arrayList1.set(1, "Masha");
        System.out.println(arrayList1);

    }
}
