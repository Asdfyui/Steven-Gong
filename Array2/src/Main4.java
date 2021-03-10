public class Main4 {//reverse order
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i=numbers.length-1; i>=0 ;i--) {
            int random = (int)(Math.random()*100 + 1);
            numbers[i] = random;
            System.out.println(numbers[i] + "");

        }
    }
}
