package assignment;

import java.util.Scanner;

public class Temp {
	public static void main (String[] agrs) {
	    Scanner inp = new Scanner(System.in);
	    String s1 = inp.next();
        String s2 = inp.next();
        System.out.println(s1.length() + s2.length());
        String s3 = (s1.compareTo(s2) <= 0) ? "No" : "Yes";
        System.out.println(s3);
        
        String str1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String str2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        System.out.println(str1 + " " + str2);
        inp.close();
	}
}