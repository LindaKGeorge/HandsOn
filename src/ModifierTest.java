import InterviewQstns.Abs;

public class ModifierTest {
    public static void  main(String[] args){
        Abs abs = new Abs();
        // abs.privateMethod(); -- not possible to access private method in one class from another
       // abs.protectedMethod(); -- not possible to access protected method in one class from another package
        //abs.finalMethod(); // not possible to access final method in one class from another package, possible for public
        abs.publicMethod();
       // abs.defaultMethod();//  -- not possible to access default method in one class from another package
    }
}
