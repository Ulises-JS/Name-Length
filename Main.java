/*
Name: Ulises Servellon
Date: 05/18/23
Description: Please enter a name and I will tell you the length of the name entered.
Please enter 2 positive #'s and the method I created  will return True if the sum of your numbers is even of False
 if the sum is odd !
 */
import java.util.*;//import scanner and other classes
public class Main {
    static Scanner input = new Scanner(System.in);//create input object and associate it with input stream

    public static void main(String[] args) {

        //declare variables
        String userName;
        int firstNum;
        int secondNum;

        try {//begin try

            System.out.println("Please enter a name and I will tell you the length: ");//ask the user to enter a name
            userName = input.next();

            System.out.println("The name you entered is: " + userName + " and the length is: " + userName.length());//checks the length of the name the user entered

            System.out.println("Please enter 2 positive numbers and the method I created will return True if the sum" +
                    " of your numbers is even or False if the sum is odd!!!"); //ask the user to enter 2 positive numbers

            System.out.println("Enter your first number: ");//asks for first number
            firstNum = input.nextInt();

            System.out.println("Enter your second number: ");//ask for second number
            secondNum = input.nextInt();

            //displays the total of the 2 numbers the user entered
            System.out.println("The sum of your numbers " + firstNum + " + " + secondNum + " is " + sumNum(firstNum, secondNum));

            //determines whether the sum of the 2 numbers is even or odd
            if (sumNum(firstNum, secondNum) % 2 == 0) {//begin if
                System.out.println("The sum of the two numbers makes a TRUE number!!!");//this is displayed if the sum becomes an even number
            }//end if

            else
                System.out.println("The sum of the two numbers makes a FALSE number!!!");//this is displayed if the sum becomes an odd number


        }//end try
        catch (InputMismatchException misMatch) {//begin catch
            System.out.println("Invalid data!!!");//this will be displayed if the user entered invalid data
        }//end catch
    }//end main

    //modifiers, method return type, method name, formal parameter, list(datatype variable)
    //method body/statement
    //return keyboard
    public static int sumNum (int x, int y) {
        int sumNum;//declared variable
       sumNum = x + y;//calculates the sum of the 2 numbers
       return sumNum;//returns the total
    }
}
