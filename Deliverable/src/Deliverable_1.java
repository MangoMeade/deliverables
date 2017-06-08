/**
 * Created by aibar on 5/20/2017.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

class Digits {
    boolean sumDigitsEqualsNumber = false;
    double digitNumber = 0;
    int inputNumber = 0; //user input
    int sumOfDigits = 0;
    int originalNumber = 0; //reference to user input

    void calculateDigitsCubed() {
        //while loop sums finds the sum of the cubes of the inputNumer's digits.
        while (originalNumber > 0) {
            digitNumber = Math.pow((originalNumber % 10), 3);
            originalNumber = originalNumber / 10;
            sumOfDigits += digitNumber;
        }
        if (inputNumber == sumOfDigits) {
            sumDigitsEqualsNumber = true;
        }
        else {
            sumDigitsEqualsNumber = false;
        }

        System.out.println(sumDigitsEqualsNumber);
    }
}
public class Deliverable_1 {
    public static void main(String[] args) {
        final String NUMBER_PROMPT = "\nType a number and check if the cube of digits equals the number: ";

        Digits digits1 = new Digits();

        System.out.println(NUMBER_PROMPT);
        Scanner scnr = new Scanner(System.in);

        try {
            digits1.inputNumber = scnr.nextInt();
            digits1.originalNumber = digits1.inputNumber;
            digits1.calculateDigitsCubed();
        }
        catch (InputMismatchException e) {
            System.out.println("Enter numeric values only");
        }

    }
}
