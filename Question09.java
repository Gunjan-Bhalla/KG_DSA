import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
        float b = sc.nextFloat();

        System.out.println(a + " * " + b + " = " + a * b);
        sc.close();
    }
}
