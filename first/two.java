package homework;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		int C=x+y+z;
		float p=(x+y+z)/2;
		float t=p*(p-x)*(p-y)*(p-z);
		float S=(float) Math.sqrt(t);
		System.out.print(C+" "+S+" ");
		if(x*x+y*y==z*z)
			System.out.println("True");
		else if (x*x+z*z==y*y)
			System.out.println("True");
		else if (y*y+z*z==x*x)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
