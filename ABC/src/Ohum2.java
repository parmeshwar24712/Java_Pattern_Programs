import java.util.*;
public class Ohum2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,b=0,count=1,count1=1;
//		System.out.println("Enter array size: ");
//		n=sc.nextInt();
//		int a[]=new int[n];
//		System.out.println("Enter array elements: ");
//		for(int i=0;i<n;i++)
//			a[i]=sc.nextInt();
		int a[]={4,2,4,4,5,4,1,2,4,1};
		n=a.length;
		for(int i=0;i<n;i++)
		{
			count=1;
			for(int j=i;j<n;j++)
			{
				if(a[i]==a[j]&&i!=j)
				{
					count++;
				}
			}
			if(count1<count)
			{
				count1=count;
				b=a[i];
			}
		}
		System.out.println("Person "+b+" is winner!!!");
		int c=n/2;
		if(count1>c)
			System.out.println("Person "+b+" is winner!!!");
		else
			System.out.println("Elected person get less than half of the total voters!!!");
	}
}