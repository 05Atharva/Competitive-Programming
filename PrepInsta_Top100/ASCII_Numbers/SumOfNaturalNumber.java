package PrepInsta_Top100.ASCII_Numbers;

import java.util.Scanner;

public class SumOfNaturalNumber {

    public static int calculateSumOfNatural(int n){
        int sum=0;
        //Loop
        for(int i=0;i<=n;i++){
            sum+=i;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Sum of N natural numbers is : "+calculateSumOfNatural(n));
        sc.close();
    }
}
