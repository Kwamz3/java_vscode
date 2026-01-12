public class L22_jagged_array {
    public static void main(String[] args) {
        
        // So in the jagged array you can specify the number of arrays in the multi-dimensional array but not the number of columns
        int nums[][] = new int[3][];

        // Now individually for every column we're going to specify the columns in the arrays
        nums[0] = new int [3];
        nums[1] = new int [4];
        nums[2] = new int [2];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }
        
        // Using the enchanced for loop to print 
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            
            System.out.println();

        }
        
        // 3d array
        // int nums[][][] = new int[3][][];

        // // Now individually for every column we're going to specify the columns in the arrays
        // nums[0] = new int [3][2];
        // nums[1] = new int [4][3];
        // nums[2] = new int [2][3];

        // for (int i = 0; i < 3; i++) {

        //     for (int j = 0; j < nums[i].length; j++) {
                
        //         for(int k = 0; k < nums[k].length; k++){
        //             nums[i][j][k] = (int) (Math.random() * 10);
        //         }
        //     }
        // }
        
        // // Using the enchanced for loop to print 
        // for (int n[][] : nums) {
        //     for (int m[] : n) {
        //         for (int o : m) {
        //             System.out.print(o + " ");
        //         }
        //     }
            
        //     System.out.println();

        // }
    }
}
