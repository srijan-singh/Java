package Fundamentals.Conditional;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        int age;
        boolean haveVoterId;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Do you have your voter ID ? [true|false]: ");
        haveVoterId = sc.nextBoolean();

        sc.close();

        if(age>=18 && haveVoterId)
        {
            System.out.println("Sir, you can vote!");
        }

        else if(age>=18 && !haveVoterId)
        {
            System.out.println("Sir, you can't vote until you bring your voter id!");
        }

        else
        {
            System.out.println("You are too young to vote!");
        }
        
    }
    
}