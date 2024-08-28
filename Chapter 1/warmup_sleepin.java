public class warmup_sleepin {
    public static void main(String[] args) {
        System.out.println("\t\tWeekday  Vacation  SleepIn");
        System.out.printf("\t\tFalse    False     %s\n", sleepIn(false,false));
        System.out.printf("\t\tTrue     False     %s\n", sleepIn(true, false));
        System.out.printf("\t\tFalse    True      %s\n", sleepIn(false, true));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}