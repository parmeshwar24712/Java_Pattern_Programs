import java.util.*;
public class Ohum1
{
	public static void main(String[] args)
	{
		//String S="A quick brown fox jumps over the lazy dog";
		String S="A quick brown fox jumps over the dog";	//Missing characters: l y z
		//String S="A quick brown fox jumps over the lazy dog and cat";
		char[] ch=S.toLowerCase().toCharArray();
		final Set set=new HashSet();
		for(char c:ch)
		{
			if(c>=97&&c<=122)
				set.add(c);
		}
		if(set.size()==26)
			System.out.println("String is a Pangram!!!");
		else
			System.out.println("String is not a Pangram!!!");
	
	// Ohum1.main(args);
	}
	 
}