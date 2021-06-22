package assignment;

import java.util.Scanner;

public class Pizza {
	public static void main (String[] agrs) {
		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		double total = 0;
		double tip = 0;
		int keep = 1;
		StringBuilder listMenu = new StringBuilder();
		
		for ( ; keep < 2; keep++) {
			System.out.print("Welcome My Pizza\n1. Pizza\n2. FRESH SALADS\n3. BEVERAGES\nSelect Menu: ");
			int menu = inp.nextInt();
			System.out.print("\n");
		
			switch (menu) {
			case 1:
				System.out.print("----- Pizza ------\nCheese\n1. CHICKEN SPECIAL\n2. CHICKEN DELUXE"
						+ "\n3. CHICKEN DONAIR\n4. SPICY BBQ CHICKEN\nSelect Menu: ");
				int pizza = inp.nextInt();
				if (pizza == 1)
					listMenu.append("CHICKEN SPECIAL PIZZA");
				else if (pizza == 2)
					listMenu.append("CHICKEN DELUXE PIZZA");
				else if (pizza == 3)
					listMenu.append("CHICKEN DONAIR PIZZA");
				else if (pizza == 4)
					listMenu.append("SPICY BBQ CHICKEN PIZZA");
				else {
					System.out.print("\n");
					System.out.print("Please enter proper number");
					System.exit(1);
				}
				System.out.print("\n");
				System.out.print("----- Size ----\n1. Small $10.75 \n2. Medium $12.95\n3. Large $15.25\n"
						+ "4. Family $20.25\nSelect Size: ");
				int size = inp.nextInt();
				if (size == 1) {
					total += 10.75;
					listMenu.append(" (Small) : $10.75\n");
				}
				else if (size == 2) {
					total += 12.95;
					listMenu.append(" (Medium) : $12.95\n");
				}
				else if (size == 3) {
					total += 15.25;
					listMenu.append(" (Large) : $15.25\n");
				}
				else if (size == 4) {
					total += 20.25;
					listMenu.append(" (Family) : $20.25\n");
				}
				else {
					System.out.print("\n");
					System.out.print("Please enter proper number");
					System.exit(1);
				}
				break;
			case 2:
				System.out.print("----- FRESH SALADS ------\n1. CAESAR SALAD $5.95\n2. GARDEN SALAD $4.95\n"
						+ "3. GREEK SALAD $6.95\n4. CHEF SALAD $6.95\nSelect Menu: ");
				int salad = inp.nextInt();
				if (salad == 1) {
					total += 5.95;
					listMenu.append("ROSE PASTA : $5.95\n");
				}
				else if (salad == 2) {
					total += 4.95;
					listMenu.append("GARDEN SALAD : $4.95\n");
				}
				else if (salad == 3) {
					total += 6.95;
					listMenu.append("GREEK SALAD : $6.95\n");
				}
				else if (salad == 4) {
					total += 6.95;
					listMenu.append("CHEF SALAD : $6.95\n");
				}
				else {
					System.out.print("\n");
					System.out.print("Please enter proper number");
					System.exit(1);
				}
				break;
			case 3:
				System.out.print("----- BEVERAGE------\n1. CANNED COKE $1.25\n2. 500ML COKE $2.25\n3. JUICE $2.25\n"
						+ "4. 2L COKE $2.99\nSelect Menu: ");
				int drink = inp.nextInt();
				if (drink == 1) {
					total += 1.23;
					listMenu.append("CANNED COKE : $1.25\n");
				}
				else if (drink == 2) {
					total += 2.25;
					listMenu.append("500ML COKE : $2.25\n");
				}
				else if (drink == 3) {
					total += 2.25;
					listMenu.append("JUICE : $2.25\n");
				}
				else if (drink == 4) {
					total += 2.99;
					listMenu.append("2L COKE : $2.99\n");
				}
				else {
					System.out.print("\n");
					System.out.print("Please enter proper number");
					System.exit(1);
				}
				break;
			default:
				System.out.print("\n");
				System.out.println("Please enter proper number.");
			    System.exit(1);
			}
			System.out.print("\n");
			System.out.print("Do you want to buy another item?\n1. YES\n2. NO\nSelect : ");
			int selectKeep = inp.nextInt();
			if (selectKeep == 1) {
				keep -= 1;
				System.out.print("\n");
			}
		}
		System.out.print("\n");
		System.out.print("----- TIP ------\n1. %\n2. $\n3. None\nSelect Type : ");
		int tipType = inp.nextInt();
		System.out.print("\n");

		switch (tipType) {
		case 1:
			System.out.print("----- TIP (%) ------\n1. 15\n2. 20\n3. 25\n4. Others\nSelect Tip : ");
			int tipPer = inp.nextInt();
			if (tipPer == 1)
				tip = total * 0.15;
			else if (tipPer ==2)
				tip = total * 0.2;
			else if (tipPer == 3)
				tip = total * 0.25;
			else if (tipPer == 4) {
				System.out.print("\n");
				System.out.print("Enter % : ");
				double userTip = inp.nextDouble();
				tip = total * (userTip / 100);
			}
			else {
				System.out.print("\n");
				System.out.print("Please enter proper number");
				System.exit(1);
			}
			break;
		case 2:
			System.out.print("----- TIP ($) ------\nEnter your tip ($) : ");
			double cashTip = inp.nextDouble();
			tip = cashTip;
			break;
		case 3:
			tip = 0;
			break;
		default:
			System.out.print("\n");
			System.out.println("Please enter proper number.");
		    System.exit(1);
		}
		System.out.print("\n");
		double tax = (int)(total * 5.0);
		tip = (int)(tip * 100);
		System.out.print("===============\nEnjoy your meal\n\n" + listMenu.toString() + "\n"
				+ "SUBTOTAL: $" + total + "\nTAX: $" + (tax / 100) + "\nTIP: $" + (tip / 100));
	}
}