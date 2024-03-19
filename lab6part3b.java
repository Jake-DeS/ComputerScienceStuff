public class lab6part3b {
    public static void main(String[] args) {
        // Create an empty String array called names of length 5
        String[] names = new String[5];

        // Use index notation to enter in 5 names in alphabetical order
        names[0] = "Albert";
        names[1] = "Brianna";
        names[2] = "John";
        names[3] = "Katie";
        names[4] = "Luke";

        // Use a for loop to print out the elements in reverse alphabetical order
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
