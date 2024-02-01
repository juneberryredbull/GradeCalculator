// Eddie Hart
// Jan 31st, 2024
// CSC 1060

//here i import the scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        double grade = input.nextDouble();
        // the following statements are an else-if chain that determines the letter grade according to number input
        if (grade >= 92) {
            System.out.println("Your grade is: A");
        } else if (92 > grade  && grade >= 89) {
            System.out.println("Your grade is: A-");
        } else if (89 > grade && grade >= 87) {
            System.out.println("Your grade is: B+");
        } else if (87 > grade && grade >= 82) {
            System.out.println("Your grade is: B");
        } else if (82 > grade && grade >= 79) {
            System.out.println("Your grade is: B-");
        } else if (79 > grade && grade >= 77) {
            System.out.println("Your grade is: C+");
        } else if (77 > grade && grade >= 72) {
            System.out.println("Your grade is: C");
        } else if (72 > grade && grade >= 69) {
            System.out.println("Your grade is: C-");
        } else if (69 > grade && grade >= 67) {
            System.out.println("Your grade is: D+");
        } else if (67 > grade && grade >= 60) {
            System.out.println("Your grade is: D");
        } else if (60 > grade && grade >= 0) {
            System.out.println("Your grade is: F god youre fucking stupid");
        }
    }
}