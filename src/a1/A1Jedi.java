package a1;

import java.util.Scanner;
import java.util.ArrayList;

public class A1Jedi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		ArrayList<String> items = new ArrayList<String>();
		double[] prices = new double[n];
		for(int i = 0; i < n; i ++) {
			items.add(scan.next());
			prices[i] = scan.nextDouble();
		}
		
		int[] num_customers = new int[n];
		int[] num_purchased = new int[n];
		int people = scan.nextInt();
		for(int i = 0; i < people; i ++) {
			scan.next();
			scan.next();
			boolean[] has_bought = new boolean[n];
			int num_items = scan.nextInt();
			for(int j = 0; j < num_items; j ++) {
				int quan = scan.nextInt();
				String prod = scan.next();
				if(!has_bought[items.indexOf(prod)]) {
					num_customers[items.indexOf(prod)] += 1;
					has_bought[items.indexOf(prod)] = true;
				}
				num_purchased[items.indexOf(prod)] += quan;
			}
		}
		for(int i = 0; i < items.size(); i ++) {
			if(num_customers[i] == 0) {
				System.out.println("No customers bought " + items.get(i));
			}
			else {
				System.out.println(num_customers[i] + " customers bought " + num_purchased[i] + " " + items.get(i));
			}
		}
		scan.close();
	}
}
