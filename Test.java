package legato.com.first;

public class Test {
public static void main(String[] args) {
	address s=new address(1,20,"karnataka","bangalore");
	address s1=new address(2,30,"karnataka","bangalore");
	address s2=new address(3,30,"karnataka","bangalore");
	
	
	Tostring s3=new Tostring(123,"vinay",s);
	Tostring s4=new Tostring(456,"vamshi",s1);
	Tostring s5=new Tostring(789,"vijy",s2);
	
	
	
	
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
}
}
