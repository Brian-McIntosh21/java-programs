

// Brian McIntosh 1337.702
// Lab #3 option A
// just a note: with the online textbook theres no mention of differnet lab options
// So im having to guess at what you mean by option A or B

import java.util.Scanner; 

public class ArithmeticDemo
{
    public static void main(String[] args)
    {
        int firstNumber; 
        int secondNumber;
        int sum; 
        int difference;
        int average;
        
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