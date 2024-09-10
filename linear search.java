//linear search
package _week5;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int n=sc.nextInt();
         int a[]= {34,56,78,45};
        int len = a.length;
        
        for(int i=0;i<len;i++)
        {
           if(n==a[i])
         System.out.println(" element fount at the position : " +i);
        else
        System.out.println(" element not found");
        }
    }
}

