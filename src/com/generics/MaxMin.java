package com.generics;

import java.util.Scanner;

public class MaxMin <I extends Comparable<I>>{

    I max ;
    I checkMaxNum(I firstNum, I secondNum, I thirdNum) {
        max=firstNum;
        if (secondNum.compareTo(max) > 0){
            max=secondNum;
        }
        if (thirdNum.compareTo(max) > 0){
            max=thirdNum;
        }
        return max;
    }

}
