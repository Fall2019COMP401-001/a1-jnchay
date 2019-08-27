package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for(int i = 0; i < n; i ++) {
			String first = scan.next();
			String last = scan.next();
			int num_items = scan.nextInt();
			double total = 0.0;
			for(int j = 0; j < num_items; j ++) {
				int quan = scan.nextInt();
				scan.next();
				total += quan*scan.nextDouble();
			}
			String strtotal = String.format("%.2f", total);
			System.out.println(first.charAt(0) + ". " + last + ": " + strtotal);
		}
		scan.close();
	}
}
