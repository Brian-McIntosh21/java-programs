public class InvoiceCon {

    int invoiceNum;
    float balanceDue;
    int year;
    int month;
    int day;




    public InvoiceCon(int invoiceNum, float balanceDue, int year, int month, int day)
    {

        this.invoiceNum = invoiceNum;
        this.balanceDue = balanceDue;
        this.year = year;
        this.month = month;
        this.day = day;

    }
    public void setInvoiceNum()
    {
        this.invoiceNum = invoiceNum;
    }
    public int getInvoiceNum(int invoiceNum)
    {
        return this.invoiceNum;
    }
    public void setBalanceDue()
    {
        this.balanceDue = balanceDue;
    }
    public float getBalanceDue(float balanceDue)
    {
        return this.balanceDue;
    }
    public void setYear()
    {
        this.year = year;
    }
    public int getYear(int year)
    {
        return this.year;
    }
    public void setMonth()
    {
        this.month = month;
    }
    public int getMonth(int month)
    {
        return this.month;
    }
    public void setDay()
    {
        this.day = day;
    }
    public int getDay(int day)
    {
        return this.day;
    }
    public float Invoice()
    {

        int invoiceNum = this.invoiceNum;
        float balanceDue = this.balanceDue;
        int year = this.year;
        int month = this.month;
        int day = this.day;

        if(invoiceNum < 1000)
        {
            invoiceNum = 0;

            System.out.println("The Invoice Number Is: " + invoiceNum);

        }
        if(month < 1 || > 12)
        {
            month = 0;
            day = 0;

        }

        if (day < 1)
        {
            day = 1;
        }
            if(month == 1)
            {
                if(day > 31)
                {
                    day = 31;
                }
            }
            if(month == 2) 
            {
                if(day > 28)
                {
                    day = 28;
                }

            }
            if(month == 3)
            {
                if(day > 31)
                {
                    day = 31;
                }
            }
            if(month == 4) 
            {
                if(day > 30)
                {
                    day = 30;
                }
            }
            if(month == 5)
            {
                if(day > 31)
                {
                    day = 31; 
                }
            }
            if(month == 6)
            {
                if(day > 30)
                {
                    day = 30;
                }
            }
            if(month == 7)
            {
                if(day > 31)
                {
                    day = 31;
                }
            }
            if(month == 8)
            {
                if(day > 31)
                {
                    day = 31;
                }
            }
            if(month == 9)
            {
                if(day > 30;)
                {
                    day = 30;
                }
            }
            if(month == 10)
            {
                if(day > 31)
                {
                    day = 31;
                }
            }
            if(month == 11)
            {
                if(day > 30)
                {
                    day = 30;
                }
            }
            if(month == 12)
            {
                if(day = 31)
                {
                    day = 31;
                }
            }

        
        if (year > 2017 || year < 2011)
        {
            year = 0;
        }

        System.out.println("Your Invoice Number is: " + invoiceNum + "\n" + "The Current Balance Due is: " + "$" + balanceDue +
                "\n" + "Date Of Last Payment: " + month + "/" + day + "/" + year);

        return 0;
    }


}
