package recursion;

public class Warmup {
    
    public static void main( String [] aStrings) {

        //print(3);

       // int val = fun (16);
        //System.out.println("val - " + val);
        print1ToN(5);
        
    }

    static void print1ToN(int n) {

        if (n == 0) return;
        
        print1ToN (n-1);
        System.out.println(n);
    }

    static void print(int n) {

        if (n == 0) return;       
        print (n -1);
        System.out.println(n);
        print (n -1);
    }

    static int fun( int n) {

        if (n == 1) return 0;

        else {
            return 1 + fun (n/2);
        }
            
    }
}
