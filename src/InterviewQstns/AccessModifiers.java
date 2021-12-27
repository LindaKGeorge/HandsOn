package InterviewQstns;

public class AccessModifiers {
    public static void main(String[] args){
        Abs abs = new Abs();
       // abs.privateMethod(); -- not possible tto access private method in one class from another
        abs.protectedMethod();
        abs.finalMethod();
        abs.publicMethod();
        abs.defaultMethod();
    }
}
