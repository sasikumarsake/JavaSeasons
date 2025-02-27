package arrays;

public class ArraysDemo2 {
    public static void main(String[] args) {

        String [] s = new String[5]; // Array of size 5

        // Printing initial values (should print null for all elements)
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);  // Prints null since String default is null
        }

        // Assigning values to the array
        s[0] = "SASI";
        s[1] = "KUMAR1";
        s[2] = "KUMAR2";
        s[3] = "KUMAR3";
        s[4] = "KUMAR4";
        // s[5] = "KUMAR5"; // ERROR: Index 5 does not exist

        // Corrected loop condition
        for(int i = 0; i < s.length; i++) {  // Changed `<=` to `<`
            System.out.println(s[i]);
        }
    }
}
