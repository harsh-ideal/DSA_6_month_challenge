import java.util.ArrayList;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // Step 1: 
        int minIndexSum = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<>();


        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int indexSum = i + j; 

                    if (indexSum < minIndexSum) {
                        minIndexSum = indexSum; 
                        result.clear(); 
                        result.add(list1[i]); 
                    } 

                    else if (indexSum == minIndexSum) {
                        result.add(list1[i]);
                    }
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }
}


Link:https://leetcode.com/problems/minimum-index-sum-of-two-lists/