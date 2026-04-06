public class Task14 {
    public static void main(String[] args){

        int[] a = {1,2,3};
        int[] b = {1,2,3};

        int countA = 0;
        int countB = 0;

        for (int i =0; i < a.length-1; i++ ){
            if (a[0]== 1){
                 countA +=1;

            }
            System.out.println(countA);
        }

        for (int i =0; i < b.length-1; i++ ){
            if (b[0]== 1){
                countB +=1;

            }
            System.out.println(countB);
        }

    }
}
