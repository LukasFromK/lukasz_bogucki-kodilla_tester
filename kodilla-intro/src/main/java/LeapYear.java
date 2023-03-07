public class LeapYear {
    public static void main(String[] args) {
        int year = 2023;

        if (year > 0 || year == 0 || year < 0) {
            isLeapYear(year);
        } else {
            System.out.println("Something went wrong!");
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}