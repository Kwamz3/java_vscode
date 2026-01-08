public class L20_array {
    public static void main(String[] args) {
        
        // in cases where you might not know the variobles in the array
        // int num[] = new int[5]; will be the best practice, with this the size is fixed

        int num[] = { 3, 6, 7 };
        // System.out.println(num[0]);
        
        // to update the value just reference the index of the number and assign a new number
        num[0] = 6;
        // System.out.println(num[0]);
        
        int num1[] = new int[4];
        // all the numbers in the array will be zero because the haven't been set yet
        // System.out.println(num1[0]);
        num1[0] = 6;
        num1[1] = 4;
        num1[2] = 7;
        num1[3] = 9;
        // System.out.println(num1[0]);

        // using a for loop to print all the elements in an array

        for (int i = 0; i <= 3; i++) {
            System.out.println(num1[i]);
        }
    }
}
