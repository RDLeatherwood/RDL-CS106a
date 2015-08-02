import acm.program.*;
public class Add2Integers extends ConsoleProgram
{
    public void run()
    {  // Prompt for and obtain two integers from the user, 
       // then find and display their sum
       print("This program adds two integers.\n");
       int n1 = readInt("Enter first integer : ");
       int n2 = readInt("Enter second integer : ");
       int total = n1 + n2;
       println("The total of " + n1 + " plus " + n2 + " is " + total + ".");
    } // end of run()

    public static void main(String[] args){
        new Add2Integers().start(args);
    } // end of main()

} // end of class Add2Integers