package legato.com.first;

public class Tostring {
private int empno;
String name;
 address address;
//public int getEmpno() {
//	return empno;
//}
//public void setEmpno(int empno) {
//	this.empno = empno;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public String getAddress() {
//	return address;
//}
//public void setAddress(String address) {
//	this.address = address;
//}
@Override
public String toString() {
	return "Tostring [empno=" + empno + ", name=" + name + ", address=" + address + "]";
}
public Tostring(int empno, String name, address address) {
	super();
	this.empno = empno;
	this.name = name;
	this.address = address;
}

}
