package ie.atu.week5;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        addition(sc);
        subtraction(sc);
        multiplication(sc);
        division(sc);
    }

    public static void addition(Scanner scanner){
        System.out.print("Please enter NUM1 for addition: ");
        float num1 = scanner.nextFloat();

        System.out.print("Please enter NUM1 for addition: ");
        float num2 = scanner.nextFloat();

        System.out.println("ADDITION IS: " + (num1 + num2) + "\n");
    }

    public static void subtraction(Scanner scanner){
        System.out.print("Please enter NUM1 for subtraction: ");
        float num1 = scanner.nextFloat();

        System.out.print("Please enter NUM1 for subtraction: ");
        float num2 = scanner.nextFloat();

        System.out.println("SUBTRACTION IS: " + (num1 - num2) + "\n");
    }

    public static void multiplication(Scanner scanner){
        System.out.print("Please enter NUM1 for multiplication: ");
        float num1 = scanner.nextFloat();

        System.out.print("Please enter NUM1 for multiplication: ");
        float num2 = scanner.nextFloat();

        System.out.println("MULTIPLICATION IS: " + (num1 * num2) + "\n");
    }

    public static void division(Scanner scanner){
        System.out.print("Please enter NUM1 for division: ");
        float num1 = scanner.nextFloat();

        System.out.print("Please enter NUM1 for division: ");
        float num2 = scanner.nextFloat();

        System.out.println("DIVISION IS: " + (num1 / num2) + "\n");
    }

}
