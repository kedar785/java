package Sorting;

public class Arr_sort {
    public static void main(String[] args) {
        int [] arr={3,5,7,8,9};
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1])
                sorted=false;
            break;
        }
        System.out.println("Array is sorted  : "+ sorted);
    }
}
