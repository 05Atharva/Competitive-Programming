package PrepInsta_Top100.ASCII_Numbers;

import java.util.Scanner;

public class PrimeRangeNumber {

    public static boolean checkPrimeRange(int num){
        if(num<2) return false;

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Starting Number is: ");
        int num1 =sc.nextInt();
        System.out.println("Ending Number is: ");
        int num2 =sc.nextInt();


        System.out.println("Prime numbers between "+num1+" and " +num2+ " is ");
        for(int i=num1;i<=num2;i++){
            if(checkPrimeRange(i)){
                System.out.print(i + " ");

            }
        }
        
        sc.close();

    }
}
