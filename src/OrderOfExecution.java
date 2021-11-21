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
}