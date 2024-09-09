//even or odd
package weeek3;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        if(n%2==0)
        System.out.println(n+" is even");
        else
        System.out.println(n+" is odd");
    }
    
}


