package com.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxMin <I extends Comparable<I>>{

    I max ;
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
