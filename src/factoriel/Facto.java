package factoriel;

import java.util.Scanner;

public class Facto {
    public static void factorialNumber(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial(int n){
        if (n==1) return 1;
        else return n=n*(factorial(n-1));
    }
}
