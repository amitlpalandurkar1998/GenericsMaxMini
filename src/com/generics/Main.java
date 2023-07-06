package com.generics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWellCome To Find Maximum Problem using Generics project.\n");

        MaxMin<Float> maxMin = new MaxMin();
        System.out.print("Enter The First Number (1st): ");
        Float firstNum = scanner.nextFloat();
        System.out.print("Enter The Second Number (2nd): ");
        Float secondNum = scanner.nextFloat();
        System.out.print("Enter The Third Number (3rd): ");
        Float thirdNum = scanner.nextFloat();

        Float result = maxMin.checkMaxNum(firstNum,secondNum,thirdNum);
        System.out.println("\n"+result+" is Max Number.");
    }
}
