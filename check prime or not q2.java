//to check a number is prime or not 
package _week5;

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
         boolean isPrime = true;
         for(int i = 2;i<=Math.sqrt(n);i++){
             if(n%i==0){
                 isPrime = false;
                   break;
           }
         }
          if(isPrime)   
        System.out.println(" prime number ");
          else
              System.out.println(" Not a prime number ");
    
   }
}
