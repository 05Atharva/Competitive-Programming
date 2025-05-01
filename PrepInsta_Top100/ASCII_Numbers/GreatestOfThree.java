package PrepInsta_Top100.ASCII_Numbers;

import java.util.Scanner;

public class GreatestOfThree {
    public static int calculateGreatestOfThree(int num1,int num2,int num3){
        if(num1 >= num2 && num1 >= num3){
            return num1;
        }
        else if(num2 >= num1 && num2 >= num3){
            return num2;
        }else{
            return num3;
        }
    }

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();


        System.out.println("Greatest Number is "+calculateGreatestOfThree(num1, num2, num3));
        sc.close();
    }
}
