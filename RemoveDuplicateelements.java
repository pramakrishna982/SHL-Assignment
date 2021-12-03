package javafirst;

import java.util.HashSet;

public class RemoveDuplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet<Integer> set=new HashSet();  

		set.add(1);
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(4);
		for(int i : set)
		System.out.println(i);
	}

}
