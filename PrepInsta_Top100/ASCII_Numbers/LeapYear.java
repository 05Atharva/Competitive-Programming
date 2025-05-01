package PrepInsta_Top100.ASCII_Numbers;

public class LeapYear {
    public static void main(String[] args) {
        int year=2000;

        if((year % 4==0 && year % 100 !=0)|| year % 400 ==0) {
            System.out.println("It is Leap Year");
        }else{
            System.out.println("It is not a Leap Year");
        }
    }
}
