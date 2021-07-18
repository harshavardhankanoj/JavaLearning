import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        //lets check whether input number is even or odd
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check:");
        int n=sc.nextInt();
        if(n%2==0)
         System.out.println("Number is even");
        else
         System.out.println("Number is odd");
        sc.close();
    }
}
