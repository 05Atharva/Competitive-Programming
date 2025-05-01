package PrepInsta_Top100.ASCII_Numbers;

import java.util.Scanner;

public class PositiveNegative {

    public static void printPositiveNegative(int a){
        if(a>0){
            System.out.println("It is a postive number");
        }else{
            System.out.println("It is a negative number");
        }
    } 

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();

        printPositiveNegative(a);
        sc.close();

    }
}