package InterviewQstns;

class A
{
    void m1()
    {
        System.out.println("In m1 InterviewQstns.A");
    }

}
class B extends A
{
    void m1()
    {
        System.out.println("In m1 InterviewQstns.B");
    }
    void m2()
    {
        System.out.println("In m2 InterviewQstns.B");
    }
}


public class StaticAndDynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
     //   a.m2();


    }
}
