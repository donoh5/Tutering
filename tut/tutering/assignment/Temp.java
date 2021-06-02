package assignment;

import java.util.*;

public class Temp {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		char one = inp.nextLine().charAt(0);
		inp.close();
         
		int oneNum = (int)one;
		if ((65 <= oneNum && oneNum <=90) || (97 <= oneNum && oneNum <=122))
			if (oneNum == 65 || oneNum == 69 || oneNum == 73 ||  oneNum == 79 ||  oneNum == 85 || oneNum == 97 || oneNum == 101 || oneNum == 111 ||  oneNum == 117 ||  oneNum == 105)
				System.out.println(one + " is a vowel");
			else
				System.out.println(one + " is a consonant");
		else
			System.out.println(one + " is an invalid input");
    }
}           