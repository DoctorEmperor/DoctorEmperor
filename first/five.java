package homework;

import java.util.Scanner;

public class five {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int n=in.nextInt();
		int sum=0;
		int Sn=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum*10+a;
			Sn+=sum;
				
	    }
		System.out.println(Sn);
	}
}
