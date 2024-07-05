import java.util.Scanner;
public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.print("Welcome " + name);
        sc.close();
    }
}
