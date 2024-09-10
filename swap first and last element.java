//swap first and last element of array
package _week5;
public class q3 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
         int len = a.length;
        int t;
         for(int i=0;i<=len-1;i++){
              t = a[0];
              a[0] = a[len-1];
              a[len-1]= t;
              
         }
         System.out.println("array after swapping : ");
          for(int i=0;i<=len-1;i++){
           System.out.println(a[i]);
    }
}
}
