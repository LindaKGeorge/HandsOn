package Experiments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClosestNumber {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int input= 9;
        int diff = Integer.MAX_VALUE;
        int closest = 0;

        int[] intArray = {5, 6, 3, 4, 8, 9, 10,-1,-2,-6, -9, -11};
        List<Integer> numberLst = Arrays.stream(intArray).boxed().sorted()
                .collect(Collectors.toList());

       /* if(input < numberLst.stream().findFirst().get())
            closest = numberLst.stream().findFirst().get();
        else if (input > numberLst.stream().sorted(Collections.reverseOrder()).findFirst().get())
            closest = numberLst.stream().sorted(Collections.reverseOrder()).findFirst().get();

        else {*/
            for (int x : numberLst) {
                if (Math.abs(input - x) < diff) {
                    diff = (Math.abs(input - x));
                    closest = x;
                }
            }
       // }

        System.out.println("Closest Number is " + closest );
        System.out.println("Total time " + Math.subtractExact(System.currentTimeMillis(),start));
    }
}
