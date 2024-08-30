import java.util.Scanner;

public class warmup_sleepin {
    public static void main(String[] args) {
        System.out.println("Weekday:");
        Scanner scan = new Scanner(System.in);
        boolean Weekday = scan.nextBoolean(); 
        System.out.println("Vacation:");
        boolean Vacation = scan.nextBoolean(); 
        System.out.println("Sleep In:");
        System.out.println(sleepIn(Weekday,Vacation));
        
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
