public class Task20 {
    public static void main(String[] args){
        int [] array = {1, 2, 3};

        if (array.length == 0){
            System.out.println(0);
        } else if (array.length <2) {
            System.out.println(array[0] + array[1]);

            
        }else{
            int sum = array[0] + array[1];
            System.out.println(sum);

        }

    }
}
