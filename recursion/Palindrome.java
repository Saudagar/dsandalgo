package recursion;

public class Palindrome {

    /**
     * Method to check if a string is palindrome or not.
     * Explanation:
     *          In recurrsion, we will check for small parts. If small parts
     * does the job then we will go for bigger part. First we will check 
     * first char and last char of a string, if both are equal then we will check 
     * start + 1 and end -1. In this whole recurrsion, the string remains the same,
     * only start and end index will increment and decrement.
     * @param string
     * @param start
     * @param end
     * @return
     */
    private static boolean isPalindrome(String string, int start, int end) {

        if(string == null) return false;

        if (string.length() == 0 || string.length() == 1) return true;

        System.out.println( "Now the String {" + string + "} and the start index is at " + start + " end is at " + end );

        if (start >= end ) return true;

       
        return (string.charAt(start) == string.charAt(end)) && 
            isPalindrome(string, start+1, end -1 ) ;
    }
    

    public static void main(String[] args) {
    
        String s1 = "abccba";

        String s2 = "racecar";

        System.out.println(" Is  " + s1 + " a palindrome? " + isPalindrome(s1, 0, s1.length() - 1)) ;
        System.out.println(" Is  " + s2 + " a palindrome? " + isPalindrome(s2, 0, s2.length() - 1)) ;
    }


}
