import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n;
       System.out.print("Enter Size of 1D array:");
       n=sc.nextInt();
       int a[] = new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();//Taking array inputs from user
       }
       for(int i=0;i<n;i++)
       {
           System.out.print(a[i]+" ");//Printing array elements
       }
    }
}
