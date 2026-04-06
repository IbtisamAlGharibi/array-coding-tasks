public class Task26 {
    public static void main(String[] args){
        int[] a ={1, 2, 3};
        int [] b = {7, 9, 8};
        int [] array = new int[2];

        int sizeA = a.length;
        int sizeB = b.length;
        if (sizeA ==0 && sizeB == 0){

            System.out.println("both arrays are empty");

        } else {
            array[0] = a[0];
            array[1] = b[0];

            System.out.println(array);
        }
    }
}
