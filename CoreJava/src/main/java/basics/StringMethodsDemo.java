package basics;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String str = "Hyderabad";
		System.out.println("String length = "+str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf("d"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.contains("bad"));
		System.out.println(str.substring(6, 9));
		String str1 = "   hello   ";
		System.out.println(str1);
		System.out.println(str1.trim());
		String s1 = "Hello";
		System.out.println(s1+"       "+s1.hashCode());
		String s2 = "Hello";
		System.out.println(s2+"       "+s2.hashCode());
	    if(s1==s2) {
	    	System.out.println("Same Object");
	    }else {
	    	System.out.println("its different Object");
	    }
	    s1 = s1+ "World";
	    System.out.println(s1+"      "+s1.hashCode());
	    StringBuffer sb = new StringBuffer("Hello");
	    System.out.println(sb+"        "+sb.hashCode());
	    sb.append("World");
	    System.out.println(sb+"        "+sb.hashCode());
	    

	}

}
