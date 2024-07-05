import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("The grade is A.");
        }
        else if(marks >= 75 && marks < 90){
            System.out.println("The grade is B.");
        }
        else if(marks >= 60 && marks < 75){
            System.out.println("The grade is C.");
        }
        else if(marks >= 30 && marks < 60){
            System.out.println("The grade is D");
        }
        else{
            System.out.println("The grade is F.");
        }
        sc.close();
    }
}
