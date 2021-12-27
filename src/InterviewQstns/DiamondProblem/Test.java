package InterviewQstns.DiamondProblem;

public class Test implements Interface2, Interface3 {

    public static void main(String[] args){
       // Test t1 = new Test();
       // t1.m1();

        new Test().m1();
    }

    @Override
    public void m1() {
        Interface3.super.m1();
    }
}
