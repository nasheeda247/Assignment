package Assignments;

import java.util.ArrayList;

public class DeriviedDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Derived Data types are classes whereas primitive data types are keywords
		//String is a collection of multiple characters 2bytes(char) * number of charcaters
		//Initializing a class  <==> Class obj = new Class (constructor arguments)
		
		String a = new String("Hello World");
		String b = "Hello World"; //special streaming functionality enables this perspective
		a.equals("Hello World");//methodName(args):output - class
		//Array - []: collection of related data types.{} braces represents a block
		//An array memory cannot be expanded and contracted. Array List is used for that.
		int[] marks = {70,75,80,88,97,50};
		  //OR
		int [] scores = new int[6];
		scores[0]= 70;
		scores[1]=75;
		scores[2]=80;
		scores[3]=88;
		scores[4]=97;
		scores[5]=50;
		System.out.println(scores[3]);
		
		int size = scores.length;
		   //OR
		System.out.println(scores.length);
		
		//Array List
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("name1");
//		names.add("name2");
//		//names.add(0, "name0");
//		names.remove("name2");
//		names.set(1, "names3");
//		System.out.println(names.get(1));
//		System.out.println(names.size());
		//hashmap will deal with key-value pair
		
		
	}

}
