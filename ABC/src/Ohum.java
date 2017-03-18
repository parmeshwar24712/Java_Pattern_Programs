import java.util.*;
public class Ohum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements do you want to enter: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int min=99999999,max=0;
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		if(max%min==0)
			System.out.println("Min%Max==0");
		else
			System.out.println("Min%Max!=0");
	}
}