package InterviewQstns;

public class Abs{

    protected String name = "Linda";

    private void privateMethod(){
        System.out.println("In private method");
    }
     final void finalMethod(){
        System.out.println("in final method, calling private method");
        privateMethod();
    }

    protected void protectedMethod(){
        System.out.println(" in protected method");
    }

    void defaultMethod(){
        System.out.println(" in default method");
    }

    public void publicMethod(){
        System.out.println(" in public method");
    }
}
