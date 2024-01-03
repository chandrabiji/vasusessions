class Hello {
public void m1(){
System.out.println("from m1");
}
Hello(){
this(10);
System.out.println("Default Constructor");

}
Hello(int i){
System.out.println("Parameterized Constructor");
 }
 public static void main(String[] args){
   Hello h = new Hello();
   System.out.println("Welcome to Core Java");
   h.m1();
 }

}