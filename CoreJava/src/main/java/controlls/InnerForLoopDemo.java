package controlls;

public class InnerForLoopDemo {

	public static void main(String[] args) {
		for(int i=1;i<=3;++i) {
			for(int j=1;j<=10;++j) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}

	}

}
