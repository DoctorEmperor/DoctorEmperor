package homework;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n=in.nextInt();
		int isprime=1;
		for (int i=2;i<n;i+=1)
		{
			if (n%i==0) 
			{
				isprime=0;
			}
		}
		if(isprime==1) 
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		
	}

}
