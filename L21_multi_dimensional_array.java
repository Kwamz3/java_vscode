public class L21_multi_dimensional_array {
    public static void main(String[] args) {
        
        // int nums[][] = new int[3][4];
        // So in the array above there are 3 arrays in the the array num that has 4 elements
        
        int nums[][] = new int[3][4];
        // So for this array it will have
        //      0   1   2   3
        //  0
        // 
        //  1
        // 
        //  2

        // Using a fvr loop to assign the random values into the array
        // random returns double values so type-casting will be needed

        for (int i = 0; i < 3; i++) {

            // for (int j = 0; j < 4; j++) {
            //     System.out.print(nums[i][j] = (int) (Math.random() * 100));
            // }
            
            // for single digit multipying by 10 
            for (int j = 0; j < 4; j++) {
                // System.out.print(nums[i][j] = (int)(Math.random() * 10));
                nums[i][j] = (int)(Math.random() * 10);
            }

            // System.out.println();
        }
        
        // for (int i = 0; i < 3; i++) {

        //     for (int j = 0; j < 4; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }

        //     System.out.println();
        // }
        
        // printing the 2d array with an enchanced loop
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            
            System.out.println();

        }
    }
}