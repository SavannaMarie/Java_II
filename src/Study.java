public class Study {
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        sleepIn(true, false);
    }
}