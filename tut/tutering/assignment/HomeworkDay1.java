package assignment;

public class HomeworkDay1 {
	public static void main (String[] agrs) {
		
		double population = 312032486;
        double sec = 365*24*60*60;
        double plusByYear = (sec / 7) + (sec / 45) - (sec / 13);

        System.out.println ("Population after 1 year: " + (population + plusByYear));
        System.out.println ("Population after 2 years: " + (population + (2 * plusByYear)));
        System.out.println ("Population after 3 years: " + (population + (3 * plusByYear)));
        System.out.println ("Population after 4 years: " + (population + (4 * plusByYear)));
        System.out.println ("Population after 5 years: " + (population + (5 * plusByYear)));
    }
}