package Array;
import java .util.*;
public class chunkArr {
    public List<List<Integer>> chunk(int[] arr, int size) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i += size) {

            List<Integer> temp = new ArrayList<>();

            for (int j = i; j < Math.min(i + size, arr.length); j++) {
                temp.add(arr[j]);
            }

            ans.add(temp);
        }

        return ans;
    }
}
