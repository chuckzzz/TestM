package more;

public class TestThread2 implements Runnable{

	private String name;
	public TestThread2(String str){
		name = str;
	}
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println(name+"6");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		TestThread2 demo1 = new TestThread2("2");
		TestThread2 demo2 = new TestThread2("3");
		
		Thread wugui=new Thread(demo1);
		Thread tuzi = new Thread(demo2);
		
		tuzi.start();
		
		wugui.start();
		tuzi.join();
		
		
	}

}

