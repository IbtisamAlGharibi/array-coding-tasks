public class Task24 {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4};
         int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;

        for (int i=0; i< array.length -1; i++){
            System.out.println(array[i]);

        }
    }
}
