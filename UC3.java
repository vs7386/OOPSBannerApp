/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class extends the functionality of Use Case 2 by improving
 * the way the "OOPS" banner is constructed and displayed.
 * It focuses on enhancing code readability and efficiency
 * by utilizing the String.join() method to create each line
 * of the banner.
 *
 * This approach overcomes the drawbacks of using the +
 * operator for string concatenation, which can create
 * multiple intermediate String objects in memory.
 *
 * @author Srirangam Venkata Shrawan
 * @version 3.0
 */

// Extend use case UC2 to use String.join() method
// to create each line of the "OOPS" banner instead
// of concatenating strings with the + operator.

public class UC3 {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Line 1
        System.out.println(String.join("  ",
                " ******** ",
                " ******** ",
                " ******** ",
                " ******** "));

        // Line 2
        System.out.println(String.join("  ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *        "));

        // Line 3
        System.out.println(String.join("  ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *        "));

        // Line 4
        System.out.println(String.join("  ",
                " *      * ",
                " *      * ",
                " ******** ",
                " ******** "));

        // Line 5
        System.out.println(String.join("  ",
                " *      * ",
                " *      * ",
                " *        ",
                "         *"));

        // Line 6
        System.out.println(String.join("  ",
                " *      * ",
                " *      * ",
                " *        ",
                "         *"));

        // Line 7
        System.out.println(String.join("  ",
                " ******** ",
                " ******** ",
                " *        ",
                " ******** "));
    }
}