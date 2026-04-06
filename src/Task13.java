public class Task13 {
    public static void main(String[]args){
        int[] nums ={4, 5, 6};
        int[] nums2 = new int[nums.length*2];
         for (int i =0; i< nums2.length-1; i++){
              nums2[i] = 0;
              nums2[nums2.length -1] = nums[nums.length -1];
              System.out.println(nums2[i]);


         }

    }
}
