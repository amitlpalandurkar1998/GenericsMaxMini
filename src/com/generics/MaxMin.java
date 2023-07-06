package com.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxMin <I extends Comparable<I>>{

    I max ;
//    I checkMaxNum(I firstNum, I secondNum, I thirdNum) {
//        max=firstNum;
//        if (secondNum.compareTo(max) > 0){
//            max=secondNum;
//        }
//        if (thirdNum.compareTo(max) > 0){
//            max=thirdNum;
//        }
//        return max;
//    }
//    I checkMaxNum(I firstNum, I secondNum, I thirdNum) {
//        I [] array = new <I> [3];
//        I firstNum1 = firstNum;
//        array[0]= firstNum1;
//        array[1]=secondNum;
//        array[2]=thirdNum;
//        List<I> Array;
//        max = Array.sort(array<I>);
//        result max;
//    }
    I checkMaxNum(I firstNum, I secondNum, I thirdNum) {
        Integer[] array = new Integer[3];
        array[0] = (Integer) firstNum;
        array[1] = (Integer) secondNum;
        array[2] = (Integer) thirdNum;

        Arrays.sort(array);

        I max = (I) array[array.length - 1];
        return max;
    }

}
