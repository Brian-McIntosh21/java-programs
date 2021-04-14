// the version the does doubles 
// Brian mcintosh 1337.702
// lab 3 option A
import java.util.Scanner;

public class ArithmeticDemo2
{
    public static void main(Strings[] args)
    {
        double firstNumber; 
        double secondNumber;
        double sum; 
        double difference;
        double average;
        
        Scanner input = new Scanner(System.in);

            System.out.println("Please enter an integer >> ");
            firstNumber = input.nextInt();

            System.out.println("Please enter a second integer >> ");
            secondNumber = input.nextInt();

            // initalizing variables declared in array
            sum = firstNumber - secondNumber;
            difference = firstNumber - secondNumber;
            average = sum / 2;

            System.out.println(firstNumber + " + " + secondNumber + " is " + sum); 
            System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
            System.out.println("The average of " + firstNumber + " and " + secondNUmber + " is " + average);

    }

}