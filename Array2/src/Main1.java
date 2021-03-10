public class Main1 {//average value
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int random = (int)(Math.random()*100 + 1);
            numbers[i] = random;
            sum = sum + numbers[i];
            System.out.println(numbers[i]);

        }
        System.out.println("The average value is " + sum/10 );
    }
}
