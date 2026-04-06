public class Task16 {
    public static void main(String[] args){


        int[] nums = {1, 2, 3};

        int first = nums[0];
        int last = nums[nums.length-1];
        int mid = nums.length/2 ;

        if (first > last){
            System.out.println(first);

        } else if (first > mid) {
            System.out.println(first);

        } else if (last > mid) {
            System.out.println(last);

        }else{
            System.out.println(mid);
        }


    }
}

