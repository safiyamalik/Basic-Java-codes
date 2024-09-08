// print the average of the three numbers
package week2;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int n1 = sc.nextInt();
        System.out.println("enter number 2:");
        int n2 = sc.nextInt();
        System.out.println("enter number 3:");
        int n3 = sc.nextInt();
        double avg = (double)(n1+n2+n3)/3;
        System.out.println("The average is "+ avg) ;
    }
}

}
