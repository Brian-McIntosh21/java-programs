//Brian McIntosh COSC 1337.702
//LAB#8 option A

public class Salesperson {

    public static void main(String[] args)
    {

        int idNum = 9999;
        double saleAmount = 0;

        int idArray[] = {(int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum,};
        double saleArray[] = {saleAmount, saleAmount, saleAmount, saleAmount, saleAmount, saleAmount, saleAmount, saleAmount, saleAmount, saleAmount,};


        SalesCon a = new SalesCon(idNum, saleAmount);
        a.printerMethod();
        
    }
}
// Contructor starts here
public class SalesCon {
    double idNum = 9999;
   double saleAmount = 0;
   
   int idArray[] = {(int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum, (int) idNum,};
   double saleArray[] = {saleAmount, saleAmount, saleAmount, saleAmount, saleAmount, saleAmount, saleAmount, saleAmount, saleAmount, saleAmount,};

   public SalesCon(int idArray, double saleArray) {


       this.idNum = idNum;
       this.saleAmount = saleAmount;
       
   }

   public void setId() {
       this.idNum = idNum;
   }

   public double getId() {
       return this.idNum;
   }

   public void setAmount() {
       this.saleAmount = saleAmount;
   }

   public double getAmount() {
       return this.saleAmount;
   }

   public double printerMethod() {
       this.idNum = idNum;
       this.saleAmount = saleAmount;

       System.out.println("ID NUMBER 1 IS: " + idArray[0] + "\n" + "SALE AMOUNT 1 IS: " + saleArray[0]);
       System.out.println("ID NUMBER 2 IS: " + idArray[1] + "\n" + "SALE AMOUNT 2 IS: " + saleArray[1]);
       System.out.println("ID NUMBER 3 IS: " + idArray[2] + "\n" + "SALE AMOUNT 3 IS: " + saleArray[2]);
       System.out.println("ID NUMBER 4 IS: " + idArray[3] + "\n" + "SALE AMOUNT 4 IS: " + saleArray[3]);
       System.out.println("ID NUMBER 5 IS: " + idArray[4] + "\n" + "SALE AMOUNT 5 IS: " + saleArray[4]);
       System.out.println("ID NUMBER 6 IS: " + idArray[5] + "\n" + "SALE AMOUNT 6 IS: " + saleArray[5]);
       System.out.println("ID NUMBER 7 IS: " + idArray[6] + "\n" + "SALE AMOUNT 7 IS: " + saleArray[6]);
       System.out.println("ID NUMBER 8 IS: " + idArray[7] + "\n" + "SALE AMOUNT 8 IS: " + saleArray[7]);
       System.out.println("ID NUMBER 9 IS: " + idArray[8] + "\n" + "SALE AMOUNT 9 IS: " + saleArray[8]);
       System.out.println("ID NUMBER 10 IS: " + idArray[9] + "\n" + "SALE AMOUNT 10 IS: " + saleArray[9]);
       
       return 0;
   }
}
