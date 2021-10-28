package homework;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("«Î ‰»ÎƒÍ∑›£∫");
		int x=in.nextInt();
		if(x%4==0 && x%100 !=0 || x%400==0)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
