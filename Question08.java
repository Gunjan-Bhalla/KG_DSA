import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + a * b);
        System.out.println(a + " / " + b + " = " + a / b);
        System.out.println(a + " % " + b + " = " + a % b);
        sc.close();
    }
}
