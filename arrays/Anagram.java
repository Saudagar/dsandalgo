import java.util.*;

public class Main{
     public static boolean isAnagram(String str1, String str2) {
        
        // Replace this placeholder return statement with your code

        if (str1.length() != str2.length()) return false;

        //Using Map
        Map<Character, Integer> mp = new HashMap<>();
        char [] firstArray = str1.toCharArray();
        char [] secondArray = str2.toCharArray();

        for( char c : firstArray) {
            if(mp.containsKey(c)) {
                int count = mp.get(c);
                mp.put(c, count + 1);
            } else {
                mp.put(c, 1);
            }
        }
        System.out.println("After first loop: " + mp);

        for (char c : secondArray) {
            if(mp.containsKey(c)) {
                int count = mp.get(c);
                mp.put(c, count -1);
            } 
        }

        System.out.println("After second loop: " + mp);

        for (int count : mp.values()) {
            if (count != 0) return false;
        }
        return true;

       //Using Array
       int [] freqCount = new int [26];
        
        for( int i = 0; i < str1.length(); i++) {
            char first = str1.charAt(i);
            char second = str2.charAt(i);

            int firstIndex = first - 'a';
            //freqCount[first - 'a']++;
            int firstCount = freqCount[firstIndex];
            freqCount[firstIndex] = firstCount + 1;

            int secondIndex = second - 'a'; 
            //freqCount[second - 'a']--;
            int secoundCount = freqCount[secondIndex];
            freqCount[secondIndex] = secoundCount - 1;
        }

        for (int count : freqCount) {
            if(count != 0) return false;            
        }
    }
}
