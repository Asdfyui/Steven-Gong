public class Main3 {//swap value positions
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int sum, swap, swapp;
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int random = (int)(Math.random()*100 + 1);
            numbers[i] = random;
            sum = sum + numbers[i];
            System.out.println(numbers[i]);
        }
        swapp = numbers[2];
        swap = numbers[3];
        numbers[2] = swap;
        numbers[3] = swapp;

    }
}
