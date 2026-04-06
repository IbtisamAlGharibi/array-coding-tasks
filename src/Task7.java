public class Task7 {
    public static void main(String[] args){}

    int[] nums = {1, 2, 3, 4};

    int mid = nums.length/2;
    int mid2 = nums.length/2 + 1;

    int [] nums2 = {mid , mid2};

    for ( int i=0; i< nums2.length-1; i++){
        System.out.println(nums2[i]);
    }
}
