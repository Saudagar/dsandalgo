import java.util.*;

public class ProductSelf {
   public static int[] productExceptSelf(int[] arr) {
      
      // Replace this placeholder return statement with your code
      
      int [] results = new int [arr.length];
      int product = 1;

      for (int i = 0; i < results.length; i++) {
         results[i] = product; 
         product *= arr[i];
      }

      product = 1;

      for(int i = results.length - 1; i >= 0; i--) {
         results[i] *= product;
         product *= arr[i];
      }

      System.out.println("results -> " + Arrays.toString(results));

      return results;
   }
}
