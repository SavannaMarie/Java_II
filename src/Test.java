import java.util.Random;

import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Test {
    public static void main(String[] args){

//        IntStream.generate(() -> random.nextInt(10)).mapToObj(i -> String.valueOf(i));

        final Random random = new Random();


        IntStream.generate(() -> random.nextInt(10))
                .limit(10000)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream()
                .sorted((dis, dat) -> Long.compare(dat.getValue(), dis.getValue()))
                .forEach((System.out::println));
//                .forEach((e -> System.out.println(e.getKey() + ": " + e.getValue())));
        new Random().ints(10000, 0, 10);

        /* Create a IntStream of 10,000 int, all of which are random numbers between 0 and 9
           Print the following histogram:
           number : numberOfOccurances
           Sorted by the largest number of occurances
         */





    }

}
