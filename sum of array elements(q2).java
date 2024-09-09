//sum of array elements
package weeek4;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println(" enter the size of the array:");
        int s = sc.nextInt();
        int a[] = new int[s];
        for(int i =0;i<s;i++){
            a[i]= sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<s;i++){
            sum= sum+ a[i];
        }
          
        System.out.println("sum of element in the array : " +sum);
    }
}
