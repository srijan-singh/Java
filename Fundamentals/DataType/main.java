class DataType
{
    public static void main(String[] args) {
        int myNum = 12; 
        long myBigNum = 1234567890;
        float myDecNum = 5.99f; 
        double myBigDecNum = 123344.4564654645646;
        boolean myBool = true;
        char myLetter = 'a';
        String myText = "Hello, World!";
        
        System.out.println(myNum);
        System.out.println(myDecNum);


        // Type Casting
        System.out.println((double)myBigNum);
        System.out.println((long)myBigDecNum);


        System.out.println(myBool);
    
        System.out.println(myLetter);
        System.out.println(myText);

        // Internal Type Casting
        myDecNum = myNum;
        myBigDecNum = myBigNum;

    }
}