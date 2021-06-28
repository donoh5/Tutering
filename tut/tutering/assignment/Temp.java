package assignment;
import java.util.*;
public class Temp {
	public static void main (String[] agrs) {
		Random random = new Random();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter how many code u want : ");
		for (int loop = inp.nextInt();loop != 0; loop --) {
			String consonants = "BCDFGHJKLMNPQRSTVWXZY";
			String vowels = "AEIOUY";
			char ch1 = consonants.charAt(random.nextInt(20));
			char ch2 = vowels.charAt(random.nextInt(5));
			char ch3 = consonants.charAt(random.nextInt(21));
			char ch4 = vowels.charAt(random.nextInt(6));
			char ch5 = (char)((((int)ch1 + ((int)ch2 * 2) + (int)ch3 + ((int)ch4 * 2)) % 26) + 65);
			System.out.printf("Promo Code is %c%c%c%c%c%n", ch1, ch2, ch3, ch4, ch5);
		}
	}
}