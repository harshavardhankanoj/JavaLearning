class Cons
{
 float n1;
 float n2;
 String name;
 //Constructor is member of method 
 //no return value
 public Cons()
 {
     n1=2;
 }
 //lets see about constructor overloading
 public Cons(float n1,float num2,String na)
 {
     this.n1=n1;
     n2=num2;
     name=na;
 }
}
public class ConstructorDemo
 {
   public static void main(String[] args) 
   {
       Cons obj=new Cons(2.23f,323.323f,"Harshavardhan Kanoj");
       System.out.println(obj.n1+" "+obj.n2+" "+obj.name);
   } 
}
