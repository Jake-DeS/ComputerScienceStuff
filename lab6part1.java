public class lab6part1 {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 11, 7, 22};

        // Use index notation to update elements
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 2 * i + 1;
        }

        // Print the updated array
        System.out.print("Updated array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
