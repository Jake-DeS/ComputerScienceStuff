public class lab6part3 {
    public static void main(String[] args) {
        // Create an empty String array called names of length 5
        String[] names = new String[5];

        // Use index notation to enter in 5 names in alphabetical order
        names[0] = "Albert";
        names[1] = "Brianna";
        names[2] = "John";
        names[3] = "Katie";
        names[4] = "Luke";

        // Use a for loop to print out the elements in the array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
