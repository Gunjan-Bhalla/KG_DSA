import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter fahrenheit temperature");
       int f = sc.nextInt();

       int c = 5 * (f - 32) / 9;
       System.out.println("The fahrenheit temperature is " + f + " and celsius temperature is " + c);
       sc.close();
    }
}
