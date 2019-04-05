package more;



public class TestThread1 extends Thread{

	private String name;
	public TestThread1(String str){
		name=str;
	}
	@Override
	public void run() {
		this.setName(name);
		for(int i=0;i<30;i++){
			System.out.println(this.getName()+":name");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		TestThread1 thread1 = new TestThread1("1");
		TestThread1 thread2 = new TestThread1("2");
//	
		thread1.start();
		thread1.join();
		thread2.start();
	}
} 
