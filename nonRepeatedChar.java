package javafirst;

import java.util.Scanner;
public class nonRepeatedChar 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string ");
		String string;
		string = sc.nextLine();
		int arr[]= new int[256];
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
				arr[string.charAt(i)]++;
		}
		char ch= ' ';
		System.out.println("All nonRepeated characters in given string is :");
		for(int i=0; i<string.length();i++) 
		{
			if(arr[string.charAt(i)]==1)
			{
				ch=string.charAt(i);
			System.out.println(ch+" ");
		}
		}
		sc.close();
	}
}


