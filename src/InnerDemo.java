class Outer
{
     int a=3;
    public void show()
    {
        System.out.println(a);
    }
    class Innner
    {
        public void display()
        {
            System.out.println("Hi");
        }
    }
}
public class InnerDemo {
    public static void main(String[] args) {
        Outer obj= new Outer();
        Outer.Innner obj1=obj.new Innner(); // for static innner class obj1=new Outer.Innner();
        obj1.display();
    }
}
