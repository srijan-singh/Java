package Fundamentals.Loop;

import java.util.Scanner;

public class DoWhileLoop {
 public static void main(String[] args) {
    int num = 1;
    int inputNum;

    System.out.println("Get the Table");

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the num: ");
    inputNum = sc.nextInt();

    sc.close();

    do
    {
        System.out.println(inputNum+" x "+num+" = "+inputNum*num);
        num+=1;
    }while(num<=10);
 }   
}
