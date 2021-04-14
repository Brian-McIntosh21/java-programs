//Brian McIntosh 1337.702
// Lab #6 Option C
// 3/28/20
import java.util.Scanner;
public class Invoice {

    public static void main(String[] args) {

        int invoiceNum = 0;
        float balanceDue = 0;
        int year = 0;
        int month = 0;
        int day = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER INVOICE NUMBER: ");
        invoiceNum = input.nextInt();

        System.out.println("PLEASE ENTER BALANCE DUE: ");
        balanceDue = input.nextFloat();

        System.out.println("PLEASE ENTER YEAR OF NEXT PAYMENT DUE: ");
        year = input.nextInt();

        System.out.println("PLEASE ENTER MONTH OF NEXT PAYMENT DUE: ");
        month = input.nextInt();

        System.out.println("PLEASE ENTER DAY OF NEXT PAYMENT DUE: ");
        day = input.nextInt();

        //Constructor class call
        InvoiceCon a = new InvoiceCon(invoiceNum, balanceDue, year, month, day);
        a.Invoice();

    }
}