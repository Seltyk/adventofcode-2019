import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Advent of Code 2019, day 1 puzzle 1: The Tyranny of the Rocket Equation</br>
 * Take an input file (a line-separated list of integers), divide by three,
 * round down, and subtract two. Add the results.
 */
public class RocketEquation {
	public static void main(String[] args) {
		long out = 0;

		try(Scanner file = new Scanner(new FileReader("inputs/1-1.txt"))) {
			String line = file.nextLine();

			while(line != null) {
				out += Integer.parseInt(line)/3 - 2;
				line = file.nextLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
		} catch(NoSuchElementException e) {}

		System.out.println(out);
	}
}
