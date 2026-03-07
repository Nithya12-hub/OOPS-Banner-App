/**
 * OOPSBannerApp
 * UC5: Print the "OOPS" banner using concise array initialization
 * and String.join() method.
 *
 * @author Nithya
 * @version 1.4
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize banner lines in one statement
        String[] bannerLines = {
            String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "*     *"),
            String.join("  ", "*     *", "*     *", "*     *", "*     *"),
            String.join("  ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*      ", "*      "),
            String.join("  ", "*     *", "*     *", "*      ", "*      "),
            String.join("  ", " ***** ", " ***** ", "*      ", "*      ")
        };

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}