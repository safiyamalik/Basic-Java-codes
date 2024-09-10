//find max and min among array element
package _week5;

import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println(" enter the size of the array");
        int s = sc.nextInt();
        int[]a = new int[s];
        for(int i =0;i<s;i++){
            a[i]= sc.nextInt();
        }
        int max = 0;
        for(int i=0;i<s;i++){
           if(a[i]>max)
               max =a[i];
        }
         System.out.println("maximum element is : "+ max);
    }
}
