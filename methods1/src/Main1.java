import java.util.Arrays;//addin to array

public class Main1 {
    public static int[] addin(int[] array, int number, int number1) {
        int[] newarray = new int[array.length + 1];


        for (int i = 0; i < newarray.length; i++) {

            if (i == number1-1){
                newarray[number1-1] = number;
            }
            else if (newarray[number1 - 1] == number){
                newarray[i] = array[i-1];
            }
            else {
                newarray[i] = array[i];
            }


        }
        return newarray;
    }
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
            System.out.println(array[i]);
        }

        System.out.println("****");
        System.out.println(Arrays.toString(addin(array, 1222, 4)));
    }
}