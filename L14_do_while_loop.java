public class L14_do_while_loop {
     public static void main(String[] args) {

        int i = 1;

        // while (i <= 4) {
        //     System.out.println("Hello " + i);
        //     i++;
        // }

        // int i = 1;

        // //with the do while loop you will able to get the output once even if the condition is false

        do{
            System.out.println("Hello " + i);
            i++;
        }
        while (i <= 4)
            ;
    }
}
