import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        // Create a map to count the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert the map keys to a list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Sort the list based on frequency (ascending) and value (descending)
        Collections.sort(list, (a, b) -> {
            int freqCompare = Integer.compare(map.get(a), map.get(b));
            if (freqCompare == 0) {
                return Integer.compare(b, a);
            } else {
                return freqCompare;
            }
        });

        // Create the result array
        int[] result = new int[nums.length];
        int index = 0;
        for (int num : list) {
            int frequency = map.get(num);
            for (int i = 0; i < frequency; i++) {
                result[index++] = num;
            }
        }

        return result;
    }
}
