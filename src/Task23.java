public class Task23 {
    public static void main(String[] args){
        int [] a = {1,2};
        int [] b = {3,4};

        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA > sumB){
            for(int i=0; i< a.length-1; i++){
                System.out.println(a[i]);
            }

        }else{
            for(int i=0; i< b.length-1; i++){
                System.out.println(b[i]);
            }

        }


    }
}
