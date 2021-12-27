package StreamSamples;

import java.util.Arrays;
import java.util.List;

public class StreamSamples {

    public static void main(String[] args)
    {
        Integer[] intArray = {1,5,2,7,4,6,9};
        List<Integer> intList = Arrays.asList(intArray);

        intList.forEach(System.out::println);

        intList.stream().sorted(); // sorting
        intList.stream().filter(x -> x>3); //filter

        intList.stream().forEach(System.out::println);

        intList.forEach(System.out::println);

    }
}
