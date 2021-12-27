package StreamSamples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ListSamples {

    private static void doSomething(int i){
        System.out.println("something is printed " + i);
    }

    public static void main (String[] args) {
        String name = 1+"";
        //System.out.println("name is "+ name);

        int[] intArray = {90, 9,4,6,5,7,8,2,0,12, 78,3};
        String[] strings = {"Linda", "Ammu", "Shine"};

       // System.out.println("Array size is " +intArray.length);


        List<Integer> intList = Arrays.asList(2, 6, 4, 3, 8, 9, 11, 12);
        System.out.println(intList.toString());

        //Collections.sort(intList);
        Collections.swap(intList, 0,1);
        System.out.println(intList.toString());
        intList.sort(Comparator.reverseOrder());
       // System.out.println("List size is " + intList.size());

        //Arrays.sort(intArray); // sorting array in ascending
        // Arrays.sort(strings, Comparator.reverseOrder());

        //System.out.println(Arrays.toString(strings));

 //       System.out.println(Arrays.toString(intArray));


        IntStream intStream = Arrays.stream(intArray);
        //System.out.println("Sum is" + intStream.reduce(0, (a,b)-> a+b));

        IntStream intStream1 = Arrays.stream(intArray);
       // System.out.println("sum is " + intStream1.reduce(0, Integer::sum));



       /* for (int i =0 ; i< intArray.length-1; i++){
            for (int j = 0; j < intArray.length-1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;

                }
            }
        }*/

        //Collectors.groupingBy()
       Arrays.stream(intArray).forEach(System.out::println);
       // Arrays.stream(intArray).filter(x-> x>1);

      //  Arrays.stream(intArray).sorted().forEach(StreamSamples.ListSamples::doSomething);

        List<String> nameList = new ArrayList<>();
        nameList.add("Venkatesh");
        nameList.add("Jithin");
        nameList.add("Linda");

        List<Integer> intList1 = Arrays.asList(2, 6, 4, 3, 8, 9, 11, 12);
        nameList.stream().sorted().forEach(System.out::println);

    }
}
