package com.generics;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class Main {
    public static <Strings> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWellCome To Find Maximum Problem using Generics project.\n");

        MaxMin<String> maxMin = new MaxMin();
        System.out.print("Enter The First Number (1st): ");
        Strings firstNum = (Strings) scanner.nextLine();
        System.out.print("Enter The Second Number (2nd): ");
        Strings secondNum = (Strings) scanner.nextLine();
        System.out.print("Enter The Third Number (3rd): ");
        Strings thirdNum = (Strings) scanner.nextLine();

        Strings result = (Strings) maxMin.checkMaxNum((String) firstNum, (String) secondNum, (String) thirdNum);
        System.out.println("\n"+result+" is Max Number.");
    }
}
