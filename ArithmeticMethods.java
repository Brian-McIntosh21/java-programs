// so uh listen bud... one version has to just top pass preset values to the methods 
// the second has to pass values entered by users into the method 
// cards on the table.. I havent read more then half a page of the instructions
// so take that as you will
// additonal note 2/26/20 compiler does like instance objects or the scanner for some reason 

import java.util.Scanner;

public class ArithmeticMethods
{
    public static void main(String[] args)
    {

        int a = 1;
        int b = 2;
        int c;
        int d;
        int fuckinWhateverMyFuckinDude; 
        int apparentlythesecanbewhateverthefuckiwannacallthem; 
        int choice;
        
        
        Scanner input = new Scanner(System.in);
         
       // im gonna subdivide this into to parts with an if 
       // update 2/26/20 11:02am compiler wont run if there are any undeclared variables in the entire class 
        system.out.println("1 for input numbers" + "2 for calling methods");
        choice = input.nextInt();


        if(choice == 1)
        {
        system.out.println("Please enter first number: ");
        a = input.nextInt(); 

        system.out.println("Please enter second number: ");
        b = input.nextInt();
        }
        // editors note these methods are intance methods and therefore need objects to be instantiated 
        // to be realized in the main method 
        // sill dont know how you pass two seperate values in 
        if(choice == 2)
        {
        name plusTenObj = new name();        
        name.numberPlus10(a,b); 
        
        name plusHundoObj = new name();
        name.numberPlus100(a,b);

        name plusGrandObj = new name();
        name.plusNumber1000(a,b);
        }
        else
        {
            system.out.println("Dickhead"); 
        }


    }


    // 2/26/20 11:04am text editor dosent have a problem but the compiler
    // isnt accepting ints a or b in ohter methiods, most likely not being passed properly
    public void numberPlus10()
    {
      int c = (a + 10);
      int d = (b + 10);
      
      
        system.out.println("The first number plus 10 is: " + c + "The second number: " + d); 
    
         
    }
    

    public void numberPlus100()
    {
        int c = (a + 100);
        int d = (b + 10);
        
        system.out.println("The first number plus 100 is: " + c + "the sencond number plus 100 is: " + d); 


    }

    public void numberPlus1000()
    {
        int c = (a + 1000);
        int d = (b + 1000);

        system.out.println("The first number pluss 1000 is: " + c + "The second number plus 1000 is: " + d);

    }
}