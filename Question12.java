import java.util.Scanner;

public class Question12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal");
        int p = sc.nextInt();
        System.out.println("Enter time");
        int t = sc.nextInt();
        System.out.println("Enter rate");
        int r = sc.nextInt();

        int SI = (p* r * t) / 100;
        System.out.println("Simple Interest is: " + SI);
        sc.close();
    }
}
