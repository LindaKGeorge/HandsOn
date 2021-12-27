package Experiments;

public class NumberPattern {

    public static void main(String[] args){
        for(int i=2; i<8; i++){
           // System.out.println(i);
            for(int j=1;j<=i-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
