import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;
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

        
        import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

        public class OrderOfExecution {

            public OrderOfExecution() {
                System.out.println("This is in the constructor");
            }

            {
                System.out.println("This is in a initialization block");
            }

            static {
                System.out.println("This is in a static initialization block");
            }

            public static void main(final String... pArgs) {
                System.out.println("At main");
                new OrderOfExecution();
            }

            static {
                System.out.println("This is in another static initialization block");
            }

            {
                System.out.println("This is in another initialization block");
            }
    
    System.out.println( "Sales for Store #93 " +
            Utils.transactions.stream()
            .map(  t -> {
                try {
                    return Utils.om.readValue(t.getBytes(), Transaction.class);
                } catch (final IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }  )
                    .filter(Objects::nonNull)
                  .filter(t -> t.getStoreNumber() == 93)
                    .map(t ->  t.getItems().stream()
                           .map(i -> i.getUnitPrice().multiply(BigDecimal.valueOf(i.getCount())))
                    .reduce(BigDecimal.ZERO, (a, b) -> a.add(b)))
                    .reduce(BigDecimal.ZERO, (a, b) -> a.add(b))   ); */

        }




    }

}
