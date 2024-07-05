import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        if(year % 4 == 0 || year % 400 == 0){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " not a leap year.");
        }
        sc.close();
    }
}
