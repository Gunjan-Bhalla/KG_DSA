import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a =  sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping, number 1 is " + a + " and the number 2 is " + b);
        sc.close();
    }
}
