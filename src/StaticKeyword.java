class StudentInf
{
    String name;
    static String collegeName;
    String usn;
    static
    {
        collegeName="BMS college of Engineering,Bangalore.";
    }
    public void show(String sname,String susn)
    {
        name=sname;
        usn=susn;
        System.out.println("Student Name:"+name);
        System.out.println("Student usn:"+usn);
        System.out.println("College Name:"+collegeName);
    }
}
public class StaticKeyword
{
    public static void main(String[] args) {
        StudentInf harsha=new StudentInf();
        harsha.show("Harshavardhan Kanoj","1BM18EE023");
        StudentInf ashok=new StudentInf();
        ashok.show("Ashok","1BM18EE011");
    }
}
