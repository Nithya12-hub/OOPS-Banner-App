/**
 * OOPSBannerApp
 * UC3: Print the "OOPS" banner using String.join()
 * This refactors UC2 to avoid string concatenation
 * and improve memory efficiency.
 *
 * @author Nithya
 * @version 1.2
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "));
        System.out.println(String.join("  ", "*     *", "*     *", "*     *", "*     *"));
        System.out.println(String.join("  ", "*     *", "*     *", "*     *", "*     *"));
        System.out.println(String.join("  ", "*     *", "*     *", " ***** ", " ***** "));
        System.out.println(String.join("  ", "*     *", "*     *", "*      ", "*      "));
        System.out.println(String.join("  ", "*     *", "*     *", "*      ", "*      "));
        System.out.println(String.join("  ", " ***** ", " ***** ", "*      ", "*      "));
    }
}