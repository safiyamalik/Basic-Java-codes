//Write a Java program to calculate the sum of following series:
//1 + 2 + 3 + 4 + .......... + N
 
package weeek3;

import java.util.Scanner;
public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to calculate sum :4");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            sum = sum+i;
        }
        System.out.println("sum is "+sum);
    }
}
