// display the array with values in the pattern 10, 20, 30, ...
package weeek4;
import java.util.Scanner;

public class Weeek4 {
    
 public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        int size= sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter size :");
        for (int i=0; i<size;i++)
        {a[i]=(i+1)*10;
        }
        System.out.println("Array elements:");
        for (int num:a){
            System.out.println(num +" ");
        }
    }
        
            
}