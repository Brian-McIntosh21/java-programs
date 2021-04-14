/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeebonus;
import javax.swing.*;
/**
 *
 * @author mcint
 */
public class EmployeeBonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   String employeeName;
   double numTransactions; 
   String transactString;
   double numShifts;
   String shiftString;
   double dollarValue;
   String dollarString;
   double score;
   double bonus ;
   final double BONUS_1 = 50.00;
   final double BONUS_2 = 75.00;
   final double BONUS_3 = 100.00;
   final double BONUS_4 = 200.00;
   
   //this in work done in housekeeping
   employeeName = JOptionPane.showInputDialog("Enter employees name: ");
   shiftString = JOptionPane.showInputDialog("Enter number of shifts: ");
   transactString = JOptionPane.showInputDialog("Enter number of transactions: ");
   dollarString = JOptionPane.showInputDialog("enter trnasactions dollar value; ");
   
   numShifts = Double.parseDouble(shiftString);
   numTransactions = Double.parseDouble(transactString);
   dollarValue = Double.parseDouble(dollarString);
   // this is work in detail loop
   //write code here dingus brain
   score = (dollarValue/numTransactions)/numShifts; 
   
   if (score <= 30)
   {
        bonus = BONUS_1;
        
      
   }
   else
   { 
           System.out.println("well fuck me i guess");
           
              
  
           
           }
   
   
    
   
   
   //this is the work done in the endOfJob() method
   // output
   System.out.println("employee Name: " + employeeName);
   System.out.println("Employee Bonus: " + bonus);
   
   System.exit(0);
   
   
           
             
  
      
    
    
    
    
    
    
    }
}

