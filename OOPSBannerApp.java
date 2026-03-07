/**
 * OOPSBannerApp
 * UC4: Print the "OOPS" banner using String Array and Loop
 * Refactored for better modularity and reusability.
 *
 * @author Nithya
 * @version 1.3
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines in a String array
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