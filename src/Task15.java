public class Task15 {
    public static void main(String[] args){
        int[] a = {1,2};
        int[] b = {4,5};

        int [] nums = new int[4];
        nums[0] = a[0];
        nums[1] = a[1];
        nums[2] = b[0];
        nums[3] = b[1];

        for (int i=0 ; i< nums.length-1; i++){
            System.out.println(nums[i]);
        }
    }
}
