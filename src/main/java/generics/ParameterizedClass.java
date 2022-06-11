package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<Double> info1 = new Info<>(3.14);
        System.out.println(info1);
        Double s1 = info1.getValue();

        Info<Integer> info2 = new Info<>(42);
        System.out.println(info2);
        Integer s2 = info2.getValue();
    }
}

class Info<T extends Number> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{[ "  + value + " ]}";
    }
}

interface I1 {}
interface  I2 {}
