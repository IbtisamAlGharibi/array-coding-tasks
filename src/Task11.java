public class Task11 {
    public static void main(String[] args){
        int[] nums = {1, 2, 3};

        for (int i =0; i < nums.length -1;i++ ){
            if (nums[0] > nums[nums.length-1]){
                nums[0] = nums[0];
                nums[1] = nums[0];
                nums[2] = nums[0];
               System.out.println(nums);
            }else {
                nums[0] = nums[nums.length-1];
                nums[1] = nums[nums.length-1];
                nums[2] = nums[nums.length-1];
                System.out.println(nums);
            }

        }

    }
}
