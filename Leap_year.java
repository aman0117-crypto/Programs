public class Leap_year {
    public static void main(String[] args) {
        int year=2025;
        if (year%400==0 || year%4==0 && year%100!=0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
    
}
