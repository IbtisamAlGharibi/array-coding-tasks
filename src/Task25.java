public class Task25 {
    public static void main(String[] args){
        int [] array = {1, 2, 3};
        int [] array2 = new int[2];

        if (array.length < 2){
            array2 = array;
            System.out.println(array2);

        }else{
            array2[0]= array[0];
            array2[1]= array[1];
            System.out.println(array2);


        }


    }
}
