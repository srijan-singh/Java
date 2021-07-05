/*
    Calculator
    Srijan Singh Student Developer 02 Oct 2021
*/
package Projects;

import java.util.Scanner;

class Calculator{

    //Add
    public static int sum(int num1, int num2)
    {
        return num1+num2;
    }
    //Multiply
    public static int pro(int num1, int num2)
    {
        return num1*num2;
    }
    //Subtract
    public static int sub(int num1, int num2)
    {
        return num1-num2;
    }
    //Division
    public static int div(int num1, int num2)
    {
        return num1/num2;
    }

}

class Main{
    
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("First Number  : ");
        int a = scn.nextInt();
        System.out.print("Second Number : ");
        int b = scn.nextInt();
        
        scn.close();

        System.out.println("The addition of the given two number is       : " + Calculator.sum(a,b));
        System.out.println("The difference of the given two number is     : " + Calculator.sub(a,b));
        System.out.println("The multiplication of the given two number is : " + Calculator.pro(a,b));
        System.out.println("The division of the given two number is       : " + Calculator.div(a,b));
        
    }
}