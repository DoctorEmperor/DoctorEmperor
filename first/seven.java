package homework;

import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个日期：");
		int y=in.nextInt();
		int m=in.nextInt();
		int d=in.nextInt();
		int sum=0;
		int S[]= {1,3,5,7,8,10,12};
		int T[]= {4,6,9,11};
		for(int i=2000;i<y;i++)
		{
			if(i%4==0 && i%100 !=0 || i%400==0)
				sum+=366;
			else
				sum+=365;
		}
		for(int j=1;j<m;j++)
		{
			for(int k=0;k<S.length;k++)
			{
				if(j==S[k])
				{
					sum+=31;
				}
			}
			for(int k=0;k<T.length;k++)
			{
				if(j==T[k])
				{
					sum+=30;
				}
			}
			if(j==2)
			{
				if(y%4==0 && y%100 !=0 || y%400==0)
			
					sum+=29;
				else
					sum+=28;
			}	
		}
		sum+=d;
		System.out.println(sum);
	}

}
