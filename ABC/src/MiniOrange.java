import java.util.Arrays;
import java.util.Scanner;
public class MiniOrange
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,d,ni,nj;
		System.out.println("Enter total number of soldiers: ");
		n=sc.nextInt();
		int A[]=new int[n];
		int B[]=new int[n];
		System.out.println("\nEnter A parameter of  "+n+" soldiers : ");
		for(int i=0;i<n;i++)
			A[i]=sc.nextInt();
		System.out.println("\nEnter B parameter of  "+n+" soldiers : ");
		for(int i=0;i<n;i++)
			B[i]=sc.nextInt();
		System.out.println("\nEnter war days: ");
		d=sc.nextInt();
		for(int i=0;i<d;i++)
		{
			System.out.println("\nEnter soldiers range from 1 to "+n+" for day "+(i+1)+" selection:");
			ni=sc.nextInt();
			nj=sc.nextInt();
		
			int max=A[0];
			for(int  j=ni-1;j<nj;j++)
			{
				if(max<A[j])
					max=A[j];
			}
			duplicate(max,A,B,ni,nj);
		}
	}
	static void duplicate(int p,int A[],int B[],int ni,int nj)
	{
		int c=0,e=0,count=0;
		int min=B[0];
		for(int i=ni-1;i<nj;i++)
		{
			if(p==A[i])
			{
				count++;
				e=i+1;
			}
		}
		if(count==1)
			System.out.println("Soldier "+e+ " selected from "+ni+" to "+nj);
		else
		{
			int C[]=new int[count];
			int j=0;
			for(int i=ni-1;i<nj;i++)
			{
				if(p==A[i])
						C[j++]=B[i];
			}
			Arrays.sort(C);
			c=C[0];
		}
		for(int i=ni;i<nj;i++)
		{
			if(A[i]==p&&B[i]==c)
				System.out.println("Soldier "+(i+1)+ "selected from "+ni+" to "+nj);
		}
	}
}