public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int highest = 0;
        int lowest = 0;
        for(int num : nums) {
            if(num > highest) {
                highest = num;
            } else if(num < lowest) {
                lowest = num;
            }

        }
        return highest-lowest;
    }


    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}