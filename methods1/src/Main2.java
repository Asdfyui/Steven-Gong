import java.util.Arrays;// delete value in array

public class Main2 {
    public static int[] remove(int[] array) {
        int[] newarray = new int[array.length - 1 ];
        for (int i = 0; i < array.length - 1; i++){
            newarray[i] = array[i];
        }
        return newarray;
    }

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
            System.out.println(array[i]);
        }

        System.out.println("****");
        System.out.println("Deleted value is " + array[array.length - 1]);
        System.out.println(Arrays.toString(remove(array)));
    }
}
