
public class TestM1 {
	public static boolean isOdd1(int i) {
		System.out.println((i&1)!=0);
		System.out.println((i%2)!=0);
		System.out.println((i%2)==1);
		return true;
	}
	static int p = -3;
	
	public static void main(String[] args) {
		isOdd1(p);
		
	}
}
