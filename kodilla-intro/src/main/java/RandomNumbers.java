import java.util.Random;

public class RandomNumbers {
    int max = 5000;
    int theLowestNumber;
    int theHighestNumber;

    public int sumRandomNumbers() {
        Random random = new Random();
        int sum = 0;
        int highestNumber = 0;
        int lowestNumber = 30;
        while (sum <= max) {
            int drawNumber = random.nextInt(31);
            sum = sum + drawNumber;
            if (drawNumber < lowestNumber) {
                lowestNumber = drawNumber;
                lowestNumber = this.theLowestNumber;
            }
            if (drawNumber > highestNumber) {
                highestNumber = drawNumber;
                highestNumber = this.theHighestNumber;
            }
        }
        return sum;
    }

    public int theLowestValue() {
        int lowValue = this.theLowestNumber;
        return lowValue;
    }

    public int theHighestValue() {
        int highValue = this.theHighestNumber;
        return highValue;
    }
}
