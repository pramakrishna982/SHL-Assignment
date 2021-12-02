package javafirst;

import java.util.Scanner;

public class NegativeTemp {
	public static int noOfProducts(int[] element) { 
		int count = 0;
		for(int i=0;i<element.length;i++) {
			if(element[i]<0) {
				count++;
			}
		}
		return count;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Tem : ");
		int element_size = sc.nextInt();
		System.out.println("Enter the Temperatures: ");
		int element[]=new int[element_size ];		
		for(int i=0; i<element_size; i++) {
		element[i] = sc.nextInt();
		}
		 int result = noOfProducts(element);
		 
		
		 System.out.println("The Negative temperature : "+result);
	}

}
