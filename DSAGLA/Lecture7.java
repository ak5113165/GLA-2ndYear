package DSAGLA;

public class Lecture7 {

    public int singleNumber2(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum = sum + (nums[j] >> i) & 1;
            }
            sum = sum % 3;
            ans = ans | (sum << i);

        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
