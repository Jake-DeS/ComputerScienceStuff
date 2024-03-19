public class lab6part2 {
    public static void main(String[] args) {
        int[] myNumbers = new int[10];

        // Use a for loop to add elements 10 through 1 to the array
        for (int i = 0; i < 10; i++) {
            myNumbers[i] = 10 - i;
        }

        // Use another for loop to print each element on the same line
        System.out.print("Output: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(myNumbers[i] + " ");
        }
    }
}
