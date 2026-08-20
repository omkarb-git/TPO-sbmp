

class Person
{
    int age;
    String name;

    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    
}
class Student extends Person
{
    int m1,m2,m3,roll,total;
    float per;
    Student(String name, int age,int roll,int m1,int m2,int m3)
    {
        super(name,age);
        this.roll=roll;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void DisplayS()
    {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(age);
        total=m1+m2+m3;
        System.out.println(total);
        per=total/3;
        System.out.println(per);
    }
    
    
}
class Teacher extends Person
{
    int id,sal;
    String dept;
    Teacher(String name,int age,int id,int sal,String dept)
    {
        super(name,age);
        this.id=id;
        this.sal=sal;
        this.dept=dept;
    }
    void DisplayT()
    {
        System.out.println(name);
        System.out.println(age); 
        System.out.println(id);
        System.out.println(sal); 
        System.out.println(dept);

    }
    
}
public class OOP 
{
    public static void main(String[] args) {
       Student s1=new Student("raj",20,1,89,78,98);
       s1.DisplayS();
       Teacher t1=new Teacher("mr.patil",50,101,3000,"IT");
       t1.DisplayT();
    }
    
}