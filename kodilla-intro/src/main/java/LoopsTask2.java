public class LoopsTask2 {
    public static void main(String[] args) {

        int[] numbers = new int[] {5, 10, 15};

        int sum = sumNumbers(numbers);
        System.out.println(sum);
    }

    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}
