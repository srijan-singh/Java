package Fundamentals.Conditional;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        String light;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Traffic Light Colour: ");
        light = sc.nextLine();

        sc.close();

        switch (light) {
            case "Red":
                System.out.println("Stop!");
                break;

            case "Yellow":
                System.out.println("Wait!");
                break;

            case "Green":
                System.out.println("Go!");
                break;
        
            default:
                System.out.println("Error: Invalid Colour");
                break;
        }
    }
    
}
