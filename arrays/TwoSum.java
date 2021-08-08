package arrays;

import java.util.Arrays;

public class TwoSum {
    
    public static void main(String[] args) {
    
        int [] array = {2, 3, 6, 7, 8 };
        System.out.println("Two sum exists? " + sum(array, 9));

        int [] aResult = sumWithIndicies(array, 25);
        System.out.println("Two sum indicies  " + Arrays.toString(aResult));
    }

    /**
     * Method to check if target exists in an array.
     * @param array a Sorted int array
     * @param target int value
     * @return an Array with indices else null
     */
    private static int [] sumWithIndicies(int[] array, int target) {
        int i = 0, j = array.length - 1;

        while ( i < j) {
            int targetCheck = array[i] + array[j];

            if (target > targetCheck)  i++;
            else if (target < targetCheck) j--;
            else return new int [] {i, j};            
        }
        return null;
    }

    /**
     * Method to check if target exists in an array.
     * @param array a Sorted int array
     * @param target int value
     * @return true if target exists in an array.
     */
    private static boolean sum(int[] array, int target) {
        int i = 0, j = array.length - 1;

        while ( i < j) {
            int targetCheck = array[i] + array[j];

            if (target > targetCheck)  i++;
            else if (target < targetCheck) j--;
            else return true;            
        }
        return false;
    }

    
}
