package Array;

public class targetTOsum {
    static  int[] arr = {3, 5, 6, 7, 2};
    static int target = 11;
    public static void main( String[] args) {
        System.out.println("to sum");
        System.out.println("Result: " + sum(arr, target));
    }



    public static boolean  sum(int arr[],int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }
    }