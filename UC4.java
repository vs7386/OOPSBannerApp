/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array
 * to store banner lines and iterating through them using
 * a for-each loop. This eliminates repetitive print statements
 * and improves modularity, readability, and maintainability.
 *
 * @author Srirangam Venkata Shrawan
 * @version 4.0
 */

// Extend the application by using a String array
// to hold banner lines and print them using a loop.

public class UC4 {

    public static void main(String[] args) {

        // Define an array with 7 lines (banner height)
        String[] lines = new String[7];

        // Populate each line using String.join()
        lines[0] = String.join("  ",
                " ******** ",
                " ******** ",
                " ******** ",
                " ******** ");

        lines[1] = String.join("  ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *        ");

        lines[2] = String.join("  ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *        ");

        lines[3] = String.join("  ",
                " *      * ",
                " *      * ",
                " ******** ",
                " ******** ");

        lines[4] = String.join("  ",
                " *      * ",
                " *      * ",
                " *        ",
                "         *");

        lines[5] = String.join("  ",
                " *      * ",
                " *      * ",
                " *        ",
                "         *");

        lines[6] = String.join("  ",
                " ******** ",
                " ******** ",
                " *        ",
                " ******** ");

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}