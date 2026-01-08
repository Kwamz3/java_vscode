public class L8_if_else {
    public static void main(String[] args) {
        
        // int x = 28;
        // if (x > 10 && x <= 20) //expected value is from 11-20
        //     System.out.println("Hello");
        // else
        //     System.out.println("Bye");

        int x = 9;
        int y = 7;
        // int x = 5;
        // int y = 7;

        if (x > y) //expected value is from 11-20
        {
            System.out.println("x is greater than y");
            System.out.println("That's it...");    
        }
        else
        { // when printing more than one statement use the curly bracket
            System.out.println("y is greater than x");
            System.out.println("That's it..."); 
        }   
    }
}
