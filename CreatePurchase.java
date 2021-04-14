//Brian McIntosh COSC 1337.702
//LAb #7 Option A

import java.util.Scanner;
public class CreatePurchase {

public static void main(String[] args)
    {
        float invoiceNum;
        float beforeTax;
        float salesTax = (float) 0.05;
        float afterTax;



        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER INVOICE NUMBER: ");
        invoiceNum = input.nextFloat();

        System.out.println("PLEASE ENTER BALANCE DUE: ");
        beforeTax = input.nextFloat();

        afterTax = (beforeTax * salesTax) + beforeTax;

        Purchase a = new Purchase(invoiceNum, beforeTax, salesTax, afterTax);
        a.printer();

    }

}
//constructor starts here
public class Purchase {

    float invoiceNum;
    float beforeTax;
    float salesTax = (float) 0.05;
    float afterTax;
    
    float printPercent;



    public Purchase(float invoiceNum, float beforeTax, float salesTax, float afterTax) {

        this.invoiceNum = invoiceNum;
        this.beforeTax = beforeTax;
        this.salesTax = salesTax;
        this.afterTax = afterTax;
    }

    public void setInvoiceNum() {
        this.invoiceNum = invoiceNum;
    }

    public float getInvoiceNum(float invoiceNum) {
        return this.invoiceNum;
    }

    public void setBeforeTax() {
        this.beforeTax = beforeTax;
    }

    public float getBeforeTax(float beforeTax) {
        return this.beforeTax;
    }

    public void setSalesTax() {
        this.salesTax = salesTax;
    }

    public float getSalesTax(float salesTax) {
        return this.salesTax;
    }

    public void setAfterTax() {
        this.afterTax = (afterTax * salesTax);
    }

    public float getAfterTax(float afterTax) {
        return this.afterTax;
    }

    public float printer()
    {
        this.invoiceNum = invoiceNum;
        this.beforeTax = beforeTax;
        this.salesTax = salesTax;
        this.afterTax = afterTax;
        this.printPercent = printPercent;

        printPercent = (salesTax * 100);

        if (invoiceNum > 8000 || invoiceNum < 100) {
            System.out.println("INVOICE NUMBER IS INVALID");
        }
        if (beforeTax < 0) {
            System.out.println("SALE AMOUNT IS INVALID");
        }

       System.out.println("INVOICE NUMBER IS: " + invoiceNum + "\n" + "AMOUNT PRE TAX WAS: " + "$"
       + beforeTax + "\n" + "THE SALES TAX WAS: " + printPercent + "%" + "\n"
       + "THE FINAL AMOUNT AMOUNT WAS: " + "$" + afterTax);

        return 0;

    }
}
