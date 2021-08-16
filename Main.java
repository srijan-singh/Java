import java.util.*;

class Solution {

    public static String userName(String user_input)
    {
        if(user_input.length() < 8 || Character.isDigit(user_input.charAt(0)))
        {
            return "Invalid";
        }

        else if (user_input.matches("[~!@#$%^&*()+=?<>,.'\";]"))
        {
            return "Invalid";
        }


        return "Valid";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        for(int i=0; i<size; i++)
        {
            String user_input = scan.next();
            System.out.println(userName(user_input));
        }
        
        scan.close();
    }
}