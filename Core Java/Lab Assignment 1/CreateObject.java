import java.util.Scanner;

class MyClass {
    int value;
    MyClass(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class CreateObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = scanner.nextInt();
        MyClass obj = new MyClass(value);
        obj.display();
    }
}
