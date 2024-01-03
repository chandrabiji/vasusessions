package oops;
abstract class Bike{
	public void color() {
		System.out.println("Bike color is blue");
	}
	public abstract void run();
}
class ActiveHonda extends Bike{
	public void run() {
		System.out.println("Good at Hyderabad Roads");
	}
}
class FZ extends Bike{
	public void run() {
		System.out.println("Feel like sports Bike");
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		ActiveHonda ah = new ActiveHonda();
		ah.color();
		ah.run();
		Bike fz = new FZ();
		fz.color();
		fz.run();

	}

}
