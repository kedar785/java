package Sorting;
import java.util.*;
public class common_element {
    public static ArrayList<Integer> commonElement(int arr1[],int arr2[]) {
        int i = 0, j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
   if(arr1[i]==arr2[j]){
       ans.add(arr1[i]);
       i++;
       j++;
   }
   else if(arr1[i]<arr2[j]) i++;
   else j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr1={1,3,6,4,2};
        int []arr2={3,8,1,2,4};
        System.out.println(commonElement(arr1,arr2));
    }
}
