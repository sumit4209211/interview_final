package leetcode.week1;
/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.

        Note:

        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

        Example 1:

        Input: [2,2,1]
        Output: 1
        Example 2:

        Input: [4,1,2,1,2]
        Output: 4*/
public class Ex1 {
    public static int singleNumber(int[] nums) {
        int result=0;
        int length=nums.length;
        for(int i=0;i<length;i++){
            result=result^nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1,2}));

    }
}
/*
class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> no_duplicate_list = new ArrayList<>();

        for (int i : nums) {
            if (!no_duplicate_list.contains(i)) {
                no_duplicate_list.add(i);
            } else {
                no_duplicate_list.remove(new Integer(i));
            }
        }
        return no_duplicate_list.get(0);
    }
}
*/
