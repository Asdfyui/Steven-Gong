public class Main1 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int one = 0;

        for (int i = 0; i < numbers.length; i++) {
            int random = (int)(Math.random()*6 + 1);
            numbers[i] = random;
            if (numbers[i] == 1) {
                one++;
            }
        }
        System.out.println("1 appeared " + one + " times");
    }
}