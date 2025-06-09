public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();

        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);

        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        System.out.println("Before change:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);

        t1.nextSecond();
        t2.previousSecond();

        System.out.println("\nAfter change:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
    }
}
