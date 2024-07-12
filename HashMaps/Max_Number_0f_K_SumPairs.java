/**
 * For the problem "Max Number of K-Sum Pairs", visit 
 * <a href="https://leetcode.com/problems/max-number-of-k-sum-pairs/">this link</a>.
 */
import java.util.HashMap;
public class Max_Number_of_K_Sum_Pairs {
    public static void main(String[] args) {
        int[]nums={1,2,3,4};
        int  k = 5;
        System.out.println(maxOperations(nums,k));
    }
    public static int maxOperations(int[] nums, int k) {
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int c = k - num;
            if (map.containsKey(c)) {
                cnt++;
                if(map.get(c)==1){
                    map.remove(c);
                }
                else{
                    map.put(c, map.get(c) - 1);
                }
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return cnt;
    }
}
