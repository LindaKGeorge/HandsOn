import InterviewQstns.Abs;

public class ModfierTest1 extends Abs {
    public static void  main(String[] args){
        ModfierTest1 modfierTest1 = new ModfierTest1();
        System.out.println(modfierTest1.name);
        // abs.privateMethod(); -- not possible to access private method in one class from another
        modfierTest1.protectedMethod(); //-- not possible to access protected method in one class from another package
        //modfierTest1.finalMethod(); // not possible to access final method in one class from another package, possible for public
        modfierTest1.publicMethod();
        // abs.defaultMethod();//  -- not possible to access default method in one class from another package
    }
}
