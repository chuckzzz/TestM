import java.io.File;

public class TestM3 {

	public static void main(String[] args) {
		System.out.println("a\u0022.length()+\u0022b".length());
		System.out.print("Hell");
		System.out.println("o world");
		System.out.println(TestM2.class.getName().replaceAll("\\.", "/")+".class");
		System.out.println(TestM2.class.getName().replaceAll("\\.", File.separator)+".class");
	}
}
