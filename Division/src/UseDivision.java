
public class UseDivision {

	public static void main(String[] args) {
		Division[] divisions = new Division[4];
		divisions[0] = new DomesticDivision("Division1",1,"Nebraska");
		divisions[1] = new DomesticDivision("Division2",2,"Iowa");
		divisions[2] = new InternationalDivision("Division3",3,"Mexico","Spanish");
		divisions[3] = new InternationalDivision("Division4", 4, "China", "Chinese");
		for(int i = 0; i < divisions.length; i++) {
			divisions[i].display();
		}
	}
	
}
