public class arrayPractice {
    public static void main(String[] args) {

        int[] numbers = new int[5]; // Initialize array with size 5

        numbers[0] = 1;
        numbers[1] = 4;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = -5;

        int sum = sumOfPositives(numbers);
        System.out.println("Sum of positive numbers: " + sum);
    }

    public static int sumOfPositives(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) { // Check if the number is positive
                sum += nums[i]; // Add positive number to sum
            }
        }
        return sum;
    }
}