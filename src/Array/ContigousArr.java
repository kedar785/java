package Array;

import java.util.HashMap;
public class ContigousArr {

        public int findMaxLength(int[] nums) {

            HashMap<Integer, Integer> map = new HashMap<>();

            int balance = 0;
            int subArr = 0;

            map.put(0, -1);

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == 0)
                    balance--;
                else
                    balance++;

                if (map.containsKey(balance)) {
                    subArr = Math.max(subArr, i - map.get(balance));
                } else {
                    map.put(balance, i);
                }
            }

            return subArr;
        }
    }

