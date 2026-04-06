public class Task9 {
    public static void main(String[] args){

        int[] nums = {1, 3, 4, 5};
        boolean unlucky = false;

        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == 1 && nums[i + 1] == 3){
                unlucky = true;
            }
        }

        if (unlucky){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
