package basics;
class Car{
	String model;
	int year;
}
enum Days{
	MONDAY,TUESDAY,WEDNESDAY
}
public class PrimitiveDataTypes {

	public static void main(String[] args) {
		//NUmber Data Types
		//byte: 8-bit signed (-128 to +127)
		byte age = 38;
		//short"16-bit (-32768 to 32767)
		short people = 1500;
		//int: 32-bit (-2^63 to 2^32-1)
		int count = 35000;
		//long: 64-bit
		long mobile = 9866037742L;
		//float:32-bit
		float value = 3.14f;
		//double : 64-bit
		double d = 3.141593457533d;
		//Character (16-bit)
		char ch = 'A';
		//Boolean
		boolean bool = true;
		//Non-Primitive DataTypes/Reference Data Types
		//String:Sequence of character
		String str = "Hello World";
		//Arrays:A collection of elements of the same type
		int[] intArray = {1,2,3,4,5};
		//classes and Object
		Car myCar = new Car();
		//Enum:Enumerations are a special type of class that represents a group of constants
	    Days today = Days.WEDNESDAY;
		System.out.println("Age = "+age);

	}

}
