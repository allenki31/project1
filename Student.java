package Assignment.third;

import java.util.* ;
import java.util.Scanner;

public class Student {
	ArrayList<String> names = new ArrayList<String>();
	Scanner s = new Scanner(System.in);

	public void setNames( ) 
	{
		System.out.println("enter name");	
		names.add(s.next());



	}

	public void searchName(String stuName ) 
	{
		System.out.println(names.contains(stuName));
	}


	public void searchName(int index) 
	{
		System.out.println(names.get(index));
	}

	public void printNames( ) 
	{
		Iterator itr =names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void removeName( String stuName ) 
	{
		System.out.println(names.remove(stuName));
	}







}

