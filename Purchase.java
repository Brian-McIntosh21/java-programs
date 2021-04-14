public class Purchase {

    float invoiceNum;
    float beforeTax;
    float salesTax = (float) 0.05;
    float afterTax;
    // do i need a set method for the sales tax?
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
