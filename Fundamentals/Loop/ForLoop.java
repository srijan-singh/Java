package Fundamentals.Loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int inputNum;

        System.out.print("Get the Table: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num: ");
        inputNum = sc.nextInt(); 

        sc.close();

        for(int i=1; i<=10; i++)
        {
            System.out.println(inputNum+" x "+i+" = "+inputNum*i);
        }
    }
}
