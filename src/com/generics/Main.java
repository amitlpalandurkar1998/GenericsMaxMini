package com.generics;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWellCome To Find Maximum Problem using Generics project.\n");

        MaxMin<Integer> maxMin = new MaxMin();
        System.out.print("Enter The First Number (1st): ");
        Integer firstNum = scanner.nextInt();
        System.out.print("Enter The Second Number (2nd): ");
        Integer secondNum = scanner.nextInt();
        System.out.print("Enter The Third Number (3rd): ");
        Integer thirdNum = scanner.nextInt();

        Integer result = maxMin.checkMaxNum( firstNum, secondNum, thirdNum);

        System.out.println("\n"+result+" is Max Number.");

    }
}
