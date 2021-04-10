package com.company.Lab7.Assignment2;

public class ArrayClassDemo {


    public double getTotal(int array[][]) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
        }
        return total;
    }

    public double getAverage(int array[][]) {
        return getTotal(array) / (array.length * array[0].length);
    }

    public int getRowTotal(int array[][], int i) {
        int getTotalValuesInRow = 0;
        for (int j = 0; j < array[i].length; j++) {
            getTotalValuesInRow += array[i][j];
        }
        return getTotalValuesInRow;
    }

    public int getColumnTotal(int array[][],int i) {
        int getColumnTotal = 0;
        for (int j = 0; j <array.length ; j++) {
            getColumnTotal += array[j][i];
        }
        return getColumnTotal;
    }

    public int getHighestInRow(int array[][],int i){
        int highest = 0;
        for (int j = 0; j <array[i].length ; j++) {
            if (array[i][j] > highest){
                highest = array[i][j];
            }
        }
        return highest;
    }
    public int getLowesInRow(int array[][], int i){
        int lowest=0;
        for (int j = 0; j <array[i].length ; j++) {
            if (array[i][j] > lowest){
                lowest = array[i][j];
            }
        }
        return lowest;
    }
}
class Main{
    public static void main(String[] args) {
        int array[][] = {{2,3,4,5,6}
                        ,{4,5,3,2,1}
                        ,{4,5,3,2,1}
                        ,{4,5,3,2,1}};

        ArrayClassDemo obj = new ArrayClassDemo();
        System.out.println(obj.getAverage(array));
        System.out.println(obj.getTotal(array));
        System.out.println(obj.getRowTotal(array,3));
        System.out.println(obj.getLowesInRow(array,1));
        System.out.println(obj.getHighestInRow(array,2));
        System.out.println(obj.getColumnTotal(array,2));
    }
}
