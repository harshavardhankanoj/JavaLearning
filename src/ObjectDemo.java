class Calc
{
    float n1,n2,result;
    public float add()
    {
        result=n1+n2;
        return result;
    }
    public float mul()
    {
        return result=n1*n2;
    }
    public float sub()
    {
        return result=n1-n2;
    }
    public float divi()
    {
        return result=n1/n2;
    }
}
public class ObjectDemo 
{
    public static void main(String[] args) 
    {
      Calc obj=new Calc();
      obj.n1=3.323f;
      obj.n2=7.2323f;
      obj.add();
      System.out.println(obj.add());
      System.out.println(obj.mul());
      System.out.println(obj.sub());
      System.out.println(obj.divi());
    }
}
