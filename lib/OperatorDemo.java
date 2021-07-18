import java.util.*;
public class OperatorDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers for operation");
        System.out.print("Enter 1st number:");
        float num1=sc.nextFloat();
        System.out.print("Enter 2nd number:");
        float num2=sc.nextFloat();
        float r1,r2,r3,r4;
        r1=num1+num2;
        r2=num1-num2;
        r3=num1*num2;
        r4=num1/num2;
        System.out.println("Addition:"+r1+" Substracrtion:"+r2+" Multiplication:"+r3+" Division:"+r4);
        sc.close();
    }
}
