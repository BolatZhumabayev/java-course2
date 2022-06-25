package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod52 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Olzhas");
        arrayList1.add("Marat");
        arrayList1.add("Sergey");
        arrayList1.add("Berik");
        arrayList1.add("Elena");
        System.out.println("arrayList = " + arrayList1);
        Object[] array = arrayList1.toArray();
        String[] stringArr = arrayList1.toArray(new String[5]);
        for(String s : stringArr) {
            System.out.println(s);
        }

        //
        //List<Integer> arr1 = List.of(1,2,3);
        //System.out.println(arr1);

    }
}
