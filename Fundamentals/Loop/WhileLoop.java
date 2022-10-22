package Fundamentals.Loop;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        int num = 1;
        int inputNum;

        System.out.println("Get The Table");

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        inputNum = sc.nextInt();

        sc.close();

        while (num<=10) {
            System.out.println(inputNum+" x "+num+" = "+inputNum*num);
            num+=1;
        }
    }
    
}
