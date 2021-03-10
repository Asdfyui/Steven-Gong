import java.util.Arrays;//addon to array

public class Main {
    public static int[] addOn(int[] array, int number) {
        int[] newarray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++){
            newarray[i] = array[i];
            newarray[array.length] = number;
        }
            return newarray;
    }

    public static void main(String[] args) {
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
            System.out.println(array[i]);
        }
        System.out.println("****");
        System.out.println(Arrays.toString(addOn(array, 656)));
    }
}




