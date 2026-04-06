public class Task6 {
    public static void main(String[] args){

        int[] nums = {1, 2, 3};

        for (int i=0; i < nums.length -1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3)
                        nums[0] = 0;
                        nums[1] = 0;
                        nums[2] = 0;
                        System.out.println(nums);

        }
    }
}
