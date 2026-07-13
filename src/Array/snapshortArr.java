package Array;
import java.util.*;
public class snapshortArr {

    List<int[]>[] arr;
    int snap = 0;

    public  snapshortArr (int length) {
        arr = new ArrayList[length];
        for (int i = 0; i < length; i++) {
            arr[i] = new ArrayList<>();
        }
    }

    public void set(int index, int val) {
        arr[index].add(new int[]{snap, val});
    }

    public int snap() {
        return snap++;
    }

    public int get(int index, int snap_id) {
        List<int[]> list = arr[index];
        int l = 0, r = list.size() - 1, ans = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (list.get(m)[0] <= snap_id) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans == -1 ? 0 : list.get(ans)[1];
    }
}
