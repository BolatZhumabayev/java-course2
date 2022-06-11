package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondElem(al1);
        System.out.println(a);

        ArrayList<Double> al2 = new ArrayList<>();
        al2.add(3.1);
        al2.add(3.2);
        al2.add(3.3);
        Double s = GenMethod.getSecondElem(al2);
        System.out.println(s);

    }
}

class GenMethod {
    public static <T extends Number> T getSecondElem (ArrayList<T> al) {
        return al.get(1);
    }
}