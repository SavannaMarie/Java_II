public class Study {
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            System.out.println(true);
            return true;
        }
        if (!aSmile && !bSmile) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        sleepIn(true, false);
        monkeyTrouble(true, false);
        sumDouble(2,5);
    }
}