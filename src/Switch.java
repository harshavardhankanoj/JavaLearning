import java.util.*;
public class Switch {
    public static void main(String[] args) {
        //Applicable for int,char and string
        //Enter number to check the day of the week, like 1 for sunday, 2 for Monday......
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
             System.out.println("Sunday");
             break;
            case 2:
             System.out.println("Monday");
             break;
            case 3:
             System.out.println("Tuesday");
             break;
            case 4:
             System.out.println("Wednesday");
             break;
            case 5:
             System.out.println("Thirsday");
             break;
            case 6:
             System.out.println("Friday");
             break;
            case 7:
             System.out.println("Saturday");
             break;
            default:
             System.out.println("invalid Input");
             break;
        }
        System.out.print("Enter number '1' to recheck or else enter any key to Exit:");
        int a=sc.nextInt();
        if(a==1)
        {
        System.out.print("Enter a number:");
        int n1=sc.nextInt();
          switch(n1)
          {
            case 1:
             System.out.println("Sunday");
             break;
            case 2:
             System.out.println("Monday");
             break;
            case 3:
             System.out.println("Tuesday");
             break;
            case 4:
             System.out.println("Wednesday");
             break;
            case 5:
             System.out.println("Thirsday");
             break;
            case 6:
             System.out.println("Friday");
             break;
            case 7:
             System.out.println("Saturday");
             break;
            default:
             System.out.println("invalid Input");
             break;
           }
        }
        sc.close();
    }
}
