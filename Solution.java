package javafirst;

import java.util.Scanner;

public class Solution {

	private static int noOfElements(int[] element, int num){
		// TODO Auto-generated method stub
		int count =0;
		int no = 0;
		for(int i=0; i<element.length; i++ ) {
			if(element[i]<num) {
				count++;
				no=element[i];
				System.out.println(no);
			}
			
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Ener your Number: ");
		int element_size = in.nextInt();
		int element[]=new int[element_size];
		for(int i = 0;i<element_size; i++)
		{
		element[i] = in.nextInt();
		}
		int num = in.nextInt();
		 int result = noOfElements(element,num);
		 System.out.println("The number of are : "+result);
	}
}
