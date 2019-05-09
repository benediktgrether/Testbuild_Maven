package de.hfu;
import java.util.Scanner;
/**
 * Ein Input-Programm in Java.
 * Dies ist ein Javadoc-Kommentar.
 *
 * @author John Doe
 * @version 1.0
 */
public class App 
{
    private static Scanner scanner;

	/**
     * Hauptprogramm.
     *
     * @param args Kommandozeilenparameter
     */
    public static void main( String[] args )
    {
		System.out.println("Input: ");
		scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(input.toUpperCase());
    }
}
