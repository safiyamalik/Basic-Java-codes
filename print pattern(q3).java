
package weeek4;
public class q3 {
    public static void main(String[] args) {
    
        int n = 5; // Number of rows in the pattern

        for (int i = 1; i <= n; i++) {
            // for  spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int k = 1; k<= i; k++) {
                System.out.print(k);
            }
            // Print descending numbers
            for (int m = i - 1; m >= 1; m--) {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
