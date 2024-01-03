package oops;
class CentralGovt{
	public void tax() {
		System.out.println("Central Govt Tax");
	}
}
class StateGovt extends CentralGovt{
	public void tax() {
		System.out.println("State Govt Tax + Central Govt Tax");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		CentralGovt cg = new CentralGovt();
		cg.tax();
		CentralGovt cg1 = new StateGovt();
		cg1.tax();

		
	}

}
