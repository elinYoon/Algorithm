package study;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        //Sanity check
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                current = 0;
            } else {
                current += 1;
            }
            max = Math.max(max, current);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();

        int[] i = { 1,1,0,1,1,1};

        int result = maxConsecutiveOnes.findMaxConsecutiveOnes(i);
        System.out.println(result);
    }

}
