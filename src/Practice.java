import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
   public static int maxDifference(int[] nums){
        int smallest = nums[0], largest = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(smallest > nums[i]){
                smallest = nums[i];
            }
            if(largest < nums[i]){
                largest = nums[i];
            }
        }

        return largest - smallest;
    }


  /**
     *  Find the longest word that starts with a specific character letter in.
     * 
     * @param myList a non-empty, non-null list of numbers
     * @param target
     * @return the difference between the largest and smallest number
     */
      public static String getLongestWord(List<String> myList, char target){
        String currentLongest = "";
        if(myList.get(0).charAt(0) == target){
            currentLongest = myList.get(0);
        }
        
        for(int i = 1; i < myList.size(); i++){
            if(myList.get(i).length() > currentLongest.length() && myList.get(i).charAt(0) == target){
                currentLongest = myList.get(i);
            }
        }

        return currentLongest;

    }

       /**
     *  Count how many words are longer than n characters and shorter than m characters in:
     * 
     * @param myMap a non-empty, non-null map of String keys and Value numbers
     * @return the difference between the largest and smallest number
     */
    public static int numberOfWords(Map<String, Integer> myMap, int m, int n){
        int count = 0;

        for(String word: myMap.keySet()){
            if(word.length() < m && word.length() > n){
                count++;
            }
        }

        return count;
    }

    
    
 /**
     *  Find the difference between the how many odd and even numbers there are in:
     * 
     * @param numbers a non-empty, non-null hashset
     * @return the difference between the largest and smallest number
     */
    public static int differenceBetweenOddAndEven(Map<Integer, Integer> numbers){
        int oddCount = 0;
        int evenCount = 0;
        for(int number : numbers.values()){
            if(number % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        return Math.abs(oddCount - evenCount);
    }

  
     /**
     *  Find the second-largest number in:
     * 
     * @param numbers a non-empty, non-null hashmap with integer key and integer value.
     * @return the difference between the largest and smallest number
     */
    public static int secondLargestInteger(Set<Integer> numbers){
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for(int number : numbers){
            if(number > largest){
                largest = number;
            }
        }
         for(int number : numbers){
            if(number > secondLargest && number != largest){
                secondLargest = number;
            }
        }

        return secondLargest;

    }
}