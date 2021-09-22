package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 54, 3};
        printArray(arr);
    }

    //5 4 3

    static void printArray(int[] numbers) {
        int fromLast = 0;
        int fromFirst = 0;


            for (int index = numbers.length-1; index >= 0; index--) {
                fromLast = index;
                System.out.print(numbers[index] + "  ");

                for (int index2 = 0; index2 <= numbers.length - 1; index2++) {
                    fromFirst = index2;
                }
                System.out.println(String.valueOf(fromLast));
            }


    }



}
