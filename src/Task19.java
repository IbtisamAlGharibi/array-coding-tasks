public class Task19 {
    public static void main(String[] args){
        int [] array = {1, 2, 3};
        int [] rotated = new int[3];

        rotated[0] = array[2];
        rotated[1] = array[1];
        rotated[2] = array[0];
        System.out.println(rotated);
    }
}
