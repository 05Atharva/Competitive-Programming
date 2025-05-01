package PrepInsta_Top100.ASCII_Numbers;

import java.util.Scanner;

public class SumInRange {

    public static int calculateSuminRange(int Number1,int Number2){
        int sum=0;
        for(int i=Number1;i<=Number2;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Number1 =sc.nextInt();
        int Number2 =sc.nextInt();

        System.out.println("Sum of Numbers in Range is "+calculateSuminRange(Number1, Number2));
        sc.close();

    }
}
