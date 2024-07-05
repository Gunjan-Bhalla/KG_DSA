import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();
        System.out.println("Enter height");
        int h = sc.nextInt();

        int area = (b * h) / 2;

        System.out.println("Area of a triangle is: " + area);
        sc.close();
    }
}
