package Assignment.third;

import java.util.Scanner;

public class Arraylist {
public static void main(String[] args) {
	Student ss = new Student();
	Scanner ob = new Scanner(System.in);
	ss.setNames();
	ss.setNames();
	ss.setNames();
	ss.setNames();
	System.out.println("enter name to search");
	ss.searchName(ob.next());
	System.out.println("enter index ");
	ss.searchName(ob.nextInt());
	ss.printNames();
	System.out.println("remove name from list");
	ss.removeName(ob.next());
	System.out.println(ss.names);
}
}
