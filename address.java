package legato.com.first;

public class address {
private int roadno,streetno;
private String state,dist;
@Override
public String toString() {
	return "address [roadno=" + roadno + ", streetno=" + streetno + ", state=" + state + ", dist=" + dist + "]";
}
public address(int roadno, int streetno, String state, String dist) {
	super();
	this.roadno = roadno;
	this.streetno = streetno;
	this.state = state;
	this.dist = dist;
}

}
