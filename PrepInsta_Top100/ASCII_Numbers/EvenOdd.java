package PrepInsta_Top100.ASCII_Numbers;


import java.util.Scanner;

public class EvenOdd {

    public static void printEvenOdd(int a){
        if(a % 2==0){
            System.out.println("It is a even number");
        }else{
            System.out.println("It is a odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        printEvenOdd(a);
        sc.close();


    }
}
