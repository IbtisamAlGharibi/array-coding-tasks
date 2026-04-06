public class Task22 {
    public static void main(String[] args){

        int[] array = {2, 2};

        for (int i = 0; i< array.length-1 ; i++){
            if ((array[i] == 2 && array[i+1]==2) || (array[i]==3 && array[i+1] == 3)){
                System.out.println("True");


            }else{
                System.out.println("False");

            }
            }


        }

    }

