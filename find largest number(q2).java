// java program to find the largest number among the three numbers
package weeek3;
import java.util.Scanner;

public class q2 {
     public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter numbers: ");
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1>n2)
        {
            if(n1>n3)
            System.out.println(n1+" is max");
            else
            System.out.println(n3+" is max");
        }
        else
        {
            if(n2>n3)
            System.out.println(n2+" is max");
            else
            System.out.println(n3+" is max");
        }
    }
}
}
