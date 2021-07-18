class Employee
{
    String gender,name,ID;
    public void employeeDetails()
    {
        System.out.println("invalid input please Enter proper input");
    }
    public void employeeDetails(String personGender,String ename,String eid)
    {      
        name=ename;
        gender=personGender;
        ID=eid;
        System.out.println(name);
        System.out.println(gender);
        System.out.println(eid);
    }
}
public class MethodOverloding 
{
    public static void main(String[] args) {
     Employee obj=new Employee();
     obj.employeeDetails();   
     obj.employeeDetails("Male","Harshavardhan Kanoj","1BM18EE023");
    }
}
