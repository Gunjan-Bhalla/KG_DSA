import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal");
        int p = sc.nextInt();
        System.out.println("Enter time");
        int t = sc.nextInt();
        System.out.println("Enter rate");
        int r = sc.nextInt();

        int CI = p * ( 1 + r/100)* t;
        System.out.println("Compound Interest is "+ CI);
        sc.close();
    }
}
