package PrepInsta_Top100.ASCII_Numbers;

import java.util.Scanner;

public class PrimeNumber {

    public static void printPrimeNumber(int n){
      int count =0;
      if(n<2){
        System.out.println("It is not a prime number");
        System.exit(0);
      }
      for(int i=2;i<=n;i++){
        if(n % i ==0){
            count+=i;
        }
      }
      if(count>2){
        System.out.println("It is not a prime");
      }else{
        System.out.println("It is a prime number");
      }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        printPrimeNumber(n);
        sc.close();

    }
}
