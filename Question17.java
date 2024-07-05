import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a + " is greatest of the three numbers.");
        }
        else if(b > a && b > c){
            System.out.println(b + " is greatest of the three numbers.");
        }
        else{
            System.out.println(c + " is greatest of the three numbers.");
        }
        sc.close();
    }
}
