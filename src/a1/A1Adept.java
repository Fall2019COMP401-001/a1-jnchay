package a1;

import java.util.Scanner;
import java.util.ArrayList;

public class A1Adept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		ArrayList<String> items = new ArrayList<String>();
		double[] prices = new double[n];
		for(int i = 0; i < n; i ++) {
			items.add(scan.next());
			prices[i] = scan.nextDouble();
		}
		double max = 0.0;
		String max_f = "";
		String max_l = "";
		double min = 10000000.0;
		String min_f = "";
		String min_l = "";
		double all_spent = 0.0;
		int people = scan.nextInt();
		for(int i = 0; i < people; i ++) {
			String first = scan.next();
			String last = scan.next();
			int num_items = scan.nextInt();
			double spent = 0.0;
			for(int j = 0; j < num_items; j ++) {
				int quan = scan.nextInt();
				String prod = scan.next();
				spent += quan*prices[items.indexOf(prod)];
			}
			all_spent += spent;
			if(spent >= max) {
				max = spent;
				max_f = first;
				max_l = last;
			}
			if(spent <= min){
				min = spent;
				min_f = first;
				min_l = last;
			}
		}
		double average = all_spent/people;
		String straverage = String.format("%.2f", average);
		String strmax = String.format("%.2f", max);
		String strmin = String.format("%.2f", min);
		System.out.println("Biggest: " + max_f + " " + max_l + " " + "(" + strmax + ")");
		System.out.println("Smallest: " + min_f + " " + min_l + " " + "(" + strmin + ")");
		System.out.println("Average: " + straverage);
		scan.close();
	}
}
