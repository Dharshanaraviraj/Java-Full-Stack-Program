import java.util.Scanner;
class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }

    boolean isEqual(MyClass obj) {
        return this.value == obj.value;
    }
}

public class CompareObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for first object: ");
        int value1 = scanner.nextInt();
        MyClass obj1 = new MyClass(value1);

        System.out.print("Enter value for second object: ");
        int value2 = scanner.nextInt();
        MyClass obj2 = new MyClass(value2);

        if (obj1.isEqual(obj2)) {
            System.out.println("Both objects are equal.");
        } else {
            System.out.println("Objects are not equal.");
        }
    }
}
