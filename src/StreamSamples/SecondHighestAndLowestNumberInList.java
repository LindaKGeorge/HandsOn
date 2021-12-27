package StreamSamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestAndLowestNumberInList {
    public static void main (String[] args){

        List<Integer> numberList = Arrays.asList(2,3,5,2,2,8,9,0,1,5,6,24,25,34,23,25,40,37,38,39);
        Collections.sort(numberList);

        numberList.forEach(System.out::print);

        int secondHighestNumber = numberList.stream().sorted(Collections.reverseOrder()).distinct().limit(3).skip(1).findFirst().get();
        int secondLowestNumber = numberList.stream().sorted().distinct().skip(1).findFirst().get();

        System.out.println();
        System.out.println("Second Highest Number "+secondHighestNumber );
        System.out.println("Second Lowest Number "+secondLowestNumber );


    }
}
