package recursion;

public class Subsets {

    private static void subsets(String str, String  cur, int i) {
        indent(i);
        System.out.println("subsets (\"" + str + "\", \"" + cur + "\", " + i + ")");

        if(i == str.length()) {
            System.out.println(cur + " ");
            return;
        } 

        subsets(str, cur, i+1);

        subsets(str, cur + str.charAt(i), i + 1);
    }


    private static void permute(String str, String chosen) {

        if(str.isEmpty()) {
            System.out.println(str);
            return;
        } else {
            for (int i = 0; i < str.length(); i++) {
                //swap(str, i, length - 1);
                char c = str.charAt(i);
                chosen += c;
                str = str.substring(0, i) + str.substring(i + str.length());

                permute(str, chosen);
               // swap(str, i, length - 1);
                
            }
        }

    }

    private static void swap(String str, int i, int j) {
        

    }


    public static void main(String[] args) {
    
        String str = "ABC";

        subsets(str, "", 0);

        permute(str, ""); 
    }

    static void indent (int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("    ");
        }
       
    }
 
}
